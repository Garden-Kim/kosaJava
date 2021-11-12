package homework;

import java.util.Scanner;

public class BoardWrite extends Board {

	public void Write() {
		while (true) {
			System.out.println("글 작성 페이지입니다.");
			Scanner sc = new Scanner(System.in);
			System.out.print("글쓴이 : ");
			String writer = sc.nextLine();
			System.out.print("제목 : ");
			String title = sc.nextLine();
			System.out.print("내용 : ");
			String content = sc.nextLine();
			System.out.print("저장 하려면 y 다시 쓰려면 n");
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
