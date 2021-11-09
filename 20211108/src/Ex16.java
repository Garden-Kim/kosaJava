
public class Ex16 {

	public static void main(String[] args) {
		int [] i = {1,2,3,4,5,6};
		
		String [] str = {"이숭무", "이상범", "이장범", "김찬중"};
		
		double [] d = {10.5, 20.6, 40.7, 200.8};
		
		WEEK1 [] days = WEEK1.values();
		String [][] locations = {{"영등포","노량진","종로"},{"가","나","다"},{"모란","수내","미금"}};
		
		int vals[][] = {{1,2,3},{4,5},{6,7,8,9}};
		
		for(int j = 0;j < i.length;j++) {
			System.out.println(i[j]);
		}
		for(int j = 0;j < d.length;j++) {
			System.out.println(d[j]);
		}
		for(int j = 0;j < days.length;j++) {
			System.out.println(days[j]);
		}
		
		for(int j = 0;j < locations.length;j++) {
			for(int k = 0; k < locations[j].length; k++) {
				System.out.println(locations[j][k]);
			}
		}
		for(int j = 0;j < vals.length;j++) {
			for(int k = 0; k < vals[j].length; k++) {
				System.out.println(vals[j][k]);
			}
		}
		
		for(int num : i) {
			System.out.println(num);
		}
		for(String num : str) {
			System.out.println(num);
		}
		for(WEEK1 wk : days) {
			System.out.println(wk);
		}
		
		
		for(String [] loc : locations) {
			for(String s : loc) {
				System.out.println(s);
			}
		
		}
		
		for(int [] val : vals) {
			for(int s : val) {
				System.out.println(s);
			}
		}
	}
}
