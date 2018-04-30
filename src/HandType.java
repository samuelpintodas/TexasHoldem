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
//			System.out.println("Allrules: case n° " + i + ": remplie!");
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
		int cptSame = 1;
		int indexFound = 0;
		int i = 0;
		
		// On test s'il y a une paire, un brelan ou un carré


		// Tant que l'on a pas fini de parcourir le tableau et que l'on a rien trouvé
		while (i < flopHand.length && found == false) {
			// On cherche les paires, brelans et carrés
			for (i = 0; i < flopHand.length; i++) {
				Card toFind = flopHand[i];
				for (int j = i + 1; j < flopHand.length; j++) {

					if (flopHand[j].getNumberCard() == toFind.getNumberCard()) {
						found = true;
						cptSame += 1;
						indexFound = j; // On récupère le dernier indice où une carte identique a été trouvée
					} else
						i = 5;
				}
			}
		}

		switch (cptSame) {

		case 1:
			System.out.println("Pas de paire, ni de brelan, ni de carré");
			break;

		case 2:
			allRules[1].setFound(true);
			System.out.println("Paire de " + flopHand[indexFound-1].getCardName());
			break;

		case 3:
			allRules[3].setFound(true);
			System.out.println("Brelan de " + flopHand[indexFound-1].getCardName());
			break;

		case 4:
			allRules[7].setFound(true);
			System.out.println("Carré de " + flopHand[indexFound-1].getCardName());
			break;

		default:
			System.out.println("IMPOSSIBLE: compteur supérieur à 4");
			System.out.println("Compteur = " + cptSame);
		}

	}

	protected void highterFound(Card[] flopHand) {

	}

	protected void displayRules(HandType[] rulesTab) {

		for (int i = 0; i < rulesTab.length; i++) {
			System.out.print("\nIndex [" + i + "]");
			System.out.print("Nom : " + rulesTab[i].getHTName()+"\n");
			System.out.print("Found : " + rulesTab[i].isFound()+"\n");
			System.out.print("Valeur: " + rulesTab[i].getValue()+"\n");
		}
	}

	// --------------------------------GETTERS & SETTERS----------------------------------------------------------------------------

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
