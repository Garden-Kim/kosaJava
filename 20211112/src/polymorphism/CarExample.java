package polymorphism;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		for(int i = 1; i <= 5; i++) {
			int problemLocation = car.run(); // 1,2,3,4
			switch(problemLocation) {
			case 1:
				System.out.println("앞왼쪽 타이어 교체");
				car.frontLeftTire = new KumhoTire("앞왼쪽",6);
				break;
			case 2:
				System.out.println("앞오른쪽 타이어 교체");
				car.frontRightTire = new KumhoTire("앞오른쪽", 4);
				break;
			case 3:
				System.out.println("뒤왼쪽 타이어 교체");
				car.backLeftTire = new HankookTire("뒤왼쪽", 14);
				break;
			case 4:
				System.out.println("뒤오른쪽 타이어 교체");
				car.backRightTire = new HankookTire("뒤오른쪽", 17);
				break;
			}
		}
		

	}

}
