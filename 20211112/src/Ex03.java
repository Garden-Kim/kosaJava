
public class Ex03 extends Ex02 {
	String subject;

	public Ex03(int radius, double pi, String subject) {
		super(radius, pi);
		this.subject = subject;
	}

	@Override // 오버 라이딩
	public double area() {
		return radius * radius * Math.PI;
	}

	public double area(double p) { // 오버 로딩;
		return radius * radius * p;
	}

	public double aear1() {
		return super.area();
	}
}
