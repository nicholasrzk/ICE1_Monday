/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
           c.setValue(c.RandomValue());
           c.setSuit(c.RandomSuit());
           magicHand[i]=c;
            System.out.println(c.getSuit()+"");
            System.out.println(c.getValue());
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        for(Card magicHand1:magicHand){
        
            System.out.println(magicHand1.getSuit()+""+magicHand1.getValue());
        }
        System.out.println("Enter Any card Name!");
        String n = sc.next();
        System.out.println("Enter Any Number!");
        int num = sc.nextInt();
        

        boolean Ans= false;

        for (int j = 0; j < magicHand.length; j++) {
            if (n.equalsIgnoreCase(magicHand[j].getSuit())) {
                if (num == magicHand[j].getValue()) {
                    Ans = true;
                }
            
                }
            }
        
        if (Ans == true) {
            System.out.println("Your Choice of Card was in the magic hand of random cards!");
        } else {
            System.out.println("Your Choice of card was not in the the magic hand of random cards!");
        }
    }
     
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here to find matching card is in array or not
        //Then report the result here
    }
    
