package fr.baptiste.perimetre;

import java.util.Scanner;

public class CompteBancaire {
	
	public static void main(String[] args) 
	{
		int a = 0, date;
		double valeur;
		char theme, moyenPaiement;
		String typeDeCompte = null, numeroCompte;
		Compte compte = new Compte();
		LigneComptable ligneComptable = new LigneComptable();
		Scanner lectureClavier = new Scanner(System.in);
		while (true) {
			a = menuPrincipal();
			switch(a)
			{
				case 1:
					compte.creerCpte();
					break;
				case 2:
					compte.afficherCpte();
					break;
				case 3:
					ligneComptable.getCréerLigneComptable();
					sortir();
					break;
				case 4:
					sortir();
					break;
				case 5:
					alAide();
					break;
				default:
					System.out.println("\nERROR SAISIE INVALID");
			}
		}
	}
	
	public static int menuPrincipal() 
	{
		int c = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("-----------------------Menu principal-----------------------");
		System.out.println("1. Creer un compte");
		System.out.println("2. Afficher un compte");
		System.out.println("3. Creer une ligne comptable");
		System.out.println("4. Sortir");
		System.out.println("5. De l'aide");
		System.out.print("\nVotre choix : ");
		c = sc.nextInt();
		if (c < 6)
		{
			return c;
		}
		else
		{
			while(c >= 6)
			{
				System.out.println("------------------------------------------------------------");
				System.out.println("Saissisez une valeur correcte");
				System.out.print("\nVotre choix : ");
				c = sc.nextInt();
			}
			return c;
		}
	}
	
	public static void sortir()
	{
		System.out.println("------------------------------------------------------------");
		System.out.println("Merci d'avoir utilisé nos services.");
		System.out.println("A bientôt");
		System.out.println("------------------------------------------------------------");
		System.exit(-1);
	}
	
	public static void alAide()
	{
		System.out.println("------------------------------------------------------------");
		System.out.println("1. Permet d'ouvrir un compte");
		System.out.println("\nVeillez selectionner une action que vous souhaitez faire\nSinon vous pouvez quitter le programme en appuyant sur X");
		System.out.println("------------------------------------------------------------");
	}
}
