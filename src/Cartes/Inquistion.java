package Cartes;

public class Inquistion extends RumourCartes {
	private static final String inquistionHunt = "Discard a card from your hand, Take next turn";
	private static final String inquistionWitch = "Choose next player";
	private static final int inquistionId = 2;

	public Inquistion() {
		super(inquistionHunt, inquistionWitch, inquistionId);
	}

	public boolean huntEffetJouable(int IdJoueur) {
		return false;
	}

	@Override
	public boolean witchEffetJouable(int IdJoueur) {
		return true;
	}

	@Override
	public void appliquerHuntEffet(int IdJoueur) {
		
	}

	@Override
	public void appliquerWitchEffet(int IdJoueur) {
		
	}
	
}
