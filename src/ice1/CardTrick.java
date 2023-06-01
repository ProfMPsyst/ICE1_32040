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
 * @modifier Jashanpreet Saini(saijasha) 991669648
 */
public class CardTrick {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Random random = new Random();
        Scanner s = new Scanner(System.in);
        
        // hard coding luckycard card object
        Card luckyCard = new Card();
        luckyCard.setValue = 5;
        luckyCard.setSuit = "hearts"

        for (int i = 0; i < magicHand.length; i++) {
            magicHand[i] = new Card();
            int value = 1 + random.nextInt(13);
            int suit = random.nextInt(4);
            magicHand[i].setValue(value);
            magicHand[i].setSuit(Card.SUITS[suit]);
        }
        
        /*System.out.print("Enter Suite - \"Hearts\", \"Diamonds\", \"Spades\", \"Clubs\": ");
        String suite = s.nextLine();
        
        System.out.print("Enter card value: ");
        int value = s.nextInt();
        
        for (int i = 0; i < magicHand.length; i++){
            if (magicHand[i].getValue() == value && magicHand[i].getSuit() == suite.toLowerCase()) {
                System.out.println("Congrats you guessed correctly");
                break;
            } */
        
        for (int i = 0; i < magicHand.length; i++) {
            if (magicHand[i].getValue() == luckyCard.getValue && magicHand[i].getSuit() == luckyCard.getSuit)
                System.out.println("Congrats you guessed correctly");
        }
        
        }
        
    }

}
