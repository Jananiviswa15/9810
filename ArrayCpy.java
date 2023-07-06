
public class ArrayCpy {

	public static void main(String args[]) {
		int arr[] = {34,56,78};
//		int onemoreArr[] = new int[arr.length]; //34 56 0 
//	
//	for(int ctr = 0; ctr < arr.length; ctr++) {
//		onemoreArr[ctr] = arr[ctr];
//	}
//	
	int copyArr[] = arr.clone(); //12
//	}
		
		int onemoreArr[];
		onemoreArr = arr; //3000adrs
		System.out.println(onemoreArr[0]);
		System.out.println(onemoreArr == arr);
		System.out.println(copyArr == arr);
	}
}
