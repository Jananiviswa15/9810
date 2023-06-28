
public class LadderIf {
/*
 * if(cond){
 * }
 * else if(cond){
 * }
 * else if(cond){
 * }
 else if(cond){
 * }
 * else if(cond){
 * }
 * else{
 * }
 * ladder if last else is not compulsory
 */
	void toWorkWithLadderIf(int value) {
		if(value > 0)
			System.out.println("positive");
		else if(value < 0)  //neg, 0
			System.out.println("negative");
//		else
//			System.out.println("whole number");
		else if(value == 0) System.out.println("whole number");
	}
	public static void main(String arsg[]) {
		int value = 89;
		toWorkWithLadderIf(value);
	}
}
