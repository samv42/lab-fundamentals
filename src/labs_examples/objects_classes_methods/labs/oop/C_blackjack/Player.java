package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Player {
    String name;
    Hand hand = new Hand();
    int potValue = 100;
    int totalWins = 0;
    static int totalGames = 0;

    public boolean computerAI(){
        if(hand.getHandValue() < 16){
            return true;
        }
        return false;
    }
    public int getPotValue(){
        return potValue;
    }
    public void setPotValue(int bet){
        potValue += bet;
    }
    public void setTotalWins(){
        totalWins++;
    }
    public int getTotalWins(){
        return totalWins;
    }
    public static void setTotalGames(){
        totalGames++;
    }
    public static int getTotalGames(){
        return totalGames;
    }
}
