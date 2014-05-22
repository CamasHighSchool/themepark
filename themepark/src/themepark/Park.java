package themepark;

import java.util.ArrayList;

public class Park {
	private ArrayList<Area> _areas;
	
	public Park() {
		_areas = new ArrayList<Area>();
	}
	
	public ArrayList<Area> getAreas() {
		return _areas;
	}
	
	public void addArea(Area area) {
		_areas.add(area);
		// TODO: Check to see if the area is in the ArrayList before adding?
	}
	
	public void updateWaitTime() {
		for (Area area : _areas) {
			area.updateWaitTime();
		}
	}
}
