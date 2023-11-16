package com.devsuperior.sdlist.controllers;


import com.devsuperior.sdlist.dto.GameListDTO;
import com.devsuperior.sdlist.dto.GameMinDTO;
import com.devsuperior.sdlist.services.game.GameService;
import com.devsuperior.sdlist.services.gamelist.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lists")
public class GameListController {

    @Autowired
    private GameListService service;

    @Autowired
    private GameService gameService;

    @GetMapping
    public ResponseEntity<List<GameListDTO>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}/games")
    public ResponseEntity<List<GameMinDTO>> findByList(@PathVariable Long id) {
        List<GameMinDTO> result = gameService.findByList(id);
        if (result != null) {
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.notFound().build();
    }
}
