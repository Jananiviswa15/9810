package otherPackage;

public class Learner {

	String name;
	int age;
	boolean isMarried;

	//no rt 
	//can have access modi
	Learner(){
		System.out.println("non para cons");
	}

	Learner(String nameVal){
		name = nameVal;  //param and attr name are differ no need to give this
	}

	Learner(String nameValue, int age){
		name = nameValue;
		this.age = age; //attr and param name are same so give this


	}

	Learner(String nameValue, int age, boolean isMarried){
		name = nameValue;
		this.age = age;
		this.isMarried = isMarried;	

	}
	
	Learner(String nameValue, boolean isMarried, int age){
		name = nameValue;
		this.age = age;
		this.isMarried = isMarried;	

	}
	void display() {
		System.out.println(name +" "+ age+ isMarried);
	}

	public static void main(String args[]) {
		Learner learner1 = new Learner(); //craete a obj, a cons --> dc --> JVM, it ll call non par con
		Learner learner2 = new Learner("amisha"); //dc name = null, age = 0, isMarried = false, param con
		Learner learner3 = new Learner("deepak", 20); //dc name = null, age = 0, isMarried = false, name = "deepak", age = 20, isMarried = false
		/*learner1.display();
		learner2.display();*/
		//learner3.display();

		Learner learner4 = new Learner("deepak", true, 89);//dc name = null, age = 0, isMarried = false, name = "deepak", age = 20, isMarried = true
		learner4.display();
	}
}
