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
        Scanner inp=new Scanner(System.in);
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setValue(c.genValue());
            c.setSuit(c.genSuit());
            System.out.println(c.getSuit() + " " + c.getValue());
            magicHand[i]=c;
        }
        System.out.println("Enter the suit:");
        String suit=inp.next();
        System.out.println("Enter the value:");
        int value=inp.nextInt();
       for(int i=0; i<magicHand.length;i++)
       {
        if(suit.equals(magicHand[i].getSuit())&& value==(magicHand[i].getValue())) 
        System.out.println("Your card is in the suit");
        else
            System.out.println("Card not found");
       }
       
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here to find matching card is in array or not
        //Then report the result here
    }
    
}
