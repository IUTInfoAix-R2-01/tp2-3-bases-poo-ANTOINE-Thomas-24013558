package Prof;

public class Personne {
	public String Nom;
	public String Prenom;
	
	public Personne(String Prenom, String Nom) {
		this.Nom = Nom;
		this.Prenom = Prenom;
	}
	public Personne(String Prenom) {
		this.Prenom = Prenom;
	}
	public String getNom() {
		return Nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public String toString() {
		if (Nom == null) {
			return Prenom;
		}
		else {
		return Prenom + " " + Nom;
		}
	}
}
