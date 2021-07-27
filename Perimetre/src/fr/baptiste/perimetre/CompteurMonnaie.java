package fr.baptiste.perimetre;

import java.util.Scanner;

public class CompteurMonnaie {

	public static void main(String[] args) {
		int piece=0, nb5cents=0, nb10cents=0, nb20cents=0, montant=0;
		Scanner lectureClavier = new Scanner(System.in);
		do {
			System.out.println("Veillez indiquer le montant de la piece inséré :");
			piece = lectureClavier.nextInt();
			switch(piece)
			{
				case 5 :
					nb5cents = nb5cents + 5;
					System.out.println(nb5cents);
					break;
				case 10 :
					nb10cents = nb10cents + 10;
					break;
				case 20 :
					nb20cents = nb20cents + 20;
					break;
				default: 
					System.out.println("Vous ne pouvez donner que des pièces de 5, 10, 20 !!");
			}
			montant = nb10cents + nb20cents + nb5cents;
			System.out.println(montant);
		}while(montant < 45);
		System.out.println("Vous avez donné : " + montant + " \u20AC. \nOn vous doit : " + (montant-45) + " \u20AC.");
	}
	
}
