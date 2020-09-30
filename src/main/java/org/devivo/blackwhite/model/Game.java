package org.devivo.blackwhite.model;



import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public List<Turn> turns;
    public Integer winner;

    protected Game() {}

    public Game(List<Turn> turns, Integer winner){
        this.turns = turns;
        this.winner = winner;
    }

    public getTurns(){
        return turns;
    }

    public getWinner(){
        return winner;
    }

}