import java.util.Arrays;

public class HandType {
	
	boolean royalQuinteFlush = false; // Suite d'un 10, Valet, Reine, Roi, As (de la même couleur)
	boolean quinteFlush = false; // Suite de 5 cartes de la même couleur
	boolean carre = false; // 4 cartes du même numero
	boolean fullHouse = false; // un brelan et une paire
	boolean color = false; // 5 cartes de la même couleur
	boolean quinte = false; // Suite de 5 cartes
	boolean brelan = false; // 3 cartes du même numéro
	boolean doublePaire = false; // deux paires de deux nombres différents
	boolean paire = false; // une paire
	boolean hauteur = false; // la personne ayant la carte la plus haute 

	// Méthode triant les cartes dans l'ordre des numéros
	protected void cardSorting (Card[] flopHand) {
		
		int [] cardNumberTab = new int[flopHand.length];
		
		for(int i = 0; i<flopHand.length; i++){
	
			cardNumberTab[i] = flopHand[i].getNumberCard();
			
		}
		
		Arrays.sort(cardNumberTab);
		
		for (int i = 0; i < cardNumberTab.length; i++) {
			System.out.print(cardNumberTab[i] + ",");
		}
		
		
		for(int j = 0; j<flopHand.length; j++){
			
			flopHand[j].setNumberCard(cardNumberTab[j]);
			
		}
		 
	}
	
	protected void handSearching (Card[] flopHand){
		
	}
}
