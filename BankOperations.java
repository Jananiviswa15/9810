
abstract public class BankOperations {
abstract int debit();  //method sign, no method def //abstract metho
abstract void credit(int creditAmnt);

//the inhertng classes is gng to provide def for these methods , and they ll be create obj
void display() {
	System.out.println("basic details of an accnt");
}

void display(String accno) {
	System.out.println("balance");
}

public static void main(String args[]) {
	
	childSBI1 obj = new childSBI1();
	obj.credit(1000);
}
}


 abstract class SBI extends BankOperations{
	 int debit() {
			
		 return 0;
	 }	
	 
	 
	//if ur cls is not gng to provide method def then make the class as abstract
}

class childSBI1 extends SBI{
	void credit(int creditAmnt) {
		 System.out.println("hello");
	 }
	
	void housingLoan() {
		
	}
	
	//childSBI1 --> concrete class
}
 abstract class childSBI extends BankOperations{
//u cant create objs
	 int debit() {
		
		 return 0;
	 }

	 void credit(int amnt) {
		 
	 }
}
 
 
 class OtherClass extends childSBI{
	 //by creaeting obj of otherclass i ll be able to acess all method of childsbi
 }