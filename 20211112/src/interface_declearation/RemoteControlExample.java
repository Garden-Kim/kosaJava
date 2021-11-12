package interface_declearation;

public class RemoteControlExample {
	
	public static void main(String[] args) {
		RemoteControl r;
		r = new Audio();
		r.turnOn();
		r.turnOff();
		
		r = new Television();
		r.turnOn();
		r.turnOff();
	}
	
}
