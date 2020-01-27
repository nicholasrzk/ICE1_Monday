//Abdelrahman Mohamed
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
            c.setSuit(c.genrateSuite());
            c.setValue(c.genrateCard());
        }

        System.out.println("Please enter value");
        int val = input.nextInt();

        System.out.println("please enter number");
        String num = input.nextLine();


        Card user = new Card();

        user.setValue(val);
        user.setSuit(num);






        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here to find matching card is in array or not
        //Then report the result here
    }

}
