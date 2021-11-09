
public class Ex13 {

	public static void main(String[] args) {
		// 3행 4열인 2차원 배열에 1~100 까지 사용하는 Math.random()을 이용하여
		// 값을 입력한 후 합계를 출력하시오.
		
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
		//합계와 평균을 foreach문을 사용해서 구하시오.
		for(int num : score) {
			sum += num;
		}
		System.out.println("합계 = "+sum);
		System.out.println("평균 = "+  sum / score.length);

	}

}
