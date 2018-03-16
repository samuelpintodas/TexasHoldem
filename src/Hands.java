
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
	
}
