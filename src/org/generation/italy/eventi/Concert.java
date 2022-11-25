package org.generation.italy.eventi;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalTime;

public class Concert extends Event {
	
	private LocalTime concertTime;
	private BigDecimal concertPrice;
	
	public Concert (String title, LocalDate date, int totalSeats, LocalTime concertTime, BigDecimal  concertPrice) throws Exception {
		super(title, date, totalSeats);
		setConcertTime(concertTime);
		setConcertPrice(concertPrice);
	}

	public LocalTime getConcertTime() {
		return concertTime;
	}

	public void setConcertTime(LocalTime concertTime) {
		this.concertTime = concertTime;
	}

	public BigDecimal getConcertPrice() {
		return concertPrice;
	}

	public void setConcertPrice(BigDecimal concertPrice) {
		this.concertPrice = concertPrice;
	}
	
	public String getConcertDateAndTime() {
		return getDate() + " - " + getConcertTime();
	}
	
	public String getFormattedPrice() {
		DecimalFormat formatPrice = new DecimalFormat("##.00");
		return formatPrice.format(getConcertPrice()) + "€";
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Data: " + getConcertDateAndTime() + " - " + "Concerto: " + getTitle()  + " - " + "Prezzo del biglietto: " + getFormattedPrice();
	}
}
