import java.util.Scanner;

public class AccountMian {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Account [] accs = new Account[100];
		boolean run = true;
		
		do {
			System.out.println("---------------------------");
			System.out.println("1.���� ��� | 2.���� ��� | 3.���� | 4.��� | 5.����");
			System.out.println("---------------------------");
			System.out.print("���� > ");
			int selectNo = sc.nextInt();
			sc.nextLine();
			int arraynum = 0;
			switch (selectNo) {
			case 1:
				System.out.println("���� ��� �������Դϴ�.");
				System.out.print("���� ��ȣ : ");
				String accountNo = sc.nextLine();
				System.out.print("������ : ");
				String owner = sc.nextLine();
				System.out.print("�ݾ� : ");
				int money = sc.nextInt();
				
				accs[arraynum] = new Account(accountNo, owner, money);
				arraynum++;
				
				break;
			case 2:
				System.out.println("���� ��� �������Դϴ�.");
				for(int i = 0; i < accs.length; i++) {
					if(accs[i] == null) break;
					System.out.println("���¹�ȣ \t\t ������ \t\t �ݾ�");
					System.out.println(accs[i].getAccountNo()+"\t\t"+accs[i].getOwner()+"\t\t"+accs[i].getBalance());
				}
				break;
			case 3:
				System.out.println("���� �������Դϴ�.");
				System.out.print("���¹�ȣ : ");
				accountNo = sc.nextLine();
				System.out.print("���ݾ� : ");
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
				System.out.println("��� �������Դϴ�.");
				System.out.print("���¹�ȣ : ");
				accountNo = sc.nextLine();
				System.out.print("��ݾ� : ");
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
				System.out.println("���α׷��� ����ƽ��ϴ�.");
				run = false; 
				break;
				//System.exit(0);
			default:
				break;
			}
		}while(run);
		
		
	}
	
}
