
public class Ex03 {
	int first;
	int second;
	int result;
	
	public void setData(int first, int second) {
		this.first = first;
		this.second = second;
		
		
	}
	public void add() {
		
		this.result = this.first + this.second;
		
	}
	public void sub() {
		this.result = this.first - this.second;	
	}
	public void setFirst(int first) {
		this.first = first;
	}
	public void setSecond(int second) {
		this.second = second;
	}
}
