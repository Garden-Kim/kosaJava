
public class Ex04Test {

	public static void main(String[] args) {
		Ex04 ex04 = new Ex04();
		ex04.setData(18, 175.5, false, "?̻???");
		String name = ex04.getName();
		System.out.println(name);
		Ex04 ex004;
		ex004 = new Ex04();
		ex004.setAge(35);
		ex004.setGender(false);
		ex004.setHeight(173.2);
		ex004.setName("?̼???");
		name = ex004.getName();
		System.out.println(name);
		
		Ex04 ex041 = new Ex04();
		ex041.age = 20;
		ex041.gender = true;
		ex041.height = 190.2;
		ex041.name = "??????";
		System.out.println(ex041.name);
		

	}

}
