
public class Array {

	public static void main(String anything[]) {
int age;
		int num = 90;
		int arr[];//arr decl
		
		float sampleArr[];  //no mem purschase
	//	sampleArr = new float[90]; //mem allocated , default value
		boolean booleanArr[] = new boolean[9];//mem purchased, def 
		booleanArr[1] = true;
		float floatArr[] = new float[100];
		double doubleArr[] = new double[10];
		long longArr[] = new long[9];
		arr = new int[10]; //40bytes of cont
		short []shortArr = new short[4];
		byte[] byteArr = new byte[7];
		char charArrEg[] = new char[3];
age = 90;
		int markArray[] = {90,89,78,56,23}; //4bytes
//		System.out.println(markArray[0]);
//		System.out.println(markArray[1]);
//		System.out.println(markArray[2]);
//		System.out.println(markArray.length);
//		//System.out.println(markArray[5]); arr index out 
//		System.out.println(markArray);
//		System.out.println(floatArr);
//		System.out.println(doubleArr);
//		System.out.println(shortArr);
//		System.out.println(byteArr);
//		System.out.println(longArr);
//		System.out.println(charArrEg);
//		System.out.println(booleanArr);

System.out.println(byteArr[0] +" "+ byteArr[1]);
System.out.println(charArrEg[0]+ " "+ charArrEg[1]);
System.out.println(booleanArr[0]+ " "+ booleanArr[1]);
System.out.println(floatArr[0] + " "+ floatArr[1]);

//System.out.println(sampleArr.length);  //only after purchasing mem u can use

	}
}
