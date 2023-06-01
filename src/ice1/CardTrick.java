/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ice1;

import java.util.Random;
import java.util.Scanner;

/**A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author Megha Patel,2023
 * @modifier Prabhnoor Grewal, 1 June 2023
 */
public class CardTrick {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        
        for(int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            
            Random r = new Random();
            c.setValue(r.nextInt(13) + 1);
            c.setSuit(Card.SUITS[r.nextInt(4)]);
            magicHand[i] = c;
           
        }
        
        Card luckyNumber= new Card();
        luckyNumber.setValue(10);
        luckyNumber.setSuit("Hearts");
        
       
       Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of the card from 1 to 13): ");
        int value = s.nextInt();
        s.nextLine();

        System.out.print("Enter the suit of the card (Clubs, Hearts, Spades, Diamonds): ");
        String suit = s.nextLine();
        
        Card selected = new Card();
        selected.setValue(value);
        selected.setSuit(suit);

        boolean matched = false;
        for (Card c : magicHand) {
            if (c.equals(selected)) {
                matched = true;
                break;
            }
        }

        if (matched) {
            System.out.println("Your card is in list.");
        } else {
            System.out.println("Your card is not in list.");
        }

             if (luckyNumber.equals(selected)) {
            System.out.println("You win");
        } else {
            System.out.println("You lost.");
             }

           
  
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }


