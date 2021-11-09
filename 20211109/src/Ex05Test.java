
public class Ex05Test {
	public static void main(String[] args) {
		
		Ex05 ex05 = new Ex05();
		/*
		 *ex05.age(30); 
		 *ex05.height(150.2);
		 *private 은 직접 접근할수없다. 
		 * */
		
		
		ex05.setAge(30);
		ex05.setHeight(123.1);
		
		System.out.println(ex05.getAge());
		
	}
}
