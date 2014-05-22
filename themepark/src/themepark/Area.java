package themepark;

import java.util.ArrayList;

public class Area {
	private String _name;
	private ArrayList<Ride> _rides;
	
	public Area(String name) {
		_name = new String(name);
		_rides = new ArrayList<Ride>();
	}
	
	public String getName() {
		return _name;
	}
	
	public ArrayList<Ride> getRides() {
		return _rides;
	}
	
	public void addRide(Ride ride) {
		_rides.add(ride);
		// TODO: Check to see if ride exists in ArrayList before adding?
	}
	
	public void updateWaitTime() {
		for (Ride ride : _rides) {
			ride.updateWaitTime();
		}
	}
}
