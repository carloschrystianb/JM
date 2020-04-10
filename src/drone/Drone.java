package drone;

public class Drone {
	
	public boolean isOn;
	
	public Drone(){
		isOn = false;
	}
	
	public void powerOn() {
		isOn = true;
		
		System.out.println("Drone is on.");
	}
	
}
