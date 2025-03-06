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
}