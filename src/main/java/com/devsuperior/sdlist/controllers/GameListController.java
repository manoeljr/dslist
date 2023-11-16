package com.devsuperior.sdlist.controllers;


import com.devsuperior.sdlist.dto.GameListDTO;
import com.devsuperior.sdlist.services.gamelist.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lists")
public class GameListController {

    @Autowired
    private GameListService service;

    @GetMapping
    public ResponseEntity<List<GameListDTO>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }
}
