
public class LoginMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginMember loginMember = new LoginMember("garden", "1234");
		int i = loginMember.login(args[0], args[1]);
		if(i == 1) {
			System.out.println("Login 되었습니다.");
			loginMember.logout(args[0]);
		}else if(i == 0) {
			System.out.println("비밀번호가 틀렸습니다.");
		}else if(i == -1) {
			System.out.println("존재하지 않는 아이디입니다.");
		}
		
		
	}

}
