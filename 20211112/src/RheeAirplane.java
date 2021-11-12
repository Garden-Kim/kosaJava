
public class RheeAirplane extends Airplane {
	static final int NORMAL = 1;
	static final int SUPERSONIC = 2;
	
	int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("������ ������ �Ѵ�.");
		}else {
			super.fly();
		}
	}
}
