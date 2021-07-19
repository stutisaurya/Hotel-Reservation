package com.Hotelreservation;

import java.util.ArrayList;

/**
 * HotelReservation is a class of public type
 *
 * 
 */

public class HotelReservation

/**
 * Created a array list name as hotelsList
 *
 */

{
	ArrayList<Hotel> hotelList = new ArrayList<Hotel>();

	public void printWelcomeMessage() {
		System.out.println("Welcome to the Hotel Reservation Program");
	}

	/**
	 * addHotelDetails is a method of public void type Created a method
	 * addHotelDetails to add the hotels in the array list.
	 */

	public void addHotelDetails() {
		// Call Values in constructor

		hotelList.add(new Hotel("Lakewood", 110));
		hotelList.add(new Hotel("Bridgewood", 150));
		hotelList.add(new Hotel("Ridgewood", 220));
	}

}
