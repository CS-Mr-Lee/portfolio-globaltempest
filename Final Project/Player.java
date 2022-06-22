import java.util.*;

public class Player {

    private int money;
    private ArrayList<Card> hand;
    private ArrayList<Card> aces;


    public Player() {
        this.money = 100;
        this.hand = new ArrayList<>();
        this.aces = new ArrayList<>();

    }
    public int getMoney() {

        return this.money;
    }
    public String showMoney() {

        return "player has " + this.money + "$ left";
    }

    public void bet(int amount) {
        this.money -= amount;

    }

    public void winnings(int amount) {

        this.money += amount;
    }

    public String hitOrStand(String choice, Deck deck) {

        Card card = deck.getRandCard();

        if (choice.equals("hit")) {
            if (card.getValue() == 1) {
                System.out.println("This card is an ace");
                System.out.println("Do you want ace value to be 1 or 11?");
                card.setAceVal();
                this.aces.add(card);
                return "Player has:\n" + card.toString();
            }
            else {
                this.hand.add(card);
                return "Player has:\n" + card.toString();
            }
        }
        return "no card drawn";
    }

    public int totalCardValue() {
        int totalVal = 0;
        int aceNum = this.aces.size();
        int aceSum = 0;
        int changeNum = 0;

        for (Card i : this.hand) {
            totalVal += i.getValue();
        }

        for (Card i : this.aces) {
            aceSum += i.getValue();
        }
        totalVal += aceSum;

        if (totalVal > 21 && !this.aces.isEmpty()) {
            totalVal -= aceSum;
            for (Card i : this.aces) {
                i.setCardVal(1);
                totalVal ++;
            }
            while(21 - totalVal >= 10 && aceNum > 0) {
                totalVal += 10;
                changeNum ++;
                aceNum --;
            }
            for (int i = 0; i < changeNum; i ++) {
                Card ace = this.aces.get(i);
                ace.setCardVal(11);
            }
        }
        return totalVal;
    }
    public void clearHand() {
        this.hand = new ArrayList<>();
        this.aces = new ArrayList<>();
    }

}