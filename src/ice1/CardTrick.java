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
 * @modifier Neha
 * @author Megha Patel,2023
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
            Random rand = new Random();
            c.setValue(rand.nextInt(13) + 1); 
            c.setSuit(Card.SUITS[rand.nextInt(4)]); 
            magicHand[i] = c;
        }
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value of Card");
        int userValue = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        System.out.print("Enter card suit (Hearts, Diamonds, Clubs, Spades): ");
        String userSuit = sc.nextLine();
        //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        Card c = new Card ();
        c.setValue(userValue);
        c.setSuit(userSuit);
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        boolean foundMatch = true;
        for (Card card : magicHand) {
            if (card.equals(c)) {
                foundMatch = false;
                break;
            }
        }
        if (foundMatch) {
            System.out.println("Congrats! Your card is in the magicHand.");
        } else {
            System.out.println("Sorry! Your card is not in the magicHand.");
        }
        
            
        }
        
        
    }


