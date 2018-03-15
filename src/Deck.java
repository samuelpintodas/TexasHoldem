
public class Deck {

	// Taille fixe et définie du nombre de cartes
	final int deckSize = 52;

	// Rempli le deck de cartes
	protected void fillDeck(Card[] deckFull) {

		for (int i = 0; i < deckFull.length; i++) {

			deckFull[i] = new Card();
			deckFull[i].setIdCard(i);

		}

	}

	// Affiche tout le deck en appelant la méthode "display" dans une boucle for
	protected void displayDeck(Card[] deck) {
		
		for (int i = 0; i < deck.length; i++) {
			// On l'affiche à condition qu'elle ne soit pas piochée
			if (deck[i].isPiochee() == false) {

				display(deck, i);
			}
		}
	}

	// Permet l'affichage d'une carte définie par son ID dans la console
	public void display(Card[] deck, int idCard) {

		System.out.println("---------------------------------");
		System.out.println("Idcard : " + deck[idCard].getIdCard());
		System.out.println("\tNumero de Carte : " + deck[idCard].getNumberCard());
		System.out.println("\t" + deck[idCard].getCardName() + " de " + deck[idCard].getColor());
	}



}
