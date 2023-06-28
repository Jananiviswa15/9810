
public class SimpleIf {
	
	void checkPositiveOrNegative(int num) {
		if(num > 0)// {
			System.out.println("positve");
		//}
		else {
			System.out.println("negative");
			System.out.println("more than one stmt give curly braces");
		}
	}

	public static void main(String args[]) {
		int number = 0;
		/*if(cond) {
			cons is true
		}*/
		
		if(number > 0) {
			System.out.println(" it is a positive number");
		}
		SimpleIf obj = new SimpleIf();
		obj.checkPositiveOrNegative(number);
	}
}
