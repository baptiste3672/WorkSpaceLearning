package fr.baptiste.perimetre;

import java.util.Scanner;

public class LigneComptable {
	public String modeDePayement, numeroCompte="36F", numeroCompteInput, motifAV;
	public double sommeC, solde=1365;
	public int date;
	public Scanner lectureClavier = new Scanner(System.in);
	
	public void getCréerLigneComptable() {
		System.out.println("------------------------------------------------------------");
		System.out.println("Saisissez le numéro du compte : ");
		numeroCompteInput = lectureClavier.nextLine();
		if(numeroCompte.equalsIgnoreCase(numeroCompteInput))
		{
			System.out.println("------------------------------------------------------------");
			System.out.println("Type de compte : " + numeroCompte);
			System.out.println("Solde : "+ solde +"\u20AC");
			System.out.println("Quelle somme à créditer (valeur positif) ou à débiter (valeur négitif) :");
			do {
				if((solde + sommeC) < 0) {
					System.out.println("Action Impossible, solde compte insuffisant, veillez indiquer une somme possible.");
				}
				sommeC = lectureClavier.nextDouble();
			}while((solde + sommeC) < 0);
			solde += sommeC;
			System.out.println("Solde compte : " + solde + "\u20AC");
		}else {
			System.out.println("------------------------------------------------------------");
			System.out.println("Code compte erroné !");
			return;
		}
	}
}
