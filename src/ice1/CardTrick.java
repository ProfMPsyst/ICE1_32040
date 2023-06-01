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
 * @modifier Sukhdeep Badhan id = 991706845
 * @author Megha Patel,2023
 */



public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        
        for(int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(generateRandomNumber());
            c.setSuit(Card.SUITS[generateRandomNumber(0, 3)]);
            magicHand[i] = c;
        }
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your card value (1-13): ");
        int userValue = scanner.nextInt();
        
        System.out.print("Enter your card suit (0-3): ");
        int userSuit = scanner.nextInt();
        
        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(Card.SUITS[userSuit]);
        
        boolean found = false;
        for (Card card : magicHand) {
            if (card.getValue() == userCard.getValue() && card.getSuit().equals(userCard.getSuit())) {
                found = true;
                break;
            }
        }
        
        if (found) {
            System.out.println("Congratulations! Your card is in the magic hand.");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }
    }
    
    private static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(13) + 1;
    }
    
    private static int generateRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}




 class Card {
    private String suit; // clubs, spades, diamonds, hearts
    private int value; // 1-13

    public static final String[] SUITS = { "Hearts", "Diamonds", "Spades", "Clubs" };

    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * Generates a random card.
     */
    public static Card generateRandomCard() {
        Random random = new Random();
        Card card = new Card();
        card.setValue(random.nextInt(13) + 1);
        card.setSuit(SUITS[random.nextInt(4)]);
        return card;
    }
}
