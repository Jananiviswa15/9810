package otherPackage;

public class DriverClass {

	public static void main(String args[]) {
		//Phone phone = new Phone();
		//phone.calling();
		//charingCapacity; costOfThePh; brandName;
		//phone.myPersonalDairy();
		
		keyPadPhone keyObj = new keyPadPhone();
		// charingCapacity; costOfThePh; brandName;isKeypadLightAvailable;lightColor
		keyObj.calling();
		keyObj.onTorchLight();
		keyObj.parentMethodd();
	}
}
