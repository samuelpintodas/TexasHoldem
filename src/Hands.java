
public class Hands {
	
	final protected int flopHandSize = 5;
	private String handName;
	private int value;
	private Card[] flopHand = new Card [5];
	
	
	protected Card[] createHand (Card[] flop, Card[] hand){
		
		for(int i = 0; i<flop.length; i++){
			flopHand[i] = flop[i];
		}
		
		for(int i = 0; i<hand.length; i++){
			flopHand[i+3] = hand[i];
		}
		
		return flopHand;
	}
	
	protected int sameCardSearch (Card[] flopHand){
		
		int sameCardValue = 0;
		int numberToFind;
		
		for(int i = 0; i<flopHand.length; i++){
			numberToFind = flopHand[i].getNumberCard();
			for(int j = 0; i<flopHand.length; j++){
				if (flopHand[j].getNumberCard() == numberToFind && 
					flopHand[j].getNumberCard()!= flopHand[i].getNumberCard()){
					
					sameCardValue+=1;
				}
			}
			
		}
		
		return sameCardValue;
		
	}
	
	
	
}
