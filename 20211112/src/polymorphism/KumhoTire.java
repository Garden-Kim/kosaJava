package polymorphism;

public class KumhoTire extends Tire {
	public KumhoTire(String lotation, int maxRotation) {
		super(lotation, maxRotation);
	
	}
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "KumhoTire ���� : " + (maxRotation - accumulatedRotation) + "ȸ");
			return true;
		}else {
			System.out.println("***" + location + "KumhoTire ��ũ ***");
			return false;
		}
	}
}
