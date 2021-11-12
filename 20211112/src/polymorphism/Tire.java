package polymorphism;

public class Tire {
	public int maxRotation;
	public int accumulatedRotation; // 누적 회전수
	public String location;  
	
	public Tire(String lotation, int maxRotation) {
		this.location = lotation;
		this.maxRotation = maxRotation;
	}
	
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "Tire 수명 : " + (maxRotation - accumulatedRotation) + "회");
			return true;
		}else {
			System.out.println("***" + location + "Tire 펑크 ***");
			return false;
		}
	}
}
