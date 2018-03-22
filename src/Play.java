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
		
		// flopHandTest
		Card[] fpTest = new Card[5];
		
		for(int i = 0; i<fpTest.length; i++){
			fpTest[i] = new Card();
			}
		
		fpTest[0].setIdCard(0);
		fpTest[1].setIdCard(12);
		fpTest[2].setIdCard(4);
		fpTest[3].setIdCard(17);
		fpTest[4].setIdCard(30);
		

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

//		myFlopHand.displayFlopHand(flopHand);
		myFlopHand.displayFlopHand(fpTest);

		System.out.println("Trouvées:");
//		System.out.println(myFlopHand.sameCardSearch(flopHand));
		System.out.println(myFlopHand.sameCardSearch(fpTest));

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