
public class Ex07 {
	int first;
	int second;
	int result;
	
	public Ex07() {
		System.out.println("����Ʈ ������ ����");
		// �����ڰ� default �����ڸ� ����� default �����ڴ� �ڵ����� ��������� �ʴ´�.
	}
	
	// �����ڰ� �ִ°�� default �����ڴ� ��������� ����� ��� �Ѵ�.
	public Ex07(int first, int second) {
		this.first = first;
		this.second = second;
	}
	
	public void setFirst(int first) {
		this.first = first;
	}
	
	public void setSecond(int second) {
		this.second = second;
	}
	public int getFirst() {
		return first;
	}

	public int getSecond() {
		return second;
	}
	public int getResult() {
		return result;
	}

	public void add() {
		this.result = this.first + this.second;
	}
	public void sub() {
		this.result = this.first - this.second;
	}
}
