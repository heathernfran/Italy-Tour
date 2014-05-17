/*
	The ItalyTour class sets up general itineraries, based upon users' selections.
	
	@author Heather Frantisak
*/

public class ItalyTour
{
	private static int minDays = 3;
	
	private String city;
	private int numDays;
	private String dayTrip;

/**
	The ItalyTour constructor initializes a new ItalyTour object that is
	
	powered off, on channel 2, and with zero volume and mute off.

*/
	public ItalyTour() 
	{
		city = null;
		numDays = 0;
		dayTrip = null;
	}
	
 /**
 	The setCity method sets the city field to 
 	the string stored in the newCity argument.
 	@param newCity The new string for the city.
 */
	public void setCity(String newCity)
	{
			city = newCity;
	}

/**
	The setNumDays method sets the numDays field to 
	the value stored in the newNumDays argument.
	@param newNumDays The new value for the numDays.
*/	
	public void setNumDays(int newNumDays)
	{
		numDays = newNumDays;
	}

/**
	The setDayTrip method sets the newDayTrip field to
	the value stored in the newDayTrip argument.
	@param newDayTrip The new value for the dayTrip.
*/	
	public void setDayTrip(String newDayTrip)
	{
		if (numDays >= minDays)
			dayTrip = newDayTrip;
	}

/**
	The getCity method returns the value of the city string.
	@return The current city string.
*/	
	public String getCity()
	{
			return city;
	}

/**
	The getNumDays method returns the value of the numDays integer.
	@return The current numDays integer.
*/	
	public int getNumDays()
	{
		return numDays;
	}

/**
	The getDayTrip method returns the value of the dayTrip string.
	@return The current dayTrip string.
*/	
	public String getDayTrip()
	{
		if (numDays >= minDays)
		{
			if (city.equalsIgnoreCase("Rome"))
				dayTrip = "Orvieto, Tarquinia";
			else if (city.equalsIgnoreCase("Venice"))
				dayTrip = "Padova, Treviso, Verona";
		}
		return dayTrip;
	}

/**
    The toString method returns a String showing the object's state.
*/
	public String toString() 
	{
		String itinerary;
		itinerary = "Starting city: " + city;
		itinerary += "\nNumber of days: " + numDays;
		itinerary += "\nAny day trips: " + dayTrip;
		return itinerary;
	}
}