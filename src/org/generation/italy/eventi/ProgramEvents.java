package org.generation.italy.eventi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProgramEvents {
	
	private String programEventsTitle;
	private List<Event> events;
	
	public ProgramEvents(String programEventsTitle) {
		setProgramEventsTitle(programEventsTitle);
		this.events = new ArrayList<>();
	}

	public String getProgramEventsTitle() {
		return programEventsTitle;
	}

	public void setProgramEventsTitle(String programEventsTitle) {
		this.programEventsTitle = programEventsTitle;
	}
	
	public void addEventToProgram(Event e) {
		events.add(e);
	}
	
	public void clearProgramEventsList() {
		events.clear();
	}
	
	public int getNumberOfEventsInProgram() {
		return events.size();
	}
	
	public List <Event> getEventsInCertainDate( LocalDate date) {
		List <Event> eventsInCertainDate = new ArrayList<>();
		for(Event e : events) {
			if (e.getDate().equals(date)) {
				eventsInCertainDate.add(e);
			}
		}
			return eventsInCertainDate;
		}
	
	private void sortEventsList() {
		events.sort((e1, e2) -> e1.getDate().compareTo(e2.getDate()));
	}
	
	public String getListEventsFromProgramByDate() {
		String listEventsFromProgramByDate = getProgramEventsTitle();
		
		sortEventsList();
		
		for(Event e: events) {
			listEventsFromProgramByDate += e.getDate() + " - " + e.getTitle() + "\n";
		}
		
		return listEventsFromProgramByDate;
	}
	
	
	@Override
	public String toString() {
		return getListEventsFromProgramByDate();
	}

}