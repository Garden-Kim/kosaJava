
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Board board = new Board(1,"����","������ƹ�","����","192.168.0.1",2);
		
		System.out.println("���� : " + board.getSubject());
		System.out.println("�۾��� : " + board.getWriter());
		System.out.println("���� : " + board.getSubject());
		System.out.println("ip : " + board.getIp());
		System.out.println("�湮�� �� : " + board.getReadConut());
		
		Car car = new Car("����","�ҳ�Ÿ","����",240);
		
		Car car1 = new Car();
		car1.setColor("���");
		car1.setCompany("���");
		car1.setModel("K7");
		car1.setMaxSpeed(250);
		System.out.println(car1.getCompany());

	}

}
