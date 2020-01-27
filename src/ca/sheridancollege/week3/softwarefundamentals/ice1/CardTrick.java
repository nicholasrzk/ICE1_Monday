/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import ca.sheridancollege.week3.softwarefundamentals.ice1.Card;
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
        
        for (int x=0; x<magicHand.length; x++)
        {
            Card c = new Card();
            c.setSuit(Card.SUITS[c.randomSuit()]);
            c.setValue(c.randomNum());
            magicHand[x] = c;
            
            System.out.println(magicHand[x].getSuit() + "   " + magicHand[x].getValue());
        }
        
        Scanner k = new Scanner(System.in);
        System.out.println("Please enter a suit (Diamonds, Hearts, Clubs, or Spades): ");
        String theSuit = k.next();
        System.out.println("Please enter a card value (1-13): ");
        int theNum = k.nextInt();
        System.out.println("Your Card is #: " + theNum + " and Suit: " + theSuit);
        
        boolean answer = false;
        for (int y= 0; y<magicHand.length; y++)
        {
           if (theSuit.equalsIgnoreCase(magicHand[y].getSuit())){
               if (theNum == magicHand[y].getValue()){
                   answer = true;
               }
           }
        }
        
        if (answer == true){
            System.out.println("Your card is in the deck!");}
        else{
            System.out.println("Your card was not found");
            }
        }
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here to find matching card is in array or not
        //Then report the result here
    
    
}
