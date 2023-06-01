/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ice1;

import java.util.*;

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
            
            magicHand[i] = c;

        }
        
        //insert code to ask the user for Card value and suit, create their card
        int cardvalue = scanner.nextInt();
        System.out.println("enter suite value (Hearts, Diamonds, Clubs, Spades) : ");
        String cardsuite = scanner.next();

        // and search magicHand here
         Card user = new Card();
        user.setSuit(cardsuite);
        user.setValue(cardvalue);
        
        //Then report the result here
        boolean inp = false;
        for(Card card : magicHand){
            if(card.equals(user))
            {
                inp = true;
                
            }
        }
        if(inp){
            System.out.println("your card is the magic hand.....");
        }
        else{
            System.out.println("your card is not magic hand.....");
        }
    }
}
