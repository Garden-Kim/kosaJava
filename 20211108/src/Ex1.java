
public class Ex1 {

	public static void main(String[] args) {
		//1.
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		//2.
		int y=1;
		for(int i = 1; i <= 10;i++) {
			System.out.println(y);
			y++;
		}
		//3.
		for(int i=1; i <= 10;i++) {
			int y1 = 0;
			y1++;
			System.out.println(y1);
		}
		//4.
		for(int i = 11; i <= 21; i++) {
			System.out.println("�̾��ڴ��� �������� �����ž��մϴ�.");
		}
		for(int i = 10; i <= 19; i+=2) {
			System.out.println(i);
		}
		// continue�� ���
		
		for(int i = 10; i <= 19; i++) {
			if(i % 2 != 0) continue;
			System.out.println(i);
		}
		
		
		// i�� �ʱⰪ�� 10 �̰� 25ȸ �ݺ��ϵ� i�� 4�� ����
		int y2 = 1; 
		for(int i = 10; i <= 109; i+=4) {
			System.out.println(y2);
			y2++;
		}
		
		// i�� �ʱ� ���� 12�̰� 20ȸ �ݺ��� �� ��
		// "�����ڴ� �鿩���⸦ ���ؾ��մϴ�." �� 4ȸ ���
		for(int i = 12; i < 31; i+=5) {
			System.out.println("�����ڴ� �鿩���⸦ ���ؾ��մϴ�.");
		}
		// ������ 7���� ����ϵ� Ȧ������ ����ϵ� �ݺ������� ������� ����.
		int y3 = 1;
		for(int i = 1; i <= 9; i++) {
			if(i % 2 != 0) System.out.println(" 7 * " + y3 + " = " + 7*y3);
			
			y3++;
		}
		
		// Math.random() �Լ��� �̿��ؼ� 1~45 �� �� �ϳ��� ���� �޾�
		// �� ����ŭ �ݺ��� �Ͻÿ�.
		
		int num = (int)(Math.random() *45) +1;
		for(int i = 1; i <= num; i++) {
			System.out.println(num);
		}
		
		// 1���� 10�� �ݺ��� �� �� Math.random()���� 1���� 45 ������ ����
		// �޾� ¦���� ���� 3�� ���ؼ� ����Ͻÿ�.
		// ��, 10ȸ �ݺ��� �Ǿ���Ѵ�.
		
		for(int i = 1; i <= 10; i++) {
			int num1 = (int)(Math.random() *45) +1;
			if(num1 % 2 == 0) {
				System.out.println(num1 * 3);
			}else i--;
					
		}
		
		// x = 10; y = 19; z = 2 �϶�
		// = i �� �ʱⰪ x�� ������ y ��ŭ �ݺ����ϵ� z�� ��ŭ �����Ͻÿ�.
		
		int x = 10;
		y = 19;	
		int z = 2;
		for(int i = x; i <= y; i+=z) {
			System.out.println(i);
		}
		
	}

}
