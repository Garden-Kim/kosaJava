
public class Ex11 {

	public static void main(String[] args) {
		// 4�� 5�� ¥�� �迭�� ���� Math.random() �� �̿��Ͽ� ���� �����Ͻÿ�.
		// ������ 1~100������ ��
		
		int i[][] = new int [4][5];
		for(int j = 0; j < i.length;j++) {
			for(int k = 0; k < i[j].length; k++) {
				i[j][k] = (int)(Math.random() * 100)+1;
				System.out.println("i["+j+"]["+k+"] = "+i[j][k]);
			}
		}

	}

}
