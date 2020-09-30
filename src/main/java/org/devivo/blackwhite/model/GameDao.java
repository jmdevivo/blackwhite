package org.devivo.blackwhite.model;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface GameDao extends CrudRepository<Game, Long> {
    List<Game> findByLastName(String lastName);
    
    Game findById(long id);
    
}
