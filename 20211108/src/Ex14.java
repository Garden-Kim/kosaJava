import java.time.DayOfWeek;
import java.util.Calendar;

public class Ex14 {

	public static void main(String[] args) {
		WEEK today; // 열거형 상수 변수 선언.
		today = WEEK.MONDAY;
		System.out.println(today);
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		switch(week) {
		case 1: today = WEEK.SUNDAY; break;
		case 2: today = WEEK.MONDAY; break;
		case 3: today = WEEK.TUESDAY; break;
		case 4: today = WEEK.WEDNESDAY; break;
		case 5: today = WEEK.THURSDAY; break;
		case 6: today = WEEK.FRIDAY; break;
		case 7: today = WEEK.SATURDAY; break;
		}
		
		System.out.println(today);

	}

}
