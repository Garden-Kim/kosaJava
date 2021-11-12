package polymorphism;

public class Tire {
	public int maxRotation;
	public int accumulatedRotation; // ���� ȸ����
	public String location;  
	
	public Tire(String lotation, int maxRotation) {
		this.location = lotation;
		this.maxRotation = maxRotation;
	}
	
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "Tire ���� : " + (maxRotation - accumulatedRotation) + "ȸ");
			return true;
		}else {
			System.out.println("***" + location + "Tire ��ũ ***");
			return false;
		}
	}
}
