import java.util.Scanner;

public class AccountMain1 {
	static Scanner sc = new Scanner(System.in);
	static Account[] accs = new Account[100];
	static int arraynum = 0;
	public static void main(String[] args) {

		boolean run = true;

		do {
			System.out.println("---------------------------");
			System.out.println("1.���� ��� | 2.���� ��� | 3.���� | 4.��� | 5.����");
			System.out.println("---------------------------");
			System.out.print("���� > ");
			int selectNo = sc.nextInt();
			sc.nextLine();

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
				accountPrint();
				break;
			case 3:
				System.out.println("���� �������Դϴ�.");
				System.out.print("���¹�ȣ : ");
				accountNo = sc.nextLine();
				System.out.print("���ݾ� : ");
				money = Integer.parseInt(sc.nextLine());
				Account acc = accountFind(accountNo);
				
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
				acc = accountFind(accountNo);
			
				result = acc.getBalance() - money;
				acc.setBalance(result);
				System.out.println(result);
				break;
			case 5:
				System.out.println("���α׷��� ����ƽ��ϴ�.");
				run = false;
				break;
			// System.exit(0);
			default:
				break;
			}
		} while (run);

	}

	public static Account accountFind(String accountNo) {
		for (int i = 0; i < accs.length; i++) {
			if (accs[i] == null)
				break;
			else {
				if (accs[i].getAccountNo().equals(accountNo)) {
					return accs[i];
				}
			}
		}
		return null;
	}

	public static void accountPrint() {
		for (int i = 0; i < accs.length; i++) {
			if (accs[i] == null)
				break;
			System.out.println("���¹�ȣ \t\t ������ \t\t �ݾ�");
			System.out.println(accs[i].getAccountNo() + "\t\t" + accs[i].getOwner() + "\t\t" + accs[i].getBalance());
		}
	}
}
