package servlet;

public class BateauDragon {

	private String nom;
	private boolean status;
	private int taille;
	
	public BateauDragon() {
		super();
	}
	
	public BateauDragon(String nom, boolean status, int taille) {
		super();
		this.nom = nom;
		this.status = status;
		this.taille = taille;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public int getTaille() {
		return taille;
	}
	public void setTaille(int taille) {
		this.taille = taille;
	}
	@Override
	public String toString() {
		return "BateauDragon [nom=" + nom + ", status=" + status + ", taille=" + taille + "]";
	}
	
	
	
}
