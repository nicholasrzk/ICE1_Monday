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
        Scanner input = new Scanner(System.in);
        
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setValue(c.randomValue());
            c.setSuit(c.randomSuit());
            magicHand[i] = c;
            System.out.print(c.getSuit() + " ");
            System.out.println(c.getValue());

        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here to find matching card is in array or not
        //Then report the result here
        
        for (Card magicHand1 : magicHand) {
            System.out.println(magicHand1.getSuit() + " " + magicHand1.getValue());
        }
        
        System.out.print("Please enter any card Name: ");
        String name = input.next();
        System.out.print("Please enter any number: ");
        int num = input.nextInt();
        
        boolean hand = false;
        
        for (int x = 0; x < magicHand.length; x++) 
        {
            if (name.equalsIgnoreCase(magicHand[x].getSuit())) 
            {
                if (num == magicHand[x].getValue()) 
                {
                    hand = true;
                }
            }
        }
        
        if (hand == true) 
        {
            System.out.println("Your card was in the the magic hand");
        } else 
        {
            System.out.println("Your card was not in the the magic hand");
        }
    }





        
        

        
        
    }
    

