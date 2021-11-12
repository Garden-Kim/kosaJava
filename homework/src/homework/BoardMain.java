package homework;

public class BoardMain {

	public static void main(String[] args) {
		BoardWrite bd = new BoardWrite();
		bd.BoradPrint();
		bd.setNum(1);
		bd.setReadCnt(5);
		bd.setTitle("ÀßÇØ");
		bd.setWriter("ÀÌ¼þ¹«");
		bd.Print();
		bd.Write();
		
	}

}
