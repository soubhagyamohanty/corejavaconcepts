package com.emc.test;

import com.emc.entities.Event;
import com.emc.entities.Organizer;

public class Test {

	public static void main(String[] args) {
		
		Organizer organizer = new Organizer();
		organizer.id =123l;
		organizer.name ="Apple Inc";
		System.out.println(organizer);
		System.out.println(organizer.name);
		
		Event event = new Event(456l,"Iphone7 Launch","Grand Launch");
		/*
		 * event.id = 456l; event.name ="Iphone7 Launch"; event.description
		 * ="Grand Launch"; 
		 */
		System.out.println(event);
		System.out.println(event.name);
		System.out.println(event.description);
				

	}

}
