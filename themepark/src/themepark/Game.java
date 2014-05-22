package themepark;

import java.util.ArrayList;

public class Game {
	private Park _park;
	
	public Game() {
		_park = new Park();
		buildParkModel();
	}
	
	public void start() {
		simulatePark();
	}
	
	private void buildParkModel() {
		// Add Star Frontier Area
		Area starFrontier = new Area("Star Frontier");
		_park.addArea(starFrontier);
		Ride spaceValley = new Ride("Space Valley", 5, 90, 45, 15, 15, true);
		starFrontier.addRide(spaceValley);
		Ride colonelOZO = new Ride("Colonel OZO", 15, 20, 40, 20, 10, false);
		starFrontier.addRide(colonelOZO);
		Ride galaxyTours = new Ride("Galaxy Tours", 10, 30, 60, 20, 10, true);
		starFrontier.addRide(galaxyTours);
		
		// Add Wild West Frontier Area
		Area wildWestFrontier = new Area("Wild West Frontier");
		_park.addArea(wildWestFrontier);
		
		// TODO: Add more areas and rides
	}
	
	private void simulatePark() {
		// TODO: You'd loop here while the game is still going.
		
		// Just printing the list of areas to show how it works.
		ArrayList<String> areaMenu = Menu.getAreaMenu(_park);
		for (String menuItem : areaMenu) {
			System.out.println(menuItem);
		}
	}
}
