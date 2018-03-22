
public class Hands extends Deck {

	final protected int flopHandSize = 5;
	private String handName;
	private int value;
	private Card[] flopHand = new Card[5];

	protected Card[] createHand(Card[] flop, Card[] hand) {

		for (int i = 0; i < flop.length; i++)
			flopHand[i] = flop[i];
		
		for (int i = 0; i < hand.length; i++)
			flopHand[i + flop.length] = hand[i];

		return flopHand;
	}

	protected int sameCardSearch(Card[] flopHand) {

		int sameCardValue = 0;
		int i = 0;
		int numberToFind;

		for (i = 0; i < flopHand.length; i++) {
			
			if(i==0)
				numberToFind = flopHand[i].getNumberCard();
			else
				numberToFind = flopHand[i-1].getNumberCard();
			
			if (numberToFind == flopHand[i].getNumberCard()) {
				
				sameCardValue += 1;
			}
//			}else
//				i+=1;
		}

		return sameCardValue;

	}
	
	// Affiche tout le deck en appelant la méthode "display" dans une boucle for
	protected void displayFlopHand(Card[] flopHand) {
		
		for (int i = 0; i < flopHand.length; i++) {
				display(flopHand, i);
			
		}
	}

}
