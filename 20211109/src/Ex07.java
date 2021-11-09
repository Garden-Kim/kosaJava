
public class Ex07 {
	int first;
	int second;
	int result;
	
	public Ex07() {
		System.out.println("디폴트 생성자 실행");
		// 개발자가 default 생성자를 만들면 default 생성자는 자동으로 만들어지지 않는다.
	}
	
	// 생성자가 있는경우 default 생성자는 명시적으로 만들어 줘야 한다.
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
