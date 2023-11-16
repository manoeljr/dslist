package com.devsuperior.sdlist.services.gamelist;

import com.devsuperior.sdlist.dto.GameListDTO;
import com.devsuperior.sdlist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class GameListServiceImpl implements GameListService {

    @Autowired
    private GameListRepository repository;

    @Override
    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        return repository.findAll().stream().map(x -> new GameListDTO(x.getId(), x.getName())).toList();
    }
}
