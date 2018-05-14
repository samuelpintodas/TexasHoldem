import java.util.ArrayList;
import java.util.Arrays;

public class HandType {

	private String HTName;
	private boolean found;
	private int value;
	private Card highter;

	private HandType[] allRules = new HandType[10];

	public HandType() {

	}

	// --------------------------------METHODES----------------------------------------------------------------------------

	public void fillRules(HandType rulesTab[]) {

		for (int i = 0; i < rulesTab.length; i++) {
			rulesTab[i] = new HandType();
			rulesTab[i].setFound(false);
			rulesTab[i].setValue(0);
			//
			// System.out.println("Allrules: case n° " + i + ": remplie!");
		}

		rulesTab[0].setHTName("hauteur"); // la personne ayant la carte la plus
											// haute
		rulesTab[1].setHTName("paire"); // une paire
		rulesTab[2].setHTName("doublePaire"); // deux paires de deux nombres
												// différents
		rulesTab[3].setHTName("brelan"); // 3 cartes du même numéro
		rulesTab[4].setHTName("quinte"); // Suite de 5 cartes
		rulesTab[5].setHTName("color"); // 5 cartes de la même couleur
		rulesTab[6].setHTName("fullHouse"); // un brelan et une paire
		rulesTab[7].setHTName("carre"); // 4 cartes du même numero
		rulesTab[8].setHTName("quinteFlush"); // Suite de 5 cartes de la même
												// couleur
		rulesTab[9].setHTName("royalQuinteFlush"); // Suite d'un 10,
													// Valet,Reine, Roi, As (de
													// la même couleur)

	}

	protected void handSearching(Card[] flopHand) {

		Arrays.sort(flopHand);
		fillRules(allRules);

		boolean found = false;
		int cptSame = 0;
		int lastIndexFound = 0;
		int lastCardFound = 53;
		int cardFound = 14;

		ArrayList<Integer> indexFound = new ArrayList<Integer>();
		// ArrayList<Integer> cardToAvoid = new ArrayList<Integer>();
		//
		// Card toFind = null;
		//
		peer(flopHand, indexFound, cardFound);
		//
		// // On test s'il y a une paire, un brelan ou un carré
		//
		// // Tant que l'on a pas fini de parcourir le tableau et que l'on a
		// rien trouvé
		//
		// // On cherche les paires, brelans et carrés
		// for (i = 0; i < flopHand.length-1; i++) {
		// toFind = flopHand[i];
		// System.out.println("Carte cherchee : " + flopHand[i].getCardName());
		// for (int j = 0; j < flopHand.length; j++) {
		//
		// if (toFind.getNumberCard() == flopHand[j].getNumberCard()
		// && flopHand[i].getNumberCard() == lastCardFound
		// && indexFound.contains(j) == false) {
		//
		// found = true;
		//
		// // On récupère le dernier indice où une carte identique a été trouvée
		// lastIndexFound = j;
		// indexFound.add(j);
		//
		// lastCardFound = toFind.getNumberCard();
		// System.out.println("Trouve une carte à l'index [" + lastIndexFound+
		// "] , cartes identiques trouvées : " + indexFound.size());
		// }
		// else{
		// found = false;
		//
		//
		// }
		// lastCardFound = flopHand[lastIndexFound].getNumberCard();
		// }
		// }

		cptSame = indexFound.size();

		// switch (cptSame) {
		//
		// case 1:
		// System.out.println("Pas de paire, ni de brelan, ni de carré");
		// System.out.println("Found: " + found);
		// System.out.println("Card to find :" + toFind.getCardName());
		// System.out.println("Taille de l'arraylist: " + indexFound.size());
		// break;
		//
		// case 2:
		// allRules[1].setFound(true);
		// System.out.println("Card to find :" + toFind.getCardName());
		// System.out.println("Paire de " +
		// flopHand[lastIndexFound].getCardName());
		// System.out.println("Taille de l'arraylist: " + indexFound.size());
		// break;
		//
		// case 3:
		// allRules[3].setFound(true);
		// System.out.println("Card to find :" + toFind.getCardName());
		// System.out.println("Brelan de " +
		// flopHand[lastIndexFound].getCardName());
		// System.out.println("Taille de l'arraylist: " + indexFound.size());
		// break;
		//
		// case 4:
		// allRules[7].setFound(true);
		// System.out.println("Card to find :" + toFind.getCardName());
		// System.out.println("Carré de " +
		// flopHand[lastIndexFound].getCardName());
		// System.out.println("Taille de l'arraylist: " + indexFound.size());
		// break;
		//
		// default:
		// System.out.println("IMPOSSIBLE: compteur supérieur à 4");
		// System.out.println("Compteur = " + cptSame);
		// System.out.println("Taille de l'arraylist: " + indexFound.size());
		// break;
		// }

	}

	private boolean peer(Card[] flopHand, ArrayList<Integer> indexFound, int cardFound) {

		int cardToFind = 14; // index de la carte à trouver
		boolean found = false; // défini si une paire a été trouvée ou non


		while (found == false) {

			for (int i = 0; i < flopHand.length - 1; i++) {
				cardToFind = flopHand[i].getNumberCard();
				for (int j = i + 1; j < flopHand.length; j++) {
					if (flopHand[j].getNumberCard() == cardToFind) {

						cardFound = cardToFind;
						found = true;
						System.out.println("Paire de " + cardFound + "!");
						
						allRules[1].setFound(true);
					}
				}
			}
		}

		for (int k = 0; k < flopHand.length; k++) {
			if (flopHand[k].getNumberCard() == cardFound) {
				indexFound.add(k);
			}
		}

		System.out.println("Taille de l'arraylist IndexFound : " + indexFound.size());
		System.out.println("Indexs trouvés:");
		for (int i = 0; i < indexFound.size(); i++) {
			System.out.print(indexFound.get(i) + " ");
		}

		return allRules[1].isFound();

	}

	private boolean brelan(Card[] flopHand, ArrayList<Integer> indexFound, int cardFound) {

		for(int i = 0; i<flopHand.length; i++){
			if(	flopHand[i].getNumberCard() == cardFound &&
				indexFound.contains(i) == false){
				
				System.out.println("brelan de " + cardFound + "!");
				
			}
		}
		
		return allRules[3].isFound();
	}

	protected void highterFound(Card[] flopHand) {

	}

	protected void displayRules(HandType[] rulesTab) {

		for (int i = 0; i < rulesTab.length; i++) {
			System.out.print("\nIndex [" + i + "]");
			System.out.print("Nom : " + rulesTab[i].getHTName() + "\n");
			System.out.print("Found : " + rulesTab[i].isFound() + "\n");
			System.out.print("Valeur: " + rulesTab[i].getValue() + "\n");
		}
	}

	// --------------------------------GETTERS &
	// SETTERS----------------------------------------------------------------------------

	// -GETTERS---------------------------------------------------

	public String getHTName() {
		return HTName;
	}

	public boolean isFound() {
		return found;
	}

	public int getValue() {
		return value;
	}

	// -SETTERS---------------------------------------------------

	public void setHTName(String hTName) {
		HTName = hTName;
	}

	public void setFound(boolean found) {
		this.found = found;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
