
public class Ex04 {

	public static void main(String[] args) {
		// 배열의 크기 가져오기.
		int i [] = new int[] {1,2,3,4,5};
		System.out.println(i.length);
		int sum = 0;
		for(int j = 0; j < i.length; j++) {
			sum += i[j];
		}
		System.out.println(sum);
		
		// 크기가 10인 배열을 만들고 Math.random을 이용하여
		// 배열의 임의의 값을 저장하시오. for문 사용
		// 랜덤 값은 1~100
		int i10 [] = new int[10];
		
		for(int j = 0; j < i10.length;j++) {
			i10[j] = (int)(Math.random() * 100) +1;
			System.out.println(i10[j]);
		}
		

	}

}
