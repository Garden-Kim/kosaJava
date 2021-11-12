package abstract_class;

public class SmartPhone extends Phone{

	public SmartPhone(String owner) {
		super(owner);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void turnOn() {
		System.out.println("전원을 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("전원을 끕니다.");
		
	}
	

}
