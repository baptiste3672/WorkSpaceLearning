package fr.baptiste.perimetre;

import java.util.Scanner;

public class Compte {
	public String typeDeCompte, numeroCompte, numeroCompteInput;
	public int dateCreation;
	float taux, val;
	public Scanner lectureClavier = new Scanner(System.in);
	
	public void creerCpte() {
		System.out.println("------------------------------------------------------------");
		System.out.println("Type du compte [Types possibles : courant, joint, �pargne] :");
		typeDeCompte = lectureClavier.nextLine();	
			
		switch (typeDeCompte) {
		case "C":
			typeDeCompte = "Courant";
			break;
		case "J":
			typeDeCompte = "Joint";
			break;
		case "E":
			typeDeCompte = "Epargne";
		default:
			typeDeCompte = "Default";
			System.out.println("Le type de compte n'a pas �t� initialiser correctement");
			break;
		}
		System.out.println(typeDeCompte);
		
		System.out.println("Numero du compte : ");
		numeroCompte = lectureClavier.nextLine();
		System.out.println(numeroCompte);
		System.out.println("Premi�re valeur credit�e : ");
		System.out.println("Taux de placement : ");
		System.out.println("------------------------------------------------------------");
	}
	
	public void afficherCpte() {
		boolean attente = false;
		System.out.println("------------------------------------------------------------");
		System.out.println("Saisissez le num�ro du compte : ");
		numeroCompteInput = lectureClavier.nextLine();
		if(numeroCompte.equalsIgnoreCase(numeroCompteInput))
		{
			System.out.println("------------------------------------------------------------");
			System.out.println("Type de compte : " + typeDeCompte);
			System.out.println(numeroCompte);
			System.out.println("Solde : 365\u20AC");
		}else {
			System.out.println("------------------------------------------------------------");
			System.out.println("Code erron� !");
			return;
		}
		System.out.println("Rentr�e 'true' une fois que vous avez fini de voir l'�tat du compte.");
		do{
			attente = lectureClavier.nextBoolean();
		}while(attente == false);
	}
}