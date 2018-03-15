public class Hand extends Deck {

	final protected int handSize = 2;

	// Pioche une carte dans un deck défini et le place dans la pioche
	protected void piocher(Card[] deck, Card[] pioche) {
		
		int piocheID;

		for (int i = 0; i < pioche.length; i++) {
			
			piocheID = (int) (Math.random() * 52);
			
			while(deck[piocheID].isPiochee()==true){
				piocheID = (int) (Math.random()*52);
			}
			
			pioche[i] = deck[piocheID];
			deck[piocheID].setPiochee(true);
			pioche[i].setVisible(true);
		}
	}
	

	// Affiche notre main (les cartes piochées)
	protected void displayHand(Card[] hand) {

		System.out.println("\n\nCARTES PIOCHEES:");

		for (int i = 0; i < hand.length; i++) {

			display(hand, i);

		}
	}
}
