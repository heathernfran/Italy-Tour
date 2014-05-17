/**
	The program demonstrates the ItalyTour class.
	
	@author Heather Frantisak
*/

import java.util.*;

public class ItalyTourDemo
{
	public static void main(String[] args)
	{
		// Variables for input.
		String startCity;
		int travelDays;

		ItalyTour myTrip = new ItalyTour();
		
		Scanner kb = new Scanner(System.in);

		System.out.print("Airlines are currently flying into Rome and Venice.  \n" +
			"Which city would you like to visit? ");
		startCity = kb.nextLine();
		myTrip.getCity();
		myTrip.setCity(startCity);

		System.out.print("How many days will you spend in there? ");
		travelDays = kb.nextInt();
		myTrip.getNumDays();
		myTrip.setNumDays(travelDays);

		myTrip.getDayTrip();

		// Displays the object myTrip.
		System.out.print(myTrip.toString());
		System.out.println();
	}
}