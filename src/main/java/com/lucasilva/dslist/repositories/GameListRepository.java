package com.lucasilva.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasilva.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
