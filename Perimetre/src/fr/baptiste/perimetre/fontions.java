package fr.baptiste.perimetre;

import java.util.Scanner;

public class fontions {
	
	public static void main(String [] parametre)
	{
		int a, compteur;
		Scanner sc = new Scanner(System.in);
		for(compteur = -5; compteur <= 5; compteur ++)
		{
			a = calculer(compteur);
			System.out.println(a);
		}
		System.out.println("Donnez le nombre factoriel : ");
		int nFactoriel = sc.nextInt();
		nFactoriel= factoriel(nFactoriel);
		System.out.println("Valeur de la factoriel : " + nFactoriel);
	}
	
	public static int calculer (int x)
	{
		int resultat;
		resultat = -x * x + 3 * x - 2;
		return resultat;
	}
	
	public static int factoriel(int x)
	{
		int calcul = x;
		for(int i = x-1; i > 0; i--)
		{
			calcul = calcul * i;
		}
		return calcul;
	}
}
