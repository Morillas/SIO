package tpgit;

public class Compte {

	// Attributs
	private String numero;
	private double solde;
	
	// Constructeurs
	public Compte(String numero){
		this(numero,0);
	}
		
	public Compte(String numero, double depotInitial){
		this.numero=numero;
		solde=depotInitial;
	}
	
	// M�thodes
	public void deposer(double montant){
		solde=solde+montant;
	}
		
	public void faireUnVirement(double montant, Compte compteDestinataire){
		if((solde-montant) >= 0){
			solde-=montant;
			compteDestinataire.solde=solde+montant;
		}
		else
			System.out.println("Vous �tes � d�couvert, vous ne pouvez effectuer cette op�ration");
	}
	
	
	// Accesseurs
	public String getNumero(){
		return numero;
	}
	
	/** M�thode ne pouvant �tre impl�ment�e avec une association navigable vers Compte
	public Personne getTitulaire(){
		return new Personne();
	}**/
	
	public double getSolde(){
		return solde;
	}
	
	public void retirer(double debit){
		if((solde-debit) >=0)
			solde=solde-debit;
		else
			System.out.println("Vous �tes � d�couvert, vous ne pouvez effectuer cette op�ration");
	}
	

	/** M�thode ne pouvant �tre impl�ment�e avec une association navigable vers Compte
	public Personne setTitulaire(Personne titulaire){
		return new Personne();
	}
	**/

	// Red�finition de fonction
	public String toString(){
		return ("Compte : " + numero + " a pour solde : " + solde + " �");
	}
}