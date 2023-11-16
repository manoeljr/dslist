package com.devsuperior.sdlist.services.game;

import com.devsuperior.sdlist.dto.GameMinDTO;
import com.devsuperior.sdlist.entities.Game;
import com.devsuperior.sdlist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GameServiceImpl implements GameService {

    @Autowired
    private GameRepository repository;

    @Override
    public List<GameMinDTO> findAll() {
        return repository.findAll()
                .stream()
                .map(x -> new GameMinDTO(x.getId(), x.getTitle(), x.getYear(), x.getImgUrl(), x.getShortDescription()))
                .toList();
    }

    @Override
    public Game addGame(Game newGame) {
        return null;
    }
}
