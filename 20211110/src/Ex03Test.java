
public class Ex03Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex03 ex031 = new Ex03();
		ex031.first = 10;
		ex031.second = 20;
		ex031.val = 30;
		Ex03 ex032 = new Ex03();
		System.out.println(ex032.first);
		System.out.println(ex032.second);
		System.out.println(ex032.val);
		
		int result = ex031.add();
		System.out.println(result);
		
	}

}
