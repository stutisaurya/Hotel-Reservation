package com.Hotelreservation;

import java.util.ArrayList;

public class HotelReservation

{
	ArrayList<Hotel> hotelList = new ArrayList<Hotel>();

	public void printWelcomeMessage() {
		System.out.println("Welcome to the Hotel Reservation Program");
	}

	public void addHotelDetails() {

		hotelList.add(new Hotel("Lakewood", 110));
		hotelList.add(new Hotel("Bridgewood", 150));
		hotelList.add(new Hotel("Ridgewood", 220));
	}

}
