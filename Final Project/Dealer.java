import java.util.ArrayList;

public class Dealer  {

    private ArrayList<Card> hand;
    private ArrayList<Card> aces;

    public Dealer() {
        this.hand = new ArrayList<>();
        this.aces = new ArrayList<>();
    }

    public ArrayList<Card> getHand() {
        return this.hand;
    }

    public ArrayList<Card> getAces() {
        return this.aces;
    }

    public void showHand() {

        System.out.println("dealer has:");
        for (Card i : this.hand) {
            System.out.println(i.toString());
        }
        for (Card i : this.aces) {
            System.out.println(i.toString());
        }

    }

    public void hit(Deck deck) {
        Card card = deck.getRandCard();

        if (card.getValue() == 1) {
            card.setCardVal(11);
            this.aces.add(card);
        }
        else {
            this.hand.add(card);
        }
    }

    public String dealCard(Player player, Deck deck) {
        return player.hitOrStand("hit", deck);
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
            totalVal += aceSum;
        }
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