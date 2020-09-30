package org.devivo.blackwhite.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Turn{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Player playerOne;
    private Player playerTwo;
    private Dealer dealer;

    protected Turn(){}

    public Turn(Player playerOne, Player playerTwo, Dealer dealer){
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.dealer = dealer;
    }

    public Long getId(){
        return id;
    }

    public Player getPlayerOne(){
        return playerOne;
    }

    public Player getPlayerTwo(){
        return playerTwo;
    }

    public Dealer getDealer(){
        return dealer;
    }


}