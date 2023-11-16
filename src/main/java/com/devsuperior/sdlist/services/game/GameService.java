package com.devsuperior.sdlist.services.game;

import com.devsuperior.sdlist.dto.GameMinDTO;
import com.devsuperior.sdlist.entities.Game;

import java.util.List;

public interface GameService {
    public List<GameMinDTO> findAll();
    public Game addGame(Game newGame);
}
