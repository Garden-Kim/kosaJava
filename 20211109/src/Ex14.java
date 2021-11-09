
public class Ex14 {
	int result;
	int first, second;
	int add; // 변수
	
	public Ex14() {
		
	}
	
	public Ex14(int first, int second) {
		this.first = first;
		this.second = second;
	}
	// 메서드의 4가지 유형
	// 1. 입력 값이 있고 결과값(반환형)이 있는 메서드

	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	// 2. 입력값은 있고 결과값(반환형)이 없는 메서드
	public void sub(int num1, int num2) {
		this.result = num1 - num2;
		System.out.println(this.result);
	}
	
	// 3. 입력값은 없고 결과값이 있는 메서드
	public int mul() {
		return this.first * this.second;
	}
	
	// 4. 입려값이 없고 결과값도 없는 메서드
	
	public void div() {
		System.out.println(this.first / this.second);
	}
	
}
