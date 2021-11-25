package Cartes;

public abstract class RumourCartes {
	private String huntEffet;
	private String witchEffet;
	private int idCarteRumour;
	
	public RumourCartes(String huntEffet, String witchEffet, int idCarteRumour) {
		this.huntEffet = huntEffet;
		this.witchEffet = witchEffet;
		this.idCarteRumour = idCarteRumour;
	}

	public int getNumCarte() {
		return this.idCarteRumour;
	}
	
	
	public abstract boolean huntEffetJouable(int IdJoueur);
	
	public abstract boolean witchEffetJouable(int IdJoueur);
	
	public abstract void appliquerHuntEffet(int IdJoueur);
	
	public abstract void appliquerWitchEffet(int IdJoueur);
	
}
