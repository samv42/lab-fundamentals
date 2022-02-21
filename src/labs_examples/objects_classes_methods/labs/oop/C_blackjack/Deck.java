package labs_examples.objects_classes_methods.labs.oop.C_blackjack;
import java.util.ArrayList;

public class Deck {
    ArrayList<Card> cards = new ArrayList<>();
    ArrayList<Card> usedCards = new ArrayList<>();

    public void setDeck(){
            int count = 0;
            for(int a = 1; a < 14; a++) {
                for (int x = 0; x < 4; x++) {
                    cards.add(new Card(x, a));
                    count++;
                    //System.out.println("count is " + count);
                }
            }
        }

        public Card Deal(){
        int min = 0;
        int max = 51;
        Card dealCard;
        do {
            int dealCardNum = (int) Math.floor(Math.random() * (max - min + 1) + min);
            dealCard = cards.get(dealCardNum);
        }while(usedCards.contains(dealCard));
        usedCards.add(dealCard);
        return dealCard;
        }

}
