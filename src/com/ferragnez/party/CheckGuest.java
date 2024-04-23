package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String [] invitati = {"Dua Lipa" , "Paris Hilton" ,
				"Manuel Agnelli" , "J-Ax" , "Francesco Totti" ,
				"Ilary Blasi" , "Bebe Vio" , "Luis" , 
				"Pardis Zarei" , " Martina Maccherone" ,
				"Rachel Zeilic" };
		
		System.out.println("inserisci il tuo nome e cognome");
		String nome = scan.nextLine();
		boolean presente = false;
		
		for (int i = 0; i < invitati.length; i++ ) {
			
			if (invitati[i].equals(nome)){
				presente = true;
			   }
			break;
		    }
			
		    if (presente == true) {
		    	System.out.println ("Puoi entrare al party");
				
			}else {
				System.out.println ("Non puoi entrare al party");
				
			}
		    
			
		}
	}


