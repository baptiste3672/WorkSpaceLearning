package fr.baptiste.perimetre;

public class fontions {
	
	public static void main(String [] parametre)
	{
		int a, compteur;
		for(compteur = -5; compteur <= 5; compteur ++)
		{
			a = calculer(compteur);
			System.out.println(a);
		}
	}
	
	public static int calculer (int x)
	{
		int resultat;
		resultat = -x * x + 3 * x - 2;
		return resultat;
	}
}
