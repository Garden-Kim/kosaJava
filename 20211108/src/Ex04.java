
public class Ex04 {

	public static void main(String[] args) {
		// �迭�� ũ�� ��������.
		int i [] = new int[] {1,2,3,4,5};
		System.out.println(i.length);
		int sum = 0;
		for(int j = 0; j < i.length; j++) {
			sum += i[j];
		}
		System.out.println(sum);
		
		// ũ�Ⱑ 10�� �迭�� ����� Math.random�� �̿��Ͽ�
		// �迭�� ������ ���� �����Ͻÿ�. for�� ���
		// ���� ���� 1~100
		int i10 [] = new int[10];
		
		for(int j = 0; j < i10.length;j++) {
			i10[j] = (int)(Math.random() * 100) +1;
			System.out.println(i10[j]);
		}
		

	}

}
