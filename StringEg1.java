
public class StringEg1 {

	public static void main(String args[]) {
		String str = "hello all";
		System.out.println(str.startsWith("hel"));
		System.out.println(str.endsWith("hel"));
		System.out.println(str.substring(2));
		System.out.println(str.substring(2,6));
		System.out.println(str.contains(" a"));
		System.out.println(str.repeat(3));
		System.out.println(str.replace('a', 't'));
		System.out.println(str.indexOf('e', 6));
		
		String strObj = new String("hello all").intern();
		System.out.println(str == strObj);
		int num = 12;
		System.out.println(String.valueOf(num));
		String numSTr = String.valueOf(num); //"12"
		System.out.println(numSTr instanceof String);
		
	}
}
