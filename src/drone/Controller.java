package drone;

import java.util.ArrayList;

public class Controller {

	@SuppressWarnings("unused")
	private static ArrayList<Drone> drones;

	public static void main(String[] args) {
		drones = new ArrayList<>();

		for (int i = 0; i < 500000; i++) {
			Drone drone = new Drone();
			drone.powerOn();
			drones.add(drone);
		}
	}

}
