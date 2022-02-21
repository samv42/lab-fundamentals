package labs_examples.objects_classes_methods.labs.oop.C_blackjack;
import java.util.ArrayList;

public class Hand {
    ArrayList<Card> cards = new ArrayList<>();
    int handValue = 0;

    public int setHandValue() {
        int sum = 0;
        int cardVal;
        for (int i = 0; i < cards.size(); i++) {
            Card thisCard = cards.get(0);
            cardVal = thisCard.getCardVal(thisCard);
            if(cardVal > 10){
                cardVal = 10;
            }
            sum += cardVal;
        }
        handValue = sum;
        return sum;
        }
    public int getHandValue(){
        return handValue;
    }
    public boolean getLose(){
        int handValue = setHandValue();
        if(handValue > 21){
            return false;
        }
        return true;
    }

    public void addCard(Card card){
        cards.add(card);
    }
}
