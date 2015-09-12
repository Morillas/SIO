package tpgit;

public class Personne {

	// D�claration
	private String adresse;
	private Compte monCompte=null;
	private String nom;
	private String test;
	
	// Constructeurs
	// Cas ou la personne � un compte (1 en multiplicit� de l'association)
	public Personne(String nom, String adresse, Compte monCompte){
		this.nom=nom;
		this.adresse=adresse;
		this.monCompte = monCompte;
	}

	// Cas ou la personne n'a pas de compte (0 en multiplicit� de l'association)
	public Personne(String nom, String adresse){
		this(nom,adresse,null);
	}

	
	// M�thodes
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
			System.out.println("Vous �tes � d�couvert, vous ne pouvez effectuer cette op�ration");
	}
	
	public void faireUnVirement(double montant, Personne p){
		if((monCompte.getSolde()-montant) >= 0){
			monCompte.faireUnVirement(montant, p.monCompte);
		}
		else
			System.out.println("Vous �tes � d�couvert, vous ne pouvez effectuer cette op�ration");
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
	
	// Red�finition de fonction toString
	public String toString(){
		return ("La personne " + nom + " habitant � " + adresse + " poss�de le " + monCompte);
	}
	
}