/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;

/**
 * A class that models playing card Objects. Cards have 
 * a value (note that Ace = 1, Jack -11, Queen =12, King = 13)
 * A suit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers.
 * This code is to be used in ICE1. When you create your own branch,
 * add your name as a modifier.
 * @author srinivsi
 */
public class Card {

   private String suit; //clubs, spades, diamonds, hearts
   private int value;//1-13

   public static final String [] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};
    
    public String getSuit() {
        return suit;
    }

   
    public void setSuit(String suit) {
        this.suit = suit;
    }

  
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
   // insert two methods to generate random value and suit here
  public String Suits(){
       int rnd=new Random().nextInt();
       String[] Suits = null;
       return Suits[rnd];
      
  } 
  public int generateValue(){
      Random rn=new Random();
      int answer=rn.nextInt(13)+1;
       return answer;
  }
    public static boolean checkAvailable(Card[] cards,Card usercard ){
        for(Card p: cards){
            if(p.suit.equals(usercard.suit)&& p.value==usercard.value){
                return true;
            }
        }
       return false;
    }
}
