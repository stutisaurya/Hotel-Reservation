package com.Hotelreservationsystem;

import org.junit.BeforeClass;
import org.junit.Test;

import com.Hotelreservation.HotelReservation;

public class HotelReservationTest {
	static HotelReservation hotelReservation;

	@BeforeClass
	public static void initialize() {
		hotelReservation = new HotelReservation();
	}

	@Test
	public void shouldPrintWelcomeMessage() {
		// Create object
		HotelReservation hotelReservation = new HotelReservation();
		hotelReservation.printWelcomeMessage();
		hotelReservation.addHotelDetails();

	}

}
