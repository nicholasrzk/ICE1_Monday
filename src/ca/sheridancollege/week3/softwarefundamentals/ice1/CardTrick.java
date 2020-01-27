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
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(c.randomValueGenerator());
            c.setSuit(Card.SUITS[c.randomSuitGenerator()]);
            magicHand[i] = c;
        }
        
        String suit;
        int value;
        for (Card magicHand1 : magicHand) {
            System.out.println("Suit 1:" + magicHand1.getSuit() + "\tValue 1:" + magicHand1.getValue());
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("\nEnter suit:");
        suit = scan.nextLine();
        System.out.println("Enter the value");
        value = scan.nextInt();
        int validate =0;
        for (Card magicHand1 : magicHand) {
            if ((magicHand1.getSuit().equalsIgnoreCase(suit)) && (magicHand1.getValue() == value)) {
                 validate = 1;
            } 
        }
        if(validate == 1)
            System.out.println("your data exists in the array");
        else
            System.out.println("your data doesnot exist in the array");
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here to find matching card is in array or not
        //Then report the result here
    }
    
}

