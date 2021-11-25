import java.util.*;
import Cartes.RumourCartes;

public class Joueur {
	private int idJoueur;
	private int points;
	private Role role;
	private boolean estRevele;
	private ArrayList<RumourCartes> rumourCartes;
	
	public int getIdJoueur() {
		return this.idJoueur;
	}
	public int getPoints() {
		return this.points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public boolean estRevele() {
		return this.estRevele;
	}
	
}
