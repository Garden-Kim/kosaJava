import java.util.Scanner;

public class AccountMian {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Account [] accs = new Account[100];
		boolean run = true;
		
		do {
			System.out.println("---------------------------");
			System.out.println("1.계좌 등록 | 2.계좌 목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("---------------------------");
			System.out.print("선택 > ");
			int selectNo = sc.nextInt();
			sc.nextLine();
			int arraynum = 0;
			switch (selectNo) {
			case 1:
				System.out.println("계좌 등록 페이지입니다.");
				System.out.print("계좌 번호 : ");
				String accountNo = sc.nextLine();
				System.out.print("예금주 : ");
				String owner = sc.nextLine();
				System.out.print("금액 : ");
				int money = sc.nextInt();
				
				accs[arraynum] = new Account(accountNo, owner, money);
				arraynum++;
				
				break;
			case 2:
				System.out.println("계좌 목록 페이지입니다.");
				for(int i = 0; i < accs.length; i++) {
					if(accs[i] == null) break;
					System.out.println("계좌번호 \t\t 계좌주 \t\t 금액");
					System.out.println(accs[i].getAccountNo()+"\t\t"+accs[i].getOwner()+"\t\t"+accs[i].getBalance());
				}
				break;
			case 3:
				System.out.println("예금 페이지입니다.");
				System.out.print("계좌번호 : ");
				accountNo = sc.nextLine();
				System.out.print("예금액 : ");
				money = Integer.parseInt(sc.nextLine());
				Account acc = new Account();
				for(int i=0; i < accs.length; i++) {
					if(accs[i] == null) break;
					else {
						if(accs[i].getAccountNo().equals(accountNo)) {
							acc = accs[i];
						}
					}
				}
				int result = acc.getBalance() + money;
				acc.setBalance(result);
				System.out.println(result);
				break;
			case 4:
				System.out.println("출금 페이지입니다.");
				System.out.print("계좌번호 : ");
				accountNo = sc.nextLine();
				System.out.print("출금액 : ");
				money = Integer.parseInt(sc.nextLine());
				acc = null;
				for(int i=0; i < accs.length; i++) {
					if(accs[i] == null) break;
					else {
						if(accs[i].getAccountNo().equals(accountNo)) {
							acc = accs[i];
						}
					}
				}
				result = acc.getBalance() - money;
				acc.setBalance(result);
				System.out.println(result);
				break;
			case 5:
				System.out.println("프로그램이 종료됐습니다.");
				run = false; 
				break;
				//System.exit(0);
			default:
				break;
			}
		}while(run);
		
		
	}
	
}
