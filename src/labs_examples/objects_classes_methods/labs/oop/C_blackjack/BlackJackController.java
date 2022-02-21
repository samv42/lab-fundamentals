package labs_examples.objects_classes_methods.labs.oop.C_blackjack;
import java.util.Scanner;

public class BlackJackController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deck deck1 = new Deck();
        deck1.setDeck();
        Player player1 = new Player();
        Player comp = new Player();
        boolean playerPlay = false;
        boolean compPlay = false;
        int bet;
        player1.hand.addCard(deck1.Deal());
        comp.hand.addCard(deck1.Deal());
        player1.hand.addCard(deck1.Deal());
        comp.hand.addCard(deck1.Deal());

        player1.hand.setHandValue();
        comp.hand.setHandValue();

        do {
            System.out.println("Your pot has a value of " + player1.getPotValue());
            System.out.println("How much do you want to bet? ");
            bet = scanner.nextInt();
            if(bet < 1){
                break;
            }
            System.out.println("You hand has a value of " + player1.hand.getHandValue());
            System.out.println("Do you want to draw a card? Yes or no. ");
            scanner.nextLine();
            String draw = scanner.nextLine();
            System.out.println("draw is " + draw);

            if (draw.toLowerCase().indexOf("yes") != -1) {
                player1.hand.addCard(deck1.Deal());
                player1.hand.setHandValue();
                System.out.println("You hand has a value of " + player1.hand.getHandValue());
                playerPlay = true;
            } else {
                System.out.println("Ending bet. ");
            }
            if (comp.computerAI()) {
                comp.hand.addCard(deck1.Deal());
                compPlay = true;
                comp.hand.setHandValue();
            } else {
                System.out.println("Computer did not draw. Ending bet. ");
            }
            while (playerPlay == true | compPlay == true & bet > 0) {
                playerPlay = player1.hand.getLose();
                compPlay = comp.hand.getLose();
                if (playerPlay == false | compPlay == false) {
                    break;
                } else {
                    System.out.println("Do you want to draw a card again? Yes or no. ");
                    draw = draw + scanner.nextLine();
                    if (draw.toLowerCase().indexOf("no") == -1) {
                        player1.hand.addCard(deck1.Deal());
                        player1.hand.setHandValue();
                        System.out.println("You hand has a value of " + player1.hand.getHandValue());
                    } else {
                        System.out.println("Ending bet. ");
                        break;
                    }
                    if (comp.computerAI()) {
                        comp.hand.addCard(deck1.Deal());
                        comp.hand.setHandValue();
                    } else {
                        System.out.println("Computer did not draw again. Ending bet. ");
                        break;
                    }
                }
                playerPlay = player1.hand.getLose();
                compPlay = comp.hand.getLose();
            }
            if (playerPlay == false) {
                System.out.println("You lose. The computer had " + comp.hand.getHandValue() + " and you had " + player1.hand.getHandValue());
                player1.setPotValue(bet*-1);
                comp.setPotValue(bet);
                comp.setTotalWins();
            }else if (player1.hand.getHandValue() > comp.hand.getHandValue()) {
                System.out.println("You win. The computer had " + comp.hand.getHandValue() + " and you had " + player1.hand.getHandValue());
                player1.setPotValue(bet);
                comp.setPotValue(bet*-1);
                player1.setTotalWins();
            }else if (player1.hand.getHandValue() < comp.hand.getHandValue()) {
                System.out.println("You lose. The computer had " + comp.hand.getHandValue() + " and you had " + player1.hand.getHandValue());
                player1.setPotValue(bet*-1);
                comp.setPotValue(bet);
                comp.setTotalWins();
            }else if (player1.hand.getHandValue() == comp.hand.getHandValue()) {
                System.out.println("You lose. The computer had " + comp.hand.getHandValue() + " and you had " + player1.hand.getHandValue());
                player1.setPotValue(bet*-1);
                comp.setPotValue(bet);
                comp.setTotalWins();
            }
            Player.setTotalGames();
            System.out.println("The Player has won " + player1.getTotalWins() + " many games.");
            System.out.println("The Computer has won " + comp.getTotalWins() + " many games.");
            System.out.println("There have been " + Player.getTotalGames() + " many games total.");

        }while(bet > 0 & player1.getPotValue() > 0 & comp.getPotValue() > 0);
    }
}
