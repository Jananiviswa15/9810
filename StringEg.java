
public class StringEg {

	public static void main(String rgs[]) {
		//String , StrBuilder, Strbuffer
		//String --> 1. literals 2. new keyword 
		String literal = "Jan ani";
		String literal1 = "hi";
		String literal3 = "Janani"; //never into scp
		String literal4 = "hi";
		String literal5 = "HI";
		//str constant pool  //literal, literal3 --> Janani,hi (literal1, literal4)
		//literal5 --> HI
		
//		System.out.println(literal.equals(literal3));
//		System.out.println(literal4.equals(literal5));
//		System.out.println(literal4.equalsIgnoreCase(literal5));
//		
	
		String object1 = new String("Janani");
		String object2 = new String("Janani");
		
		System.out.println(object1 == object2);
//	System.out.println(literal3.equals(object2));
//	
	System.out.println(literal == literal3); //adrs 
	
//	System.out.println(literal.charAt(3));
//	System.out.println(literal.concat("say hi"));  //Jananisay hi
//	literal = literal.concat("hellloooooo"); //Jananihellloooooo
//	System.out.println(literal);  //str is immutable
//	
//	System.out.println(literal == literal3);
	
	System.out.println(literal.length());
	System.out.println(literal.indexOf('a')); //Jan ani
	System.out.println("     hi".stripLeading());
	System.out.println("     hi             ".stripTrailing());
	System.out.println("    hello   all    ".strip());
	
	System.out.println("     ".isEmpty());
	System.out.println("".isEmpty());
	
	System.out.println(" ".isBlank());
	System.out.println("appy".compareTo("appi")); //+ve, -ve or 0
	
	char arr[] = literal.toCharArray(); //'J','a','n',' ','a',ni
	char letters[] = {'h', 'h', 'u'};
	String str = new String(letters);
		System.out.print(str);
	System.out.println("lower".toUpperCase());
	System.out.println("HELLOdsf".toLowerCase());
	}
}
