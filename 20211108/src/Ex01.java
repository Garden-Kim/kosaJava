
public class Ex01 {

	public static void main(String[] args) {
		int [] score = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println(score[5]);
		
		double [] d = {10.5,20.5,12.4,12.5};
		// �迭�� ����� ���� indexing�� �Ѵ�.
		System.out.println(d[3]);
		
		for(int i = 0; i < d.length;i++) {
			System.out.println(d[i]);
		}
		// score�� �ִ� ���� ��� ���Ͻÿ�.
		int sum = 0;
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
			
		}
		System.out.println(sum);
	}

}
