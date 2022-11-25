package org.generation.italy.eventi;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		//Test Milestone 1 e 2
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("Crea un titolo per l'evento: ");
//		String title = sc.nextLine();
//		
//		System.out.print("Imposta la data dell'evento (yyyy-mm-dd): ");
//		String dateString = sc.next();
//		LocalDate date = LocalDate.parse(dateString);
//		
//		System.out.print("Imposta il numero di posti totali: ");
//		int totalSeats = sc.nextInt();
//		
//		Event e1 = null;
//		
//		try {
//			e1= new Event(title, date, totalSeats);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//		System.out.println("Vuoi prenotare posti? Digita Y/N");
//		String userChoiceRes = sc.next();
//		if (userChoiceRes.toLowerCase().equals("y")) {
//			System.out.println("Quanti posti vuoi prenotare?");
//			int resSeatsNumber = sc.nextInt();
//	
//			for (int i = 0; i < resSeatsNumber; i++ ) {
//				try {
//					e1.reserve();
//				} catch (Exception e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//			
//			System.out.println("Posti totali: " + e1.getTotalSeats() +
//					"\nPosti prenotati: " + e1.getResSeats() + 
//					"\nPosti ancora disponibili per questo evento: " + (e1.getTotalSeats() - e1.getResSeats()));
//			
//			System.out.println("-----------------------------------------------------------------------");
//			
//			System.out.println("Vuoi disdire dei posti? Digita Y/N");
//			String userChoiceCanc = sc.next();
//			if (userChoiceCanc.toLowerCase().equals("y")) {
//				System.out.println("Quanti posti vuoi disdire?");
//				int cancSeatsNumber = sc.nextInt();
//		
//				for (int i = 0; i < cancSeatsNumber; i++ ) {
//					try {
//						e1.cancel();
//					} catch (Exception e) {
//						e.printStackTrace();
//					}
//				}
//			}
//			
//			System.out.println("Posti totali: " + e1.getTotalSeats() +
//								"\nPosti prenotati: " + e1.getResSeats() + 
//								"\nPosti ancora disponibili per questo evento: " + (e1.getTotalSeats() - e1.getResSeats()));
//									
//		}
		
		// Test milestone 3
		
//		Event e1 = null;
//		Event e2 = null;
//		Event e3 = null;
//		
//		try {
//			e1= new Event("Gino e l'accendino", LocalDate.parse("2025-09-15"), 100);
//			e2= new Event("Franco e il suo gruppo stanco", LocalDate.parse("2025-12-12"), 150);
//			e3= new Event("Noodles of Wooden Cuddles ", LocalDate.parse("2025-12-12"), 100);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		ProgramEvents progEv1 = new ProgramEvents("Can-ora: Manifestazione di musica da cani \n");		
//		
//		progEv1.addEventToProgram(e1);
//		progEv1.addEventToProgram(e2);
//		progEv1.addEventToProgram(e3);
//		
//		System.out.println(progEv1);
//		
//		List <Event> december12thDateList = progEv1.getEventsInCertainDate(LocalDate.parse("2025-12-12"));
//		
//		int eventCount = december12thDateList.size();
//		
//		System.out.println("Ci sono"  + " " + eventCount + " " + "eventi presenti in questa data: " +
//				"\n");
//		
//		for(Event date : december12thDateList) {
//			Event decemberDate = date;
//			System.out.println(decemberDate);
//		}
//		
//		
//		System.out.println("--------------------------------------------------------------------");
//		
//		System.out.println("Numero eventi presenti: " + progEv1.getNumberOfEventsInProgram());
//		progEv1.clearProgramEventsList();
//		System.out.println("Eventi rimasti: " + progEv1.getNumberOfEventsInProgram());
		
		
		Concert c1 = null;
		
		try {
			c1= new Concert("Elio e le Storie Tese in concerto",LocalDate.parse("2023-12-12"), 500, LocalTime.parse("19:00"), BigDecimal.valueOf(35.50));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(c1);
	}
}
