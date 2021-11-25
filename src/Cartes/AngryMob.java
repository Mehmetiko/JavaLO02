package Cartes;

public class AngryMob extends RumourCartes {
	private static final String angryMobHunt = "Reveal another player's identity";
	private static final String angryMobWitch = "Take next turn";
	private static final int angryMobId = 1;

	public AngryMob() {
		super(angryMobHunt, angryMobWitch, angryMobId);
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
