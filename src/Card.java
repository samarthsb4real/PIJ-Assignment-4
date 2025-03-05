/**
 * Name: Samarth Sandesh Bhadane
 * PRN: 123456789
 * Batch: A
 */

 public class Card {
    private String suit;
    private String rank;

    // Constructor to initialize card properties
    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    // Getters for Suit and Rank
    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    // Print the card details
    public void printCard() {
        System.out.println(rank + " of " + suit);
    }
}