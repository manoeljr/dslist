package com.devsuperior.sdlist.controllers;

import com.devsuperior.sdlist.dto.GameDTO;
import com.devsuperior.sdlist.dto.GameListDTO;
import com.devsuperior.sdlist.dto.GameMinDTO;
import com.devsuperior.sdlist.services.game.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    private GameService service;

    @GetMapping
    public ResponseEntity<List<GameMinDTO>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<GameDTO> findById(@PathVariable Long id) {
        GameDTO result = service.findById(id);
        if (result != null) {
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.notFound().build();
    }

}
