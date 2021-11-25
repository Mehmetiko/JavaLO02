package Cartes;

public class PointedHat extends RumourCartes {
	
	private static final String pointedHatHunt = "Take one of your own reveale rumour cards into your hands and take next turn";
	private static final String pointedHatWitch = "Take one of your own revealed rumour cards into your hands and choose next player";
	private static final int pointedHatId = 3;

	public PointedHat() {
		super(pointedHatHunt, pointedHatWitch, pointedHatId);
	}

	@Override
	public boolean huntEffetJouable(int IdJoueur) {
		//Si le joueur a revele un rumourcard => return true
		//else return false
		return false;
	}

	@Override
	public boolean witchEffetJouable(int IdJoueur) {
		// Si le joueur a revele un rumourcard => return true;
		// else return false
		
		return false;
	}

	@Override
	public void appliquerHuntEffet(int IdJoueur) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void appliquerWitchEffet(int IdJoueur) {
		// TODO Auto-generated method stub
		
	}
		
}
