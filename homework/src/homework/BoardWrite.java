package homework;

import java.util.Scanner;

public class BoardWrite extends Board {

	public void Write() {
		while (true) {
			System.out.println("�� �ۼ� �������Դϴ�.");
			Scanner sc = new Scanner(System.in);
			System.out.print("�۾��� : ");
			String writer = sc.nextLine();
			System.out.print("���� : ");
			String title = sc.nextLine();
			System.out.print("���� : ");
			String content = sc.nextLine();
			System.out.print("���� �Ϸ��� y �ٽ� ������ n");
			String save = sc.nextLine();
			if (save.equals("y")) {
				super.writer = writer;
				super.title = title;
				super.content = content;
				break;
			} else if (save.equals("n")) {
				continue;
			}else {
				break;
			}
		}

	}
}
