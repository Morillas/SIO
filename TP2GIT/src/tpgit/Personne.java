package tpgit;

public class Personne {

	// Déclaration
	private String adresse;
	private Compte monCompte=null;
	private String nom;
	private String test;
	
	// Constructeurs
	// Cas ou la personne à un compte (1 en multiplicité de l'association)
	public Personne(String nom, String adresse, Compte monCompte){
		this.nom=nom;
		this.adresse=adresse;
		this.monCompte = monCompte;
	}

	// Cas ou la personne n'a pas de compte (0 en multiplicité de l'association)
	public Personne(String nom, String adresse){
		this(nom,adresse,null);
	}

	
	// Méthodes
	public void changerCompte(Compte compte){
		monCompte=compte;
	}
	
	public void faireUnDepot(double montant){
		monCompte.deposer(montant);
	}
	
	public void faireUnRetrait(double montant){
		if((monCompte.getSolde()-montant) >= 0){
			monCompte.retirer(montant);
		}
		else
			System.out.println("Vous êtes à découvert, vous ne pouvez effectuer cette opération");
	}
	
	public void faireUnVirement(double montant, Personne p){
		if((monCompte.getSolde()-montant) >= 0){
			monCompte.faireUnVirement(montant, p.monCompte);
		}
		else
			System.out.println("Vous êtes à découvert, vous ne pouvez effectuer cette opération");
	}
	
	
	// Accesseurs
	public String getAdresse(){
		return adresse;
	}
	
	public String getNom(){
		return nom;
	}
	
	public double monSolde(){
		return monCompte.getSolde();	
	}
	
	// Redéfinition de fonction toString
	public String toString(){
		return ("La personne " + nom + " habitant à " + adresse + " possède le " + monCompte);
	}
	
}