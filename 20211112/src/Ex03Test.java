
public class Ex03Test {

	public static void main(String[] args) {
		
		Ex03 ex03 = new Ex03(3,3.141595, "test1");
		System.out.println(ex03.subject);
		double d = ex03.area();
		System.out.println(d);
		d= ex03.area(Math.PI);
		System.out.println(d);
		System.out.println(Math.PI);
		
		d = ex03.aear1();
		System.out.println(d);
	
	}

}
