package com.lucasilva.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucasilva.dslist.dto.GameMinDTO;
import com.lucasilva.dslist.entities.Game;
import com.lucasilva.dslist.repositories.GameRepository;

@Service
public class GameService {

   @Autowired
	private GameRepository gameRepository;
   
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		return  result.stream().map(x -> new GameMinDTO(x)).toList();
	
	}
}
