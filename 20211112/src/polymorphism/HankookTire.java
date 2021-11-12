package polymorphism;

public class HankookTire extends Tire{
	public HankookTire(String lotation, int maxRotation) {
		super(lotation, maxRotation);
	}
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "HankookTire ¼ö¸í : " + (maxRotation - accumulatedRotation) + "È¸");
			return true;
		}else {
			System.out.println("***" + location + "HankookTire ÆãÅ© ***");
			return false;
		}
	}

}
