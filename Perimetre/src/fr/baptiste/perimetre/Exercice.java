package fr.baptiste.perimetre;

import java.util.*;

public class Exercice {

	public static void main(String[] args) {
		//Les oiseaux ont des plumes.
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.println("Veillez saisir une phrase :");
		String phrase = sc.nextLine();
		System.out.println(phrase);
		System.out.println("M : " + phrase.toUpperCase());
		for(int i = 0; i < phrase.length(); i++)
		{
			if(phrase.charAt(i) == 'e')
				count++;
		}
		System.out.println("C : " + phrase.length());
		System.out.println("Le nombre de 'e' dans la phrase : " + count);
		if(count > 0)
			System.out.println("R : " + phrase.replace('e', '*'));
	}
}
