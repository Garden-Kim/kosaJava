package da;

public class Ex04Test {
	public static void main(String[] args) {
		B b = new B(); // A
		C c = new C(); // A
		D d = new D(); // B, A
		E e = new E(); // C, A
		// 다형성 : 부모는 자식 객체를 참조 할 수 있다.
		//		  자식은 부모를 상속 받아야지만 가능하다.
		A a = b;
		a = c;
		a = d;
		a = e;
		
	}
}
