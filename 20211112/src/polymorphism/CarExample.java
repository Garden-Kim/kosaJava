package polymorphism;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		for(int i = 1; i <= 5; i++) {
			int problemLocation = car.run(); // 1,2,3,4
			switch(problemLocation) {
			case 1:
				System.out.println("�տ��� Ÿ�̾� ��ü");
				car.frontLeftTire = new KumhoTire("�տ���",6);
				break;
			case 2:
				System.out.println("�տ����� Ÿ�̾� ��ü");
				car.frontRightTire = new KumhoTire("�տ�����", 4);
				break;
			case 3:
				System.out.println("�ڿ��� Ÿ�̾� ��ü");
				car.backLeftTire = new HankookTire("�ڿ���", 14);
				break;
			case 4:
				System.out.println("�ڿ����� Ÿ�̾� ��ü");
				car.backRightTire = new HankookTire("�ڿ�����", 17);
				break;
			}
		}
		

	}

}
