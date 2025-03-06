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

    // Search for a specific card and return its index position
    public int findCard(String suit, String rank) {
        for (int i = 0; i < deck.size(); i++) {
            Card card = deck.get(i);
            if (card.getSuit().equalsIgnoreCase(suit) && card.getRank().equalsIgnoreCase(rank)) {
                System.out.println("Card found at index: " + i);
                return i;
            }
        }
    System.out.println("Card not found.");
    return -1;
}


    // Deal 5 random cards
    public void dealCard() {
        shuffleDeck();
        System.out.println("Dealing 5 random cards:");
        for (int i = 0; i < 5; i++) {
            deck.get(i).printCard();
        }
    }
}