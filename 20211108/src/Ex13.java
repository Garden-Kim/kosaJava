
public class Ex13 {

	public static void main(String[] args) {
		// 3�� 4���� 2���� �迭�� 1~100 ���� ����ϴ� Math.random()�� �̿��Ͽ�
		// ���� �Է��� �� �հ踦 ����Ͻÿ�.
		
		int i[][] = new int [3][4];
		int sum = 0;
		for(int j = 0; j < i.length;j++) {
			for(int k = 0; k < i[j].length; k++) {
				i[j][k] = (int)(Math.random() * 100)+1;
				sum += i[j][k];
				System.out.println("i["+j+"]["+k+"] = "+i[j][k]);
			}
		}
		System.out.println(sum);
		
		sum = 0;
		int [] score = {60,89,56,73,66,90,95};
		//�հ�� ����� foreach���� ����ؼ� ���Ͻÿ�.
		for(int num : score) {
			sum += num;
		}
		System.out.println("�հ� = "+sum);
		System.out.println("��� = "+  sum / score.length);

	}

}
