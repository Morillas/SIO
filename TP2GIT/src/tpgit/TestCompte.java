package tpgit;

public class TestCompte {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Invocation des constructeurs et création de nouvelles instances
		Compte compte1 = new Compte("1010 55 221 12", 100);
		Personne p1 = new Personne("Toto", "Ajaccio", compte1);
		
		// Le compte ne pourra être manipulé qu'à partir des méthodes de la classe Personne 
		Personne p2 = new Personne("Titi", "Ajaccio", new Compte("1020 22 2222"));

		
		// Test des méthodes pour le compte 1
		compte1.deposer(1500);
		System.out.println(compte1.toString());
		
		compte1.retirer(100);
		System.out.println(compte1);
		
		p1.faireUnVirement(1500, p2);
		System.out.println(p1);
		System.out.println(p2);
		
		System.out.println("----------");
		// Test des méthodes pour le compte 2
		p2.faireUnDepot(1500);
		System.out.println(p2);
		
		p2.faireUnRetrait(100);
		System.out.println(p2);
		
		p2.faireUnVirement(1500, p1);
		System.out.println(p1);
		System.out.println(p2);
	}

}
