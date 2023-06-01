package ice1;

import java.util.Scanner;

/**
 * 
 * Modifier: Laksh Kundnani
 * Student Number: 991703921
 * 
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card card = new Card();
            card.setValue(rand());
            card.setSuit(randsuit());
            magicHand[i] = card;
        }
        
        Card luckyCard = new Card();
        luckyCard.setValue(7);
        luckyCard.setSuit("Spades");

        Scanner sc = new Scanner(System.in);
        System.out.print("Pick a card (1-13): ");
        int userValue = sc.nextInt();
        System.out.print("Enter the suit of your card (Hearts, Diamonds, Spades, Clubs): ");
        String userSuit = sc.next();

        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);

        boolean win = false;
        for (Card card : magicHand) {
            if (card.getValue() == userCard.getValue() && card.getSuit().equalsIgnoreCase(userCard.getSuit())) {
                win = true;
                break;
            }
        }

        if (win) {
            System.out.println("Hurrah, Your Card was in the Magic Hand!!!");
        } else {
            System.out.println("Oops, Your Card was not in the Magic Hand!!!");
        }  

        if (luckyCard.getValue() == userCard.getValue() && luckyCard.getSuit().equalsIgnoreCase(userCard.getSuit())) {
            System.out.println("You also picked the lucky card!");
        }
    }

    private static int rand() {
        return (int) (Math.random() * 13) + 1;
    }

    private static String randsuit() {
        String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
        int index = (int) (Math.random() * 4);
        return suits[index];
    }
}
