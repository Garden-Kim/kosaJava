
public class Ex14 {
	int result;
	int first, second;
	int add; // ����
	
	public Ex14() {
		
	}
	
	public Ex14(int first, int second) {
		this.first = first;
		this.second = second;
	}
	// �޼����� 4���� ����
	// 1. �Է� ���� �ְ� �����(��ȯ��)�� �ִ� �޼���

	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	// 2. �Է°��� �ְ� �����(��ȯ��)�� ���� �޼���
	public void sub(int num1, int num2) {
		this.result = num1 - num2;
		System.out.println(this.result);
	}
	
	// 3. �Է°��� ���� ������� �ִ� �޼���
	public int mul() {
		return this.first * this.second;
	}
	
	// 4. �Է����� ���� ������� ���� �޼���
	
	public void div() {
		System.out.println(this.first / this.second);
	}
	
}
