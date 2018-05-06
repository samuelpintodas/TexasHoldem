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
//			System.out.println("Allrules: case n� " + i + ": remplie!");
		}

		rulesTab[0].setHTName("hauteur"); // la personne ayant la carte la plus
											// haute
		rulesTab[1].setHTName("paire"); // une paire
		rulesTab[2].setHTName("doublePaire"); // deux paires de deux nombres
												// diff�rents
		rulesTab[3].setHTName("brelan"); // 3 cartes du m�me num�ro
		rulesTab[4].setHTName("quinte"); // Suite de 5 cartes
		rulesTab[5].setHTName("color"); // 5 cartes de la m�me couleur
		rulesTab[6].setHTName("fullHouse"); // un brelan et une paire
		rulesTab[7].setHTName("carre"); // 4 cartes du m�me numero
		rulesTab[8].setHTName("quinteFlush"); // Suite de 5 cartes de la m�me
												// couleur
		rulesTab[9].setHTName("royalQuinteFlush"); // Suite d'un 10,
													// Valet,Reine, Roi, As (de
													// la m�me couleur)

	}

	protected void handSearching(Card[] flopHand) {

		Arrays.sort(flopHand);
		fillRules(allRules);
		

		boolean found = false;
		int cptSame = 1;
		int lastIndexFound = 0;
		int lastCardFound = 53;
		int i = 0;
			
		Card toFind = null;	

		// On test s'il y a une paire, un brelan ou un carr�
		
		// Tant que l'on a pas fini de parcourir le tableau et que l'on a rien trouv�
		do  {
			// On cherche les paires, brelans et carr�s
			for (i = 0; i < flopHand.length-1; i++) {
				toFind = flopHand[i];
				System.out.println("Carte cherchee : " + flopHand[i].getCardName() + " de " + flopHand[i].getColor());
				for (int j = i+1; j < flopHand.length; j++) {
				
					if (flopHand[j].getNumberCard() == toFind.getNumberCard() 
//						&& lastIndexFound != j 
						&& flopHand[i].getNumberCard() == lastCardFound) {
						found = true;
						cptSame += 1;
						// On r�cup�re le dernier indice o� une carte identique a �t� trouv�e
						lastIndexFound = j;
						lastCardFound = flopHand[j].getNumberCard();
						System.out.println("Trouve une carte � l'index [" + lastIndexFound+ "] , cartes identiques trouv�es : " + cptSame);
					} 
					else{
						found = false;
						
					}
					lastCardFound = flopHand[lastIndexFound].getNumberCard();
				}	
			}
		
		}while ((i < flopHand.length-1 && found == false)|| cptSame ==4);

		switch (cptSame) {

		case 1:
			System.out.println("Pas de paire, ni de brelan, ni de carr�");
			System.out.println("Found: " + found);
			System.out.println("Card to find :" + toFind.getCardName());
			break;

		case 2:
			allRules[1].setFound(true);
			System.out.println("Card to find :" + toFind.getCardName());
			System.out.println("Paire de " + flopHand[lastIndexFound].getCardName());
			break;

		case 3:
			allRules[3].setFound(true);
			System.out.println("Card to find :" + toFind.getCardName());
			System.out.println("Brelan de " + flopHand[lastIndexFound].getCardName());
			break;

		case 4:
			allRules[7].setFound(true);
			System.out.println("Card to find :" + toFind.getCardName());
			System.out.println("Carr� de " + flopHand[lastIndexFound].getCardName());
			break;

		default:
			System.out.println("IMPOSSIBLE: compteur sup�rieur � 4");
			System.out.println("Compteur = " + cptSame);
			break;
		}

	}
	
	protected int peerBrelanSquare(int cptSame, int lastIndexFound){
		
		
		return lastIndexFound;
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
