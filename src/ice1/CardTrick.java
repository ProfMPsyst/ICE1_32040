/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ice1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author Megha Patel,2023
 * @modifier Jennifer Tailor, 2023
 * Student ID Number: 991680304
 */

public class CardTrick {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        
        Random random = new Random();
        for(int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
             c.setValue(random.nextInt(13));
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            int SUITs = random.nextInt(4);
            c.setSuit(Card.SUITS[SUITs]);
        }
        
        Scanner scanner = new Scanner(System.in);
        
        //insert code to ask the user for Card value and suit, create their card
          System.out.print("Enter the card value: ");
           int value = scanner.nextInt();
           scanner.nextLine();
        
         System.out.print("Enter the card suit: ");
         String suit = scanner.nextLine();
        
        Card userCard = new Card();
        userCard.setValue(value);
        userCard.setSuit(suit);

        // and search magicHand here
          boolean found = false;
        for (Card card : magicHand) {
            if (card.equals(userCard)) {
                found = true;
                break;
            }
        }
        //Then report the result here
        if (found) {
            System.out.println("Your card is in the magic hand!");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");    
        }
    }
}
