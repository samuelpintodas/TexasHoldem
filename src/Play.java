
public class Play {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deck myDeck = new Deck();
		Hand myHand = new Hand();
		Flop myFlop = new Flop();
		

		Card[] deck = new Card[myDeck.deckSize];
		Card[] main = new Card[myHand.handSize];
		Card[] flop = new Card[myFlop.flopSize];

		myDeck.fillDeck(deck);
		myHand.piocher(deck, main);
//		myFlop.piocher(deck, flop);
//		myFlop.retourner(flop);

//		myDeck.displayDeck(deck);
		myHand.displayHand(main);
//		myFlop.retourner(flop);
		

	}

}