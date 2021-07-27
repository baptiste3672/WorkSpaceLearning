package fr.baptiste.perimetre;

import java.util.*;

public class lePerimetre {

	public static void main(String[] args) 
	{
		Scanner lectureClavier = new Scanner(System.in);
//        int nbCB = 0, nbVirement = 0, nbCheque = 0, nbtotalP=0, info=0;
//        float pcCB = 0.f, pcVirement = 0.f, pcCheque = 0.f;
//        double F = 0.0f, E = 0.0f, Val = 6.55957, conv= 0.0f;
//        
//        System.out.print("Nombre de transaction par Carte Bleue :");
//        nbCB = lectureClavier.nextInt();
//        System.out.print("Nombre de transaction par Virement :");
//        nbVirement = lectureClavier.nextInt();
//        System.out.print("Nombre de transaction par Chèque :");
//        nbCheque = lectureClavier.nextInt();
//        
//        nbtotalP = nbCB + nbCheque + nbVirement;
//        
//        pcCB = (float) nbCB / nbtotalP * 100;
//        pcCheque = (float) nbCheque / nbtotalP * 100;
//        pcVirement = (float) nbVirement / nbtotalP * 100;
//        
//        System.out.print("Nombre total de transaction : " + nbtotalP + "\n");
//        System.out.print("Pourcentage de transaction par Carte Bleue : " + pcCB + "\n");
//        System.out.print("Pourcentage de transaction par Virement : " + pcVirement + "\n");
//        System.out.print("Pourcentage de transaction par Chèque : " + pcCheque + "\n");
//        
//        System.out.println("Qui s\u00E8me le vent, r\u00E9colte la temp\u00EAte.");
//        String encodage = System.getProperty("file.encoding");
//        System.out.println("Encodage par défaut : " + encodage);
//        
//        System.out.println("Taper 1 pour une conversion euro/franc ou 2 pour une conversion franc/euro : ");
//        info = lectureClavier.nextInt();
//        if(info == 1)
//        {
//        	System.out.println("Donner la valeur en euro de conversion : ");
//            E = lectureClavier.nextDouble();
//            conv = E * Val;
//            System.out.println("Valeur euro : " + E +" en franc de : " + conv);
//            
//        }
//        else if(info == 2)
//        {
//            System.out.println("Donner la valeur en franc de conversion : ");
//            F = lectureClavier.nextDouble();
//            conv = F / Val;
//            System.out.printf("Valeur franc : %.0f en euro de : %.2f",F, conv);
//        }
//        else
//        {
//        	System.out.println("VALEUR ERROR");
//        }
        
		byte mois = 0, nbjours = 0;
		short annee = 0;
		System.out.println("De quelle mois s'agit t'il ? ");
		mois = lectureClavier.nextByte();
		System.out.println("De quelle année s'agit t'il ? ");
		annee = lectureClavier.nextShort();
		switch(mois)
		{
			case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12:
				nbjours = 31;
				break;
			case 9: case 11: case 4: case 6:
				nbjours = 30;
				break;
			case 2: 
				if(annee%4 == 0 && annee%100 != 0 || annee%400==0)
				{
					nbjours = 29;
				}
				else nbjours = 28;
				break;
			default:
				System.out.println("Impossible, ce mois n'existe pas");
				System.exit(0);
		}
		System.out.print("En " + annee + ", le mois n° " + mois);
		System.out.println(" a " + nbjours + " jours");
	}
}