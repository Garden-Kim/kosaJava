
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
			System.out.println("이쓰앰님을 전적으로 믿으셔야합니다.");
		}
		for(int i = 10; i <= 19; i+=2) {
			System.out.println(i);
		}
		// continue를 사용
		
		for(int i = 10; i <= 19; i++) {
			if(i % 2 != 0) continue;
			System.out.println(i);
		}
		
		
		// i의 초기값은 10 이고 25회 반복하되 i는 4씩 증가
		int y2 = 1; 
		for(int i = 10; i <= 109; i+=4) {
			System.out.println(y2);
			y2++;
		}
		
		// i의 초기 값은 12이고 20회 반복을 할 때
		// "개발자는 들여쓰기를 잘해야합니다." 를 4회 출력
		for(int i = 12; i < 31; i+=5) {
			System.out.println("개발자는 들여쓰기를 잘해야합니다.");
		}
		// 구구단 7단을 출력하되 홀수만을 출력하되 반복변수는 사용하지 말것.
		int y3 = 1;
		for(int i = 1; i <= 9; i++) {
			if(i % 2 != 0) System.out.println(" 7 * " + y3 + " = " + 7*y3);
			
			y3++;
		}
		
		// Math.random() 함수를 이용해서 1~45 값 중 하나의 값을 받아
		// 그 값만큼 반복을 하시오.
		
		int num = (int)(Math.random() *45) +1;
		for(int i = 1; i <= num; i++) {
			System.out.println(num);
		}
		
		// 1부터 10번 반복을 할 때 Math.random()으로 1부터 45 까지의 값을
		// 받아 짝수일 때만 3을 곱해서 출력하시오.
		// 단, 10회 반복이 되어야한다.
		
		for(int i = 1; i <= 10; i++) {
			int num1 = (int)(Math.random() *45) +1;
			if(num1 % 2 == 0) {
				System.out.println(num1 * 3);
			}else i--;
					
		}
		
		// x = 10; y = 19; z = 2 일때
		// = i 는 초기값 x를 가지고 y 만큼 반복을하되 z값 만큼 증가하시오.
		
		int x = 10;
		y = 19;	
		int z = 2;
		for(int i = x; i <= y; i+=z) {
			System.out.println(i);
		}
		
	}

}
