
public class Ex01Test {
	public static void main(String[] args) {
		Ex01 ex01 = new Ex01();
		ex01.radius = 10;
		ex01.pi = 3.141592;
		
		double result = ex01.areaCircle();
		System.out.println(ex01.radius);
		System.out.println(ex01.pi);
		System.out.println(ex01.getRadius());
		System.out.println(ex01.getPi());
		System.out.println(result);
		
		Ex01 ex011 = new Ex01();
		
		ex011.radius = 20;
		
	}
}
