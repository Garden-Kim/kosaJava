package abstract_class;

public class SmartPhone extends Phone{

	public SmartPhone(String owner) {
		super(owner);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void turnOn() {
		System.out.println("������ �մϴ�.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
		
	}
	

}
