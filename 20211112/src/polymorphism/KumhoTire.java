package polymorphism;

public class KumhoTire extends Tire {
	public KumhoTire(String lotation, int maxRotation) {
		super(lotation, maxRotation);
	
	}
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "KumhoTire ¼ö¸í : " + (maxRotation - accumulatedRotation) + "È¸");
			return true;
		}else {
			System.out.println("***" + location + "KumhoTire ÆãÅ© ***");
			return false;
		}
	}
}
