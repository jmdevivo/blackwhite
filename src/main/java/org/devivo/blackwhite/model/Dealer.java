package org.devivo.blackwhite.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dealer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public List<Integer> prizeCardsRemaining;
    public Integer prizeCard;

    protected Dealer() {}

    public Dealer(List<Integer> prizeCardsRemaining, Integer prizeCard){
        this.prizeCardsRemaining = prizeCardsRemaining;
        this.prizeCard = prizeCard;
    }

    public List<Integer> getPrizeCardsRemaining(){
        return prizeCardsRemaining;
    }

    public Integer getPrizeCard(){
        return prizeCard;
    }
}