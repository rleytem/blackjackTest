import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Card twoHearts = new Card("Hearts", "2");
        Card threeHearts = new Card("Hearts", "3");
        Card fourHearts = new Card("Hearts", "4");
        Card fiveHearts = new Card("Hearts", "5");
        Card sixHearts = new Card("Hearts", "6");
        Card sevenHearts = new Card("Hearts", "7");
        Card eightHearts = new Card("Hearts", "8");
        Card nineHearts = new Card("Hearts", "9");
        Card tenHearts = new Card("Hearts", "10");
        Card jackHearts = new Card("Hearts", "Jack");
        Card queenHearts = new Card("Hearts", "Queen");
        Card kingHearts = new Card("Hearts", "King");
        Card aceHearts = new Card("Hearts", "Ace");

        Card twoDiamonds = new Card("Diamonds", "2");
        Card threeDiamonds = new Card("Diamonds", "3");
        Card fourDiamonds = new Card("Diamonds", "4");
        Card fiveDiamonds = new Card("Diamonds", "5");
        Card sixDiamonds = new Card("Diamonds", "6");
        Card sevenDiamonds = new Card("Diamonds", "7");
        Card eightDiamonds = new Card("Diamonds", "8");
        Card nineDiamonds = new Card("Diamonds", "9");
        Card tenDiamonds = new Card("Diamonds", "10");
        Card jackDiamonds = new Card("Diamonds", "Jack");
        Card queenDiamonds = new Card("Diamonds", "Queen");
        Card kingDiamonds = new Card("Diamonds", "King");
        Card aceDiamonds = new Card("Diamonds", "Ace");

        Card twoSpades = new Card("Spades", "2");
        Card threeSpades = new Card("Spades", "3");
        Card fourSpades = new Card("Spades", "4");
        Card fiveSpades = new Card("Spades", "5");
        Card sixSpades = new Card("Spades", "6");
        Card sevenSpades = new Card("Spades", "7");
        Card eightSpades = new Card("Spades", "8");
        Card nineSpades = new Card("Spades", "9");
        Card tenSpades = new Card("Spades", "10");
        Card jackSpades = new Card("Spades", "Jack");
        Card queenSpades = new Card("Spades", "Queen");
        Card kingSpades = new Card("Spades", "King");
        Card aceSpades = new Card("Spades", "Ace");

        Card twoClubs = new Card("Clubs", "2");
        Card threeClubs = new Card("Clubs", "3");
        Card fourClubs = new Card("Clubs", "4");
        Card fiveClubs = new Card("Clubs", "5");
        Card sixClubs = new Card("Clubs", "6");
        Card sevenClubs = new Card("Clubs", "7");
        Card eightClubs = new Card("Clubs", "8");
        Card nineClubs = new Card("Clubs", "9");
        Card tenClubs = new Card("Clubs", "10");
        Card jackClubs = new Card("Clubs", "Jack");
        Card queenClubs = new Card("Clubs", "Queen");
        Card kingClubs = new Card("Clubs", "King");
        Card aceClubs = new Card("Clubs", "Ace");

        //create a fresh deck of cards using a Stack
        List<Card> freshDeck = new ArrayList<Card>();

        freshDeck.add(twoHearts);
        freshDeck.add(threeHearts);
        freshDeck.add(fourHearts);
        freshDeck.add(fiveHearts);
        freshDeck.add(sixHearts);
        freshDeck.add(sevenHearts);
        freshDeck.add(eightHearts);
        freshDeck.add(nineHearts);
        freshDeck.add(tenHearts);
        freshDeck.add(jackHearts);
        freshDeck.add(queenHearts);
        freshDeck.add(kingHearts);
        freshDeck.add(aceHearts);

        freshDeck.add(twoDiamonds);
        freshDeck.add(threeDiamonds);
        freshDeck.add(fourDiamonds);
        freshDeck.add(fiveDiamonds);
        freshDeck.add(sixDiamonds);
        freshDeck.add(sevenDiamonds);
        freshDeck.add(eightDiamonds);
        freshDeck.add(nineDiamonds);
        freshDeck.add(tenDiamonds);
        freshDeck.add(jackDiamonds);
        freshDeck.add(queenDiamonds);
        freshDeck.add(kingDiamonds);
        freshDeck.add(aceDiamonds);

        freshDeck.add(twoSpades);
        freshDeck.add(threeSpades);
        freshDeck.add(fourSpades);
        freshDeck.add(fiveSpades);
        freshDeck.add(sixSpades);
        freshDeck.add(sevenSpades);
        freshDeck.add(eightSpades);
        freshDeck.add(nineSpades);
        freshDeck.add(tenSpades);
        freshDeck.add(jackSpades);
        freshDeck.add(queenSpades);
        freshDeck.add(kingSpades);
        freshDeck.add(aceSpades);

        freshDeck.add(twoClubs);
        freshDeck.add(threeClubs);
        freshDeck.add(fourClubs);
        freshDeck.add(fiveClubs);
        freshDeck.add(sixClubs);
        freshDeck.add(sevenClubs);
        freshDeck.add(eightClubs);
        freshDeck.add(nineClubs);
        freshDeck.add(tenClubs);
        freshDeck.add(jackClubs);
        freshDeck.add(queenClubs);
        freshDeck.add(kingClubs);
        freshDeck.add(aceClubs);

        //shuffle stack freshDeck;
        Collections.shuffle(freshDeck);

        //initialize the players hand
        List<Card> playerHand = new ArrayList<Card>();

        //initialize the dealers hand
        List<Card> dealerHand = new ArrayList<Card>();

        //opening draw;
        drawCard(playerHand, freshDeck);
        drawCard(dealerHand, freshDeck);
        drawCard(playerHand, freshDeck);
        drawCard(dealerHand, freshDeck);

        System.out.println("Players Hand: " + playerHand.toString());
        System.out.println("Dealers Hand: " + dealerHand.toString());

        System.out.println("Player's Hand has a value of: " + handValue(playerHand));
        System.out.println("Dealer's Hand has a value of: " + handValue(dealerHand));
        System.out.println("Deck has: " + freshDeck.size() + " cards remaining");


    }

    public static void drawCard(List<Card> hand, List<Card> deck) {
        hand.add(deck.get(0));
        deck.remove(0);
    }

    public static int handValue(List<Card> hand) {
        boolean hasAce = false;
        int total = 0;
        for (int i = 0; i < hand.size(); i++) {

            int temp = Integer.parseInt(hand.get(i).value);
            total += temp;

            if (hand.get(i).number == "Ace") {
                hasAce = true;
            }
        }
        if (hasAce) {
            System.out.println("Has an Ace!");
        }
        return total;
    }
}