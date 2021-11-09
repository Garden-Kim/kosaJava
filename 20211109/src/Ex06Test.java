
public class Ex06Test {

	public static void main(String[] args) {
		Ex06 ex06;
		ex06 = new Ex06();
		ex06.setData("이숭무", 36, 175.5);
		String name = ex06.getName();
		System.out.println(name);
		
		// 객체생성과 동시에 멤버 필드에 초기화 :
		Ex061 ex061 = new Ex061("이상범", 18, 175.5);
		
		System.out.println(ex061.getAge());
	}

}
