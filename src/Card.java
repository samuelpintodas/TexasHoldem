
public class Card {
	
	private int idCard;	// place de la Cards dans le deck
	private int numberCard;	// numéro de la Card dans sa couleur (de 1 à 13)
	private String cardName; // nom de la Card (concerne surtout As, Valet, Reine, Roi)
	private String color;	// couleur de la Card (Piques, Coeurs etc...)
	private boolean piochee;	// indique si la Card a été piochée ou non
	private boolean visible;	// indique si l'on peut voir la carte

	protected Card() {
		
		this.piochee = false;
		this.visible = false;
	}
	
// --------------------------------GETTERS & SETTERS----------------------------------------------------------------------------		

// -GETTERS---------------------------------------------------	
	
	protected int getIdCard() {
		
		return idCard;
	}


	protected int getNumberCard() {

		
		return numberCard;
	}


	protected String getCardName() {
		
		return cardName;
	}


	protected String getColor() {

		return color;
	}
	
	protected boolean isPiochee() {
		
		return piochee;
	}
	
	protected boolean isVisible() {
		return visible;
	}

//	-SETTERS---------------------------------------------------	
	
	protected void setIdCard(int idCard) {
		
		this.idCard = idCard;
		
//		System.out.println("coucou idCard");
		
		setColor(idCard);
		setNumberCard(idCard);
		setCardName(numberCard);
		setPiochee(false);
	}


	protected void setNumberCard(int numberCard) {
		
		numberCard = idCard+1;
		
		numberCard = numberCard%13;
		
		if(numberCard==0)
			numberCard= 13;
			
		
		this.numberCard = numberCard;
		
//		System.out.println("coucou numberCard");
		
	}


	protected void setCardName(int numberCard) {
		
		if(numberCard>1 && numberCard<11)
		{
			cardName = String.valueOf(numberCard);
		}
		
		switch (numberCard){
		case 1:
			cardName = "As";
			break;
		case 11:
			cardName = "Valet";
			break;
		case 12:
			cardName = "Dame";
			break;
		case 13:
			cardName = "Roi";
			break;
		case 0:
			System.out.println("Carte inexistante");
			break;
		}
		
//		System.out.println("coucou cardName");
		
	}


	protected void setColor(int idCard) {
		
		if(idCard>=0 && idCard<13)
			color = "Piques";
		
		else if(idCard>=13 && idCard<26)
			color = "Coeurs";
		
		else if(idCard>=26 && idCard<39)
			color = "Carreaux";
		
		else if(idCard>=39 && idCard<52)
			color = "Trefles";
		
//		System.out.println("coucou color");
		
	}



	protected void setPiochee(boolean piochee) {
		
		this.piochee = piochee;
	}
	
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	
	

}
