package homework;

public class Board {
	
	int num;
	String writer;
	String title;
	int readCnt;
	String content;
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Board() {}
	
	public Board(int num, String writer, String title, int readCnt) {
		super();
		this.num = num;
		this.writer = writer;
		this.title = title;
		this.readCnt = readCnt;
	}
	public void BoradPrint() {
		System.out.println("글목록");
		System.out.println("번호 \t\t 글쓴이 \t\t 제목 \t\t 읽은수");
	}
	public void Print() {
		System.out.println(num + "\t\t"+ writer + "\t\t" + title + "\t\t" + readCnt);
	}
	

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getReadCnt() {
		return readCnt;
	}

	public void setReadCnt(int readCnt) {
		this.readCnt = readCnt;
	}
}
