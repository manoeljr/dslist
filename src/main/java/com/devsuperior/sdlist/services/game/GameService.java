package com.devsuperior.sdlist.services.game;

import com.devsuperior.sdlist.dto.GameDTO;
import com.devsuperior.sdlist.dto.GameMinDTO;

import java.util.List;

public interface GameService {
    public List<GameMinDTO> findAll();
    public GameDTO findById(Long id);
    public List<GameMinDTO> findByList(Long id);
}
