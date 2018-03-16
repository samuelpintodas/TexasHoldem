import java.io.IOException;

public class Play {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deck myDeck = new Deck();
		MyHand myHand = new MyHand();
		Flop myFlop = new Flop();
		Play myPlay = new Play();
		

		Card[] deck = new Card[myDeck.deckSize];
		Card[] main = new Card[myHand.handSize];
		Card[] flop = new Card[myFlop.flopSize];

		myDeck.fillDeck(deck);
		myHand.piocher(deck, main);
		
		myHand.displayHand(main);
		myFlop.disposeFlop(deck, flop);

		myPlay.promptEnterKey();
		
		myHand.displayHand(main);
		myFlop.retourner(flop);
		

	}
	
	
	public void promptEnterKey(){
		System.out.println("\n------------------------------");
	    System.out.println("Press \"ENTER\" to continue...");
	    System.out.println("------------------------------\n");
	    try {
	        System.in.read();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}

}