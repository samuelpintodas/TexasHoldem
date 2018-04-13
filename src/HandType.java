import java.util.Arrays;

public class HandType {
	
	boolean royalQuinteFlush = false; // Suite d'un 10, Valet, Reine, Roi, As (de la m�me couleur)
	boolean quinteFlush = false; // Suite de 5 cartes de la m�me couleur
	boolean carre = false; // 4 cartes du m�me numero
	boolean fullHouse = false; // un brelan et une paire
	boolean color = false; // 5 cartes de la m�me couleur
	boolean quinte = false; // Suite de 5 cartes
	boolean brelan = false; // 3 cartes du m�me num�ro
	boolean doublePaire = false; // deux paires de deux nombres diff�rents
	boolean paire = false; // une paire
	boolean hauteur = false; // la personne ayant la carte la plus haute 

	// M�thode triant les cartes dans l'ordre des num�ros
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
