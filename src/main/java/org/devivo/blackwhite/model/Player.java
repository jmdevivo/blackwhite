package org.devivo.blackwhite.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Player{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 

    public List<Integer> blackCardsRemaining;
    public List<Integer> whiteCardsRemaining;
    public Integer points;
    public Integer blackCard;
    public Integer whiteCard;

    protected Player() {}

    public Player(List<Integer> blackCardsRemaining, List<Integer> whiteCardsRemaining, 
            Integer points, Integer whiteCard, Integer blackCard){
        this.blackCardsRemaining = blackCardsRemaining;
        this.whiteCardsRemaining = whiteCardsRemaining;
        this.points = points;
        this.blackCard = blackCard;
        this.whiteCard = whiteCard;
    }

    public List<Integer> getBlackCardsRemaining(){
        return blackCardsRemaining;
    }

    public List<Integer> getWhiteCardsRemaining(){
        return whiteCardsRemaining;
    }

    public Integer getPoints(){
        return points;
    }

    public Integer getBlackCard(){
        return blackCard;
    }

    public Integer getWhiteCard(){
        return whiteCard;
    }

}