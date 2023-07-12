

//encapsulation -->public  setter getter

//final --> cant extend 
public class Person {
	//final String nationality = "INDIAN";  //12bytes * 3

//	final  String nationality = "INDIAN"; //12bytes
//	static final String companyName = "edubridge";
//	
	
	final  String nationality; //bk=lank final var
	static final String companyName;
	
	static {
		companyName = "hello";
	}
	
	private	 String name;
	private String designation;
	private int age;  //setAge() , getAge()
	private boolean isMarried;

	Person(){
		nationality = "";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.length() >= 3)
			this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int ageVal) {
		if(age >= 18)
			age = ageVal;
	}
	public boolean isMarried() {
		return isMarried;
	}
	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}


	final void rulesAndRegul() {
		System.out.println("pan card");
	}

	void display() {
		//System.out.println(name +" "+ designation+" "+ age +" "+ isMarried);
		System.out.println(getAge() +" "+ getDesignation()+" "+ getName() +" "+isMarried);
	}

	void hacksToCLearAssessments() {

	}
}

class SeniorDeveloper extends Person{

	int noOfExp;
	String prjctName;
	
	
	//
	//	@Override
	//	void display() {
	//		//0 SSE Durgafalse java prjct 3
	//
	//		System.out.println(getAge() +" "+ getDesignation()+" "+ getName()+isMarried()+" "+prjctName+" "+noOfExp);
	//	}

	void developApp() {
		System.out.println("develop apps");
	}


	@Override
	final void hacksToCLearAssessments() {

	}



}


class Fresher extends SeniorDeveloper{

	String course;

	@Override
	void display() {
		System.out.println(course);
	}


}
