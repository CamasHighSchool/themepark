package themepark;

import java.util.ArrayList;

public class Menu {
	public static ArrayList<String> getRideMenu(Area area) {
		ArrayList<String> rideMenu = new ArrayList<String>();
		String menuItem;
		int itemNumber = 1;
		
		for (Ride ride : area.getRides()) {
			menuItem = itemNumber + ". " + ride.getName() + ", ride time: " + ride.getRideTime() + ", wait time: " + ride.getCurrentWaitTime() +".";
			rideMenu.add(menuItem);
			itemNumber++;
		}
		
		menuItem = itemNumber + ". Leave " + area.getName() + ".";
		rideMenu.add(menuItem);
		
		return rideMenu;
	}
	
	public static ArrayList<String> getAreaMenu(Park park) {
		ArrayList<String> areaMenu = new ArrayList<String>();
		String menuItem;
		int itemNumber = 1;
		
		for (Area area : park.getAreas()) {
			menuItem = itemNumber + ". Walk to " + area.getName();
			areaMenu.add(menuItem);
			itemNumber++;
		}
		
		menuItem = itemNumber + ". Leave the park.";
		areaMenu.add(menuItem);
		
		return areaMenu;
	}
}
