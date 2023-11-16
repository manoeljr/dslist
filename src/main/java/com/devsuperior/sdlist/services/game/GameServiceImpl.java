package com.devsuperior.sdlist.services.game;

import com.devsuperior.sdlist.dto.GameDTO;
import com.devsuperior.sdlist.dto.GameMinDTO;
import com.devsuperior.sdlist.entities.Game;
import com.devsuperior.sdlist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class GameServiceImpl implements GameService {

    @Autowired
    private GameRepository repository;

    @Override
    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        return repository.findAll()
                .stream()
                .map(x -> new GameMinDTO(x.getId(), x.getTitle(), x.getYear(), x.getImgUrl(), x.getShortDescription()))
                .toList();
    }

    @Override
    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        Game result = repository.findById(id).orElse(null);
        if (result != null) {
            return new GameDTO(
                    result.getId(),
                    result.getTitle(),
                    result.getYear(),
                    result.getGenre(),
                    result.getPlatforms(),
                    result.getScore(),
                    result.getImgUrl(),
                    result.getShortDescription(),
                    result.getLongDescription()
            );
        }
        return null;
    }

}
