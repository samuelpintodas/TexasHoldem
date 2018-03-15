public class Hand extends Deck{

	final protected int handSize = 2;
	
	// Pioche une carte dans un deck d�fini et le place dans la pioche
	protected void piocher(Card[] deck, Card[] pioche) {

		// Pioche selon le nombre de Cards � piocher
		for (int i = 0; i < pioche.length; i++) {

			// d�fini au hasard l'ID de la Card � piocher
			int piocheID = (int) (Math.random() * 53);

//			// tant que la Card que l'on a voulu piocher l'est d�j�...
			while (deck[piocheID].isPiochee() == false) {
				// ... on r�essaie et on en pioche une
				if (deck[piocheID].isPiochee() == false) {
					// puis on a d�fini comme pioch�e
					deck[piocheID].setPiochee(true);
					pioche[i] = deck[piocheID];
				}else
					i-=1;
			}
		}
	}

	// Affiche notre main (les cartes pioch�es)
	protected void displayHand (Card[] hand) {
		
		System.out.println("\n\nCARTES PIOCHEES:");

		for (int i = 0; i < hand.length; i++) {

			display(hand, i);

		}
	}
}
