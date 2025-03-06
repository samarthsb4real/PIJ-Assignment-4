# Card Deck Application

This is a simple Java application that simulates a deck of cards. The application allows users to print the deck, shuffle the deck, search for a specific card, and deal 5 random cards.

### Card

The `Card` class represents a single card in the deck. It has the following properties and methods:

- `String suit`: The suit of the card (Hearts, Diamonds, Clubs, Spades).
- `String rank`: The rank of the card (2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King, Ace).
- `Card(String suit, String rank)`: Constructor to initialize card properties.
- `String getSuit()`: Returns the suit of the card.
- `String getRank()`: Returns the rank of the card.
- `void printCard()`: Prints the card details.
- `boolean sameCard(Card other)`: Checks if two cards belong to the same suit.
- `boolean compareCard(Card other)`: Checks if two cards have the same rank.
- `boolean isEqual(Card other)`: Checks if a given card matches this card.

### Deck

The `Deck` class represents a deck of 52 cards. It has the following properties and methods:

- `ArrayList<Card> deck`: The list of cards in the deck.
- `String[] suits`: The array of suits.
- `String[] ranks`: The array of ranks.
- `Deck()`: Constructor to create a deck of 52 cards.
- `void createDeck()`: Method to create the deck.
- `void printDeck()`: Prints all cards in the deck.
- `void shuffleDeck()`: Shuffles the deck randomly.
- `int findCard(String suit, String rank)`: Searches for a specific card and returns its index position.
- `void dealCard()`: Deals 5 random cards.

### Main

The `Main` class contains the main method and provides a menu-driven interface for the user to interact with the deck of cards.

## How to Run

1. Compile the Java files:
    ```sh
    javac src/*.java
    ```

2. Run the application:
    ```sh
    java src/Main
    ```

## Menu Options

1. **Print Deck**: Prints all the cards in the deck.
2. **Shuffle Deck**: Shuffles the deck randomly.
3. **Search for a Card**: Searches for a specific card by suit and rank.
4. **Deal 5 Cards**: Deals 5 random cards from the deck.
5. **Exit**: Exits the application.

## Author

- **Samarth Sandesh Bhadane**
- **PRN: 123456789**
- **Batch: A2**