// Deck.java
import java.util.*;

public class Deck {
    private ArrayList<Card> deck;
    private String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", 
                              "Jack", "Queen", "King", "Ace"};

    // Constructor to create a deck of 52 cards
    public Deck() {
        createDeck();
    }

    // Method to create deck
    public void createDeck() {
        deck = new ArrayList<>();
        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(new Card(suit, rank));
            }
        }
    }

    // Print all cards in the deck
    public void printDeck() {
        for (Card card : deck) {
            card.printCard();
        }
    }

    // Shuffle the deck randomly
    public void shuffleDeck() {
        Collections.shuffle(deck);
        System.out.println("Deck shuffled successfully!");
    }
}