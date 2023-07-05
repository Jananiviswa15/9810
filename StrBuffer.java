
public class StrBuffer {
	//thread safe --> muktiple threads cant access it simultane
	public static void main(String args[]) {
		String str1 = "hello all";
		StringBuffer str2 = new StringBuffer();
		StringBuffer str3 = new StringBuffer("hiii");
		StringBuffer str = new StringBuffer(str1);
		System.out.println(str.length());
		str.append("hi");
		
		System.out.println(str.charAt(0));
		System.out.println(str.insert(3,"oooo"));
		str.replace(2, 5, "replaced");
		System.out.println(str);
		str.delete(1, 4); //hplacedoolo allhi
		str.deleteCharAt(0);
		System.out.println(str);
		System.out.println(str.reverse());
		System.out.println(str.isEmpty());
		System.out.println(str.indexOf("ih"));
		System.out.println(str.lastIndexOf("o"));
		System.out.println(str.lastIndexOf("o", 2));
		System.out.println(str.substring(4, 7));
		System.out.println(str.substring(4));
		

	}
}
