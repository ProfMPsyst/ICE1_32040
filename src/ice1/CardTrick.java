/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ice1;

/**A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author Megha Patel,2023
 * @author Prabhpreet Kaur 01 June,2023
 * Student id: 991716241
 */

import java.util.*;
public class CardTrick {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Scanner input = new Scanner (System.in);
        
        for(int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int) (Math.random()*(13) + 1));
            c.setSuit(Card.SUITS[(int) (Math.random()*(4))]);
            
        }
        
        //insert code to ask the user for Card value and suit, create their card
       /*System.out.print("Pick a card (any card): ");
        int num = input.nextInt();
        */
        
        Card luckyCard = new Card();
        luckyCard.setValue(2);
        luckyCard.setSuit("Ace");
        
        // and search magicHand here
        //Then report the result here
        for(int i=0; i<magicHand.length; i++){
            if(magicHand[i] = 2 || magicHand[i].equals("Ace"))
                System.out.println("You Win");
            else
                System.out.println("You lose");
        }
        
        
        
    }

}
