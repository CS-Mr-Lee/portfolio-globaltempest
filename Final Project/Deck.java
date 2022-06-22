import java.util.ArrayList;
import java.util.Random;

/**
 * Name: Eric Wang
 * Class: ICS-4U1
 * Date: 2022-06-22
 * Description: Creates ArrayList of Cards to make a deck of cards, and can get a random card from the deck
 */

public class Deck {

    /*Attributes*/
    /** The deck that contains the cards*/
    private ArrayList<Card> deck = new ArrayList<>();

    /*Constructor*/
    /** Creates a deck */
    public Deck() {

        //fixed array of face card names
        String[] arr = {"JACK", "QUEEN", "KING"};

        //loop to get all suits of cards from 2 to 10
        for (int i = 2; i <= 10; i ++) {
            deck.add(new Card('H', i, Integer.toString(i)));
            deck.add((new Card('C', i, Integer.toString(i))));
            deck.add(new Card('S', i, Integer.toString(i)));
            deck.add(new Card('D', i, Integer.toString(i)));
        }

        //loop to get all suits of face cards
        for (int i = 0; i < 3; i ++) {
            deck.add(new Card('H', 10, arr[i]));
            deck.add(new Card('C', 10, arr[i]));
            deck.add(new Card('S', 10, arr[i]));
            deck.add(new Card('D', 10, arr[i]));
        }

        //get all suit of ace cards
        deck.add(new Card('H', 1, "ACE"));
        deck.add((new Card('C', 1, "ACE")));
        deck.add(new Card('S', 1, "ACE"));
        deck.add(new Card('D', 1, "ACE"));

    }

    /*Other methods*/
    /** gets a random number within the size of the deck at this instance
     * chooses a card at this random index number
     * removes the card from the deck
     * @return the random card picked, or null if deck is empty
     */
    public Card getRandCard() {
        Random rand = new Random();
        //random number in the range of the number of cards in the deck
        int picked = rand.nextInt(this.deck.size());
        Card randCard;

        //loop if the empty still has cards
        if (!this.deck.isEmpty()) {
            //gets card from the deck in the randomly picked index
            randCard = this.deck.get(picked);
            //remove the card from the deck
            this.deck.remove(picked);
            return randCard;
        }
        else {
            return null;
        }
    }

}