import java.util.*;

public class Main {


    public static void main(String[] args) {

        System.out.println("Welcome to the game of Black Jack");
        System.out.println("\nRules:");
        System.out.println("- player is dealt 2 face up cards initially");
        System.out.println("-dealer is dealt 1 card face up and 1 card face down");
        System.out.println("- cards are worth their number value, face cards are worth 10, ace is worth 11 or 1");
        System.out.println("- player has option to hit to get another card, option to stay to keep their current cards");
        System.out.println("- dealer must hit until card total equals or goes over 17");
        System.out.println("- player goal is to have card total that is lower than 21 but higher than dealer card total");
        System.out.println("- dealer pays player what they bet if player wins and vice versa");
        System.out.println("- dealer pays player 2x if player has total of 21");
        System.out.println("- no money exchange if dealer and player total is the same\n");

        String play;
        Player player = new Player();
        Dealer dealer = new Dealer();
        String playerChoice;

        do {
            Scanner sc = new Scanner(System.in);
            Deck deck  = new Deck();
            int betAmount = 0;

            System.out.println("Betting start:\n");
            System.out.println(player.showMoney());
            System.out.println("How much will player bet?");
            betAmount = sc.nextInt();
            player.bet(betAmount);
            System.out.println(player.showMoney());
            System.out.println("Betting end:\n");

            System.out.println("Initial dealing start:\n");
            System.out.println(dealer.dealCard(player, deck));

            System.out.println();

            dealer.hit(deck);
            dealer.showHand();

            System.out.println();

            System.out.println(dealer.dealCard(player, deck));

            System.out.println();

            dealer.hit(deck);

            System.out.println();

            System.out.println("player total value is " + player.totalCardValue());
            System.out.println("Initial dealing end:\n");

            System.out.println("Player choices start:");

            do {
                System.out.println("hit or stay?");
                playerChoice = sc.next();
                if (playerChoice.equals("hit")) {
                    System.out.println(player.hitOrStand(playerChoice, deck));
                    System.out.println("player total value is " + player.totalCardValue());
                    if (player.totalCardValue() > 21) {
                        System.out.println("Player total is greater than 21. You have busted");
                    }
                }

            }while(playerChoice.equals("hit") && player.totalCardValue() < 21);
            System.out.println("Player choice end:\n");





            System.out.println("Dealer starts:");
            dealer.showHand();
            System.out.println("dealer total value is " + dealer.totalCardValue());


            if (player.totalCardValue() == 21) {

                if(dealer.totalCardValue() == 21) {
                    System.out.println("Dealer choice end:\n");
                    System.out.println("both dealer and player has 21");
                    System.out.println("player gets to keep their bet");
                    player.winnings(betAmount);
                    System.out.println(player.showMoney());
                }
                else {
                    System.out.println("Dealer choice end:\n");
                    System.out.println("player wins a black jack");
                    System.out.println("player gets their bet back + 2x winnings in what they bet");
                    player.winnings(3*betAmount);
                    System.out.println(player.showMoney());
                }
            }
            else if (player.totalCardValue() > 21) {
                System.out.println("Dealer choice end:\n");
                System.out.println("Player busted");
                System.out.println("player loses their bet");
                System.out.println(player.showMoney());
            }
            else {
                while (dealer.totalCardValue() < 17) {
                    dealer.hit(deck);
                    dealer.showHand();
                    System.out.println("dealer total value is " + dealer.totalCardValue());
                }
                System.out.println("Dealer choice end:\n");

                if (player.totalCardValue() > dealer.totalCardValue()) {
                    System.out.println("player wins from a higher total");
                    System.out.println("player gets their bet back + winnings in what they bet");
                    player.winnings(2*betAmount);
                    System.out.println(player.showMoney());
                }
                else if (dealer.totalCardValue() > 21) {
                    System.out.println("player wins from dealer bust");
                    System.out.println("player gets their bet back + winnings in what they bet");
                    player.winnings(2*betAmount);
                    System.out.println(player.showMoney());
                }
                else if (player.totalCardValue() < dealer.totalCardValue()) {
                    System.out.println("player loses from lower total");
                    System.out.println("player loses their bet");
                    System.out.println(player.showMoney());
                }
                else {
                    System.out.println("both dealer and player has " + player.totalCardValue());
                    System.out.println("player gets to keep their bet");
                    player.winnings(betAmount);
                    System.out.println(player.showMoney());
                }

            }

            if (player.getMoney() <= 0) {
                System.out.println("player is broke, you will be kicked out");
                break;
            }



            System.out.println("play again? yes or no?");
            play = sc.next();
            dealer.clearHand();
            player.clearHand();
        }while(play.equals("yes"));

    }

}
