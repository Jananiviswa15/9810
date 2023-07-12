
public class DriverClass {

	public static void main(String args[]) {
		Person obj = new Person();
		obj.setAge(50);
		obj.setName("supriya");  //ismarried and designation def val
	
		
		SeniorDeveloper senior = new SeniorDeveloper();
		senior.setAge(23);
		senior.setName("Durga");
		senior.setDesignation("SSE");
		senior.noOfExp = 3;
		senior.prjctName = "java prjct";
		
		senior.display();
		
		senior.rulesAndRegul();
		Fresher obj1 = new Fresher();
		obj1.rulesAndRegul();

		System.out.println(obj.nationality);
//		obj.nationality = "paris";
		System.out.println(senior.nationality);
		System.out.println(obj1.nationality);
		
		System.out.println(Person.companyName);
//		obj.nationality = "paris";
		System.out.println(SeniorDeveloper.companyName);
		System.out.println(Fresher.companyName);
		
		//Fresher.companyName = "kldjfkf";
		
	}
	
	
}
