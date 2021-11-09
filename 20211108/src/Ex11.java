
public class Ex11 {

	public static void main(String[] args) {
		// 4행 5열 짜리 배열을 만들어서 Math.random() 을 이용하여 값을 저장하시오.
		// 랜덤은 1~100까지의 수
		
		int i[][] = new int [4][5];
		for(int j = 0; j < i.length;j++) {
			for(int k = 0; k < i[j].length; k++) {
				i[j][k] = (int)(Math.random() * 100)+1;
				System.out.println("i["+j+"]["+k+"] = "+i[j][k]);
			}
		}

	}

}
