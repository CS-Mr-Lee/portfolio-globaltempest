import java.util.Scanner;

public class Card {
    static Scanner sc = new Scanner(System.in);

    private char suit;
    private int value;
    private String name;

    public Card() {
        this.suit = ' ';
        this.value = -1;
        this.name = "";
    }

    public Card(char suit, int value, String name) {
        this.suit = suit;
        this.value = value;
        this.name = name;
    }

    public int getValue() {

        return this.value;
    }

    public String getSuitName() {
        if (this.suit == 'H') {
            return "HEART";
        }
        else if (this.suit == 'C') {
            return "CLUB";
        }
        else if (this.suit == 'S') {
            return "SPADE";
        }
        else if (this.suit == 'D'){
            return "DIAMOND";
        }
        else {
            return "null";
        }
    }

    public String getCardName() {

        return this.name;
    }

    public String toString() {

        return "Card: " + this.getCardName() + " Suit: " + this.getSuitName() + " Value: " + this.value;

    }

    public void setCardVal(int newVal) {
        this.value = newVal;
    }

    public void setAceVal() {
        this.value = sc.nextInt();
    }

}