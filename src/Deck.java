
public class Deck extends Card{

	// Taille fixe et d�finie du nombre de cartes
	final int DECKSIZE = 52;

	// Rempli le deck de cartes
	protected void fillDeck(Card[] deckFull) {

		for (int i = 0; i < deckFull.length; i++) {

			deckFull[i] = new Card();
			deckFull[i].setIdCard(i);

		}

	}

	// Affiche tout le deck en appelant la m�thode "display" dans une boucle for
	protected void displayDeck(Card[] deck) {
		
		for (int i = 0; i < deck.length; i++) {
			// On l'affiche � condition qu'elle ne soit pas pioch�e
			if (deck[i].isPiochee() == false) {

				display(deck, i);
			}
		}
	}

	// Permet l'affichage d'une carte d�finie par son ID dans la console
	public void display(Card[] deck, int idCard) {

		System.out.println("---------------------------------");
		System.out.println("Idcard : " + deck[idCard].getIdCard());
		System.out.println("\tNumero de Carte : " + deck[idCard].getNumberCard());
		System.out.println("\t" + deck[idCard].getCardName() + " de " + deck[idCard].getColor());
	}



}
