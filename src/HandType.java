import java.util.Arrays;

public class HandType {
	
	private String HTName;
	private boolean found;
	private int value;
	private Card highter
	
	private HandType[] allRules = new HandType[10];

	
	public HandType() {
		
	}
	
	public HandType(String HTName, boolean found, int value){
		
		this.HTName = HTName;
		this.found = found;
		this.value = value;
		
	}

// --------------------------------METHODES----------------------------------------------------------------------------
	
	public HandType[] fillRules (HandType rulesTab[]){
		
		rulesTab = new HandType[10];
		
		rulesTab[1].setHTName("hauteur"); // la personne ayant la carte la plus haute 
		rulesTab[2].setHTName("paire"); // une paire
		rulesTab[3].setHTName("doublePaire"); // deux paires de deux nombres différents
		rulesTab[4].setHTName("brelan"); // 3 cartes du même numéro
		rulesTab[5].setHTName("quinte"); // Suite de 5 cartes
		rulesTab[6].setHTName("color"); // 5 cartes de la même couleur
		rulesTab[7].setHTName("fullHouse"); // un brelan et une paire
		rulesTab[8].setHTName("carre");	// 4 cartes du même numero
		rulesTab[9].setHTName("quinteFlush"); // Suite de 5 cartes de la même couleur
		rulesTab[10].setHTName("royalQuinteFlush"); // Suite d'un 10, Valet, Reine, Roi, As (de la même couleur)
		
		for(int i = 0; i<rulesTab.length; i++){
			rulesTab[i].setFound(false);
			rulesTab[i].setValue(0);
		}
		
		return rulesTab;
	}
	
	protected void handSearching (Card[] flopHand){
		
		Arrays.sort(flopHand);
		fillRules(allRules);
		
	}
	
	protected void highterFound (Card [] flopHand){
		
		
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


	
//	-SETTERS---------------------------------------------------	

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
