
public class ThirdPrg {
	
	static boolean isSleeping = true;  //class levl/ sta
	int age;  //decl inside class but outside all the methods//instance / non stat
	//verb
	//method def
	//non sta
	void prepareMaggi() {
		
		System.out.println("turn on stive");
		System.out.println("boiil water");
		System.out.println("put maggi cakes");
		//System.out.println(num1);
	}
	void display() {
		 int num1 = 100;  //rohan in 1st strreet  //mem is ourchased 
		
		System.out.println(num1);
	}//mem allocated for num1 is released
	
	//10000,90
	void sum(int num1, int num2) {
		System.out.println(num1+num2);
	}
	static void displayAssessments() {
		System.out.println("this is stat metho");
	}
	public static void main(String args[]) {
		int num1 = 10;  // //rohan in 2nd strreet
		int num2 = 3;
		int age = 90;
//		System.out.println(num1+num2);
//		System.out.println(num1-num2);
//		System.out.println( num1 / (float) num2);
//		System.out.println(num1*num2);
//		System.out.println(num1%num2);
		
		ThirdPrg firstObject ;
		firstObject = new ThirdPrg();
		
		ThirdPrg secondObject = new ThirdPrg();
//		System.out.println(firstObject);
//		System.out.println(secondObject);
//		firstObject.prepareMaggi();
firstObject.display();
//		
//		secondObject.prepareMaggi();
//		secondObject.display();
//		
		firstObject.age = 10;
		secondObject.age = 100;
		
		System.out.println(isSleeping);
		System.out.println(firstObject.isSleeping);
		firstObject.isSleeping = false;
		System.out.println(isSleeping);
		//sysout //ThirdPrg.isSleeping
		firstObject.displayAssessments();  //cn.display();
		
		
		firstObject.sum(num2, age);
		
	}

}
