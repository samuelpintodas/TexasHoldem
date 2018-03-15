
public class Flop extends Hand {
	
	final protected int flopSize = 3;
	
	protected void displayflop(Card[] flop){
		
		System.out.println("\n\nFLOP:");
		
		for(int i=0; i<flopSize; i++){

			if(flop[i].isVisible()== true){
				display(flop,i);
			}
			else{
				System.out.println("---------------------------------");
				System.out.println("Idcard : ???");
				System.out.println("Numero de Carte : ???");
				System.out.println("?????????????");
			}
		}
	}
	
	protected void retourner(Card[] flop){
		
		for(int i=0; i<flopSize; i++){
			
			if(flop[i].isVisible() == false)
				flop[i].setVisible(true);
			else
				flop[i].setVisible(false);
		}
	}
	
	protected void disposeflop (Card[] deck, Card[] flop){
		
		piocher(deck, flop);
		
			retourner(flop);
		
	}
	
}
