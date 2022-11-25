package org.generation.italy.eventi;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Crea un titolo per l'evento: ");
		String title = sc.nextLine();
		
		System.out.print("Imposta la data dell'evento (yyyy-mm-dd): ");
		String dateString = sc.next();
		LocalDate date = LocalDate.parse(dateString);
		
		System.out.print("Imposta il numero di posti totali: ");
		int totalSeats = sc.nextInt();
		
		Event e1 = null;
		
		try {
			e1= new Event(title, date, totalSeats);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("Vuoi prenotare posti? Digita Y/N");
		String userChoiceRes = sc.next();
		if (userChoiceRes.toLowerCase().equals("y")) {
			System.out.println("Quanti posti vuoi prenotare?");
			int resSeatsNumber = sc.nextInt();
	
			for (int i = 0; i < resSeatsNumber; i++ ) {
				try {
					e1.reserve();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			System.out.println("Posti totali: " + e1.getTotalSeats() +
					"\nPosti prenotati: " + e1.getResSeats() + 
					"\nPosti ancora disponibili per questo evento: " + (e1.getTotalSeats() - e1.getResSeats()));
			
			System.out.println("-----------------------------------------------------------------------");
			
			System.out.println("Vuoi disdire dei posti? Digita Y/N");
			String userChoiceCanc = sc.next();
			if (userChoiceCanc.toLowerCase().equals("y")) {
				System.out.println("Quanti posti vuoi disdire?");
				int cancSeatsNumber = sc.nextInt();
		
				for (int i = 0; i < cancSeatsNumber; i++ ) {
					try {
						e1.cancel();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
			System.out.println("Posti totali: " + e1.getTotalSeats() +
								"\nPosti prenotati: " + e1.getResSeats() + 
								"\nPosti ancora disponibili per questo evento: " + (e1.getTotalSeats() - e1.getResSeats()));
									
		}
		
//		Test Istanza
		
//		Evento e1 =null;
//		Evento e2 = null;
//		
//		try {
//			 e1 = new Evento("Il concertone terribilone", LocalDate.parse("2023-01-14"), 100);
//			 //e2 = new Evento("Super Concerto", LocalDate.parse("2022-10-05"), 150); <---Test eccezione data precedente
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println(e1);
//		//System.out.println(e2); <---Test eccezione data precedente
		
		
	}
}
