
public class Ex061 {
	String name;
	int age;
	double height;
	

	public Ex061(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	public void setData(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public int getAge() {
		return this.age;
	}
	public double getHeight() {
		return this.height;
	}
	public String getName() {
		return this.name;
	}
}