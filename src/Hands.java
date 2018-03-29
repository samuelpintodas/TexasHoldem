import java.awt.List;
import java.util.ArrayList;

public class Hands extends Deck {

	final protected int flopHandSize = 5;
	private String handName;
	private int value;
	private Card[] flopHand = new Card[5];

	// Créé un tableau flopHand avec les tableaux flop et hand
	protected Card[] createHand(Card[] flop, Card[] hand) {

		for (int i = 0; i < flop.length; i++)
			flopHand[i] = flop[i];
		
		for (int i = 0; i < hand.length; i++)
			flopHand[i + flop.length] = hand[i];

		return flopHand;
	}

//	protected int sameCardSearch(Card[] flopHand) {
//
//		int sameCardValue = 0;
//		int i = 0;
//		int numberToFind;
//		int numberFound = 0;
//		ArrayList<Card> toStock = new ArrayList<Card>();
//		
//
//		for (i = 0; i < flopHand.length; i++) {
//			
//			if(i<4)
//				numberToFind = flopHand[i+1].getNumberCard();
//			else
//				numberToFind = flopHand[i].getNumberCard();
//			
//			if (flopHand[i].getNumberCard() == numberToFind) {
//				numberFound = i;
//				toStock.add(flopHand[i]);
//				
//				sameCardValue += 1;
//			}
//		}
//			
//			switch(sameCardValue){
//			
//			case 2:
//				System.out.println("Paire de " + flopHand[numberFound].getCardName());
//				break;
//			
//			case 3:
//				System.out.println("Brelan de " + flopHand[numberFound].getCardName());
//				break;
//				
//			case 4:
//				for(int j = 0; j<(toStock.size()-1); j++){
//					
//						if(toStock.get(j) == toStock.get(j+1)){
//							System.out.println("Carré de " + toStock.get(j).getCardName());
//						
//						}else
//							System.out.println();
//					
//				}
//				
//		}
//
//		return sameCardValue;
//
//	}
	
	// Affiche la flopHand en appelant la méthode "display" dans une boucle for
	protected void displayFlopHand(Card[] flopHand) {
		
		for (int i = 0; i < flopHand.length; i++) {
				display(flopHand, i);
			
		}
	}

}
