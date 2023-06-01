/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ice1;

import java.util.Scanner;

/**A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author Megha Patel,2023
 * @modifier Jainil Ashishkumar patel
 * @ID: 991664020
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
            c.setValue( (int) (Math.random() *13) +1);
            c.setSuit(Card.SUITS[(int) (Math.random() * 4)]);
            magicHand[i] = c;           
        }
            
           
        Scanner k = new Scanner(System.in);
         System.out.print("Enter the cards from the deck ");
        int userValue = k.nextInt();
        System.out.print("Enter the card suit: ");
        String userSuit = k.next();
        
        Card UC = new Card();
        UC.setValue(userValue);
        UC.setSuit(userSuit);
        
        boolean iscdfound = false;
        for (Card crd : magicHand) {
            if (crd.equals(UC)) {
                iscdfound = true;
                break;     
        }

        }
        if (iscdfound) {
            System.out.println("The card is in the magic hand.");
        } else {
            System.out.println("The card is not in the magic hand."); 
        }
        System.out.println("Magic Hand Cards:");
        for (Card card : magicHand) {
            System.out.println(card.getValue() + " of " + card.getSuit());
        }        
    }    
}
