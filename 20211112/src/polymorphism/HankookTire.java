package polymorphism;

public class HankookTire extends Tire{
	public HankookTire(String lotation, int maxRotation) {
		super(lotation, maxRotation);
	}
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "HankookTire ???? : " + (maxRotation - accumulatedRotation) + "ȸ");
			return true;
		}else {
			System.out.println("***" + location + "HankookTire ??ũ ***");
			return false;
		}
	}

}
