package org.generation.italy.eventi;

import java.time.LocalDate;

public class Event {
	private String title;
	private LocalDate date;
	private int totalSeats;
	private int resSeats;
	
	public Event(String title, LocalDate date, int totalSeats) throws Exception {
		this.resSeats = 0;
		this.totalSeats = totalSeats;
		setTitle(title);
		setDate(date);
		
		if (totalSeats < 0) {
			throw new Exception("Il numero dei posti totali non può essere negativo!");
		}
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) throws Exception{
		if(date.isBefore(LocalDate.now())) {
			throw new Exception("Questa data non è più disponibile");
		}
		this.date = date;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public int getResSeats() {
		return resSeats;
	}
	
	public void reserve() throws Exception {
		if(date.isBefore(LocalDate.now())) {
			throw new Exception("Questa data non è più disponibile");
		} else if (resSeats == totalSeats) {
			throw new Exception("Non ci sono più posti disponibili");
		}
			resSeats++;
	}
	
	public void cancel() throws Exception {
		if(date.isBefore(LocalDate.now())) {
			throw new Exception("Questa data non è più disponibile");
		} else if (resSeats == 0) {
			throw new Exception("Non ci sono prenotazioni per questa data");
		}
		resSeats --;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getDate() + " - " + getTitle();
	}
}
