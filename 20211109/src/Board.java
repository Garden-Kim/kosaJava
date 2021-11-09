
public class Board {
	// 번호, 제목, 글쓴이, 내용, ip주소, 방문자 수
	
	int num;
	String subject;
	String writer;
	String content;
	String ip;
	int readConut;
	
	public Board() {
		
	}
	public Board(int num,String Subject, String writer, String content, String ip, int readCount) {
		this.num = num;
		this.writer = writer;
		this.content = content;
		this.ip = ip;
		this.readConut = readCount;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public int getReadConut() {
		return readConut;
	}
	public void setReadConut(int readConut) {
		this.readConut = readConut;
	}
}
