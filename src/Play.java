import java.io.IOException;

public class Play {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deck myDeck = new Deck();
		MyHand myHand = new MyHand();
		Flop myFlop = new Flop();
		Hands myFlopHand = new Hands();

		Play myPlay = new Play();

		Card[] deck = new Card[myDeck.deckSize];
		Card[] main = new Card[myHand.handSize];
		Card[] flop = new Card[myFlop.flopSize];
		Card[] flopHand = new Card[myFlopHand.flopHandSize];

		// Phase 1: On rempli le deck et on pioche
		myDeck.fillDeck(deck);
		myHand.piocher(deck, main);
		
		// Phase 2: On regarde nos cartes et on dispose le flop
		myHand.displayHand(main);
		myFlop.disposeFlop(deck, flop);

		myPlay.promptEnterKey();
		
		// Phase 3: On raffiche la main et on retourne le flop pour le dévoiler
		myHand.displayHand(main);
		myFlop.retourner(flop);

		
		flopHand = myFlopHand.createHand(flop, main);

		System.out.println("FlopHand:");

		myFlopHand.displayFlopHand(flopHand);

		System.out.println("Trouvées:" +
		myFlopHand.sameCardSearch(flopHand));

	}

	public void promptEnterKey() {
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