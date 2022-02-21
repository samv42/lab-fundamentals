package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Card {
    char[] suit = new char[]{'♠', '♦', '♥', '♣'};
    int cardValue;
    char thisSuit;

    public Card(int suitVal, int cardValue){
        thisSuit = (suit[suitVal]);
        this.cardValue = cardValue;
        //System.out.println(thisSuit);
        //System.out.println(cardValue);
    }

    public Card(char thisSuit, int cardValue){
        this.thisSuit = thisSuit;
        this.cardValue = cardValue;
    }

    public int getCardVal(Card thisCard){
    return cardValue;
    }

    public char getThisSuit(Card thisCard){
        return thisSuit;
    }
}
