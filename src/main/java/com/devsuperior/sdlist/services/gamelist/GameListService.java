package com.devsuperior.sdlist.services.gamelist;

import com.devsuperior.sdlist.dto.GameListDTO;

import java.util.List;

public interface GameListService {
    public List<GameListDTO> findAll();
}
