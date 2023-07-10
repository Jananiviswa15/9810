
public class MethodOverloading {

	static int sum(int num, int num1) {
		return num+num1;
	}
	
static {
	sum("", 10);
	System.out.println("it ll exec before main");
	MethodOverloading obj = new MethodOverloading();
	obj.display();
}
	
	static void sum(int age, String name) {
		System.out.println("hi");
	}
	
	static void sum( String name, int age) {
		System.out.println("hi");
	}
	static float sum(float num, float num1) {
		return num+num1;
	}
	
	/*only by changing the return type u cant achiev method over
	static double sum(float num, float num1) {
		return num+num1;
	}*/
	
	static int sum(int num, int num1, int num3) {
		return num+num1+num3;
	}
	
//	void display() {
//		
//	}
//static void display() {
//		
//	}
	
	void display() {
		System.out.println("hello");
	}
	public static void main(String name) {
		System.out.println(" hi..");
	}
	public static void main(String args[]) {
		sum(10, 10);
		sum(10.0f,10.0f);
		sum(10, "jhdjf");
		main("");
	}
}
