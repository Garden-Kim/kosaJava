
public class LoginMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginMember loginMember = new LoginMember("garden", "1234");
		int i = loginMember.login(args[0], args[1]);
		if(i == 1) {
			System.out.println("Login �Ǿ����ϴ�.");
			loginMember.logout(args[0]);
		}else if(i == 0) {
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		}else if(i == -1) {
			System.out.println("�������� �ʴ� ���̵��Դϴ�.");
		}
		
		
	}

}
