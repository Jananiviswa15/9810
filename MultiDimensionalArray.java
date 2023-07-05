import java.util.Scanner;

public class MultiDimensionalArray {

	private static Scanner scan = new Scanner(System.in);
	
	private static void readValues(int arr[][]) {
		for(int row = 0 ; row < arr.length; row++ ) {  //3
			for(int col = 0 ; col < arr[row].length; col++ ) {  //3
				//00 01 02
				//10 11 12
				//20 21 22
				arr[row][col] = scan.nextInt();
			}
		}
	}
	public static void main(String args[]) {
//		int arr[][]; //arr decl
//		arr = new int[3][5];
//		int arr1[][] = { //arr def
//				{23, 45, 67},
//				{67, 34, 45},
//				{23, 12, 12}
//		};
//System.out.println(arr1.length);  //no of r
//System.out.println(arr1[0].length);  //0th row no of col
//System.out.println(arr1[1].length); //no of c in 1st row
//System.out.println(arr1[2].length);
//		/*int arr[][]
//		 * int[][] arr
//		 * int arr[][]
//		 * int [][]arr
//		 */
//		short array[][] = {
//				{23, 45, 67, 89},
//				{67, 34, 45, 90},
//				{23, 12, 12, 0}
//		};
//
//int multiDimArray[][] = new int[3][4];  //12 ele
//int multiDimArray1[][] = new int[3][]; //row num is comp
//multiDimArray1[0] = new int[4];  //00 01 02 03  --> 0
//multiDimArray1[1] = new int[7];//10 11 12 13 14 15 16  --> 0
//multiDimArray1[2] = new int[4];  //jagged array //20 21 22 23  --> 0
//
//
//System.out.println(multiDimArray1.length); //3
//System.out.println(multiDimArray1[0].length);  //4
//System.out.println(multiDimArray1[1].length); //7
//System.out.println(multiDimArray1[2].length); //4
int row = scan.nextInt();
int col = scan.nextInt();
		int arr[][] = new int[row][col];  //3 * 3
		readValues(arr);
		displayArrValues(arr);
	}
	private static void displayArrValues(int[][] arr) {
		for(int row = 0 ; row < arr.length; row++ ) {  //3
			for(int col = 0 ; col < arr[row].length; col++ ) {  //3
				//00 01 02
				//10 11 12
				//20 21 22
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();
		}
		
		
	}
}
