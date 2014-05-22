package themepark;

public class Ride {
	private String _name;
	private int _rideTime;
	private int _currentWaitTime;
	private int _maxWaitTime;
	private int _minWaitTime;
	private int _changeWaitTime;
	private boolean _waitTimeIncreasing;
	
	public Ride(String name, int ride, int current, int max, int min, int change, boolean increasing) {
		_name = name;
		_rideTime = ride;
		_currentWaitTime = current;
		_maxWaitTime = max;
		_minWaitTime = min;
		_changeWaitTime = change;
		_waitTimeIncreasing = increasing;
	}

	public String getName() {
		return _name;
	}
	
	public int getRideTime() {
		return _rideTime;
	}
	
	public int getCurrentWaitTime() {
		return _currentWaitTime;
	}
	
	public void updateWaitTime() {
		if (_waitTimeIncreasing) {
			if (_currentWaitTime < _maxWaitTime) {
				_currentWaitTime += _changeWaitTime;
			} else {
				_waitTimeIncreasing = false;
			}
		} else { // wait time is decreasing
			if (_currentWaitTime > _minWaitTime) {
				_currentWaitTime -= _changeWaitTime;
			} else {
				_waitTimeIncreasing = true;
			}
		}
	}
}
