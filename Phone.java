package otherPackage;

public class Phone {

	private String myAtt;
	int charingCapacity;
	int costOfThePh;
	String brandName;
	
	void calling() {
		myPersonalDairy();
		System.out.println("calling");
	}
	
	void parentMethodd() {
		System.out.println("parent non stat metho");
	}
	//not at all visible to the child
	private void myPersonalDairy() {
		System.out.println("dont touch");
	}
}


class keyPadPhone extends Phone{
	boolean isKeypadLightAvailable;
	String lightColor;
	
	@Override
	void calling() {
		System.out.println("calling through keypad");
	}
	
	void onTorchLight() {
		System.out.println(" i have the option of torch");
	}
	private void myPersonalDairy() {
		System.out.println("dont touch");
	}
}

class SmartPhone extends Phone{
	
	String displayName;
	
	@Override
	//same rt, same method name, same no of param
	void calling() {
		System.out.println("calling through touch screen");
	}
	
	void takePicThroughFrontCam() {
		System.out.println("photo clicked...");
	}
	
}


