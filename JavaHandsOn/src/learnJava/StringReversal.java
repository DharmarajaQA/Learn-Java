package learnJava;

public class StringReversal {

	static String actual = "Learn Java";	

	public static void stringReversalOwnLogic() {		
		String reversal = "";
		char[] charArray = actual.toCharArray();
		for (int i=charArray.length-1; i>=0; i--) {
			reversal = reversal+charArray[i];
		}
		System.out.println("Actual String: "+actual);
		System.out.println("Reversed String: "+reversal);
	}

	public static void stringReversalBuiltin(){		
		StringBuilder builder = new StringBuilder(actual);
		StringBuilder reversal = builder.reverse();
		System.out.println("Actual String: "+actual);
		System.out.println("Reversed String: "+reversal);

	}
	
	public static void main(String[] args) {
		System.out.println("String Reversal Using Own Logic");
		System.out.println("*******************************");
		stringReversalOwnLogic();
		System.out.println("\nString Reversal Using String Builder");
		System.out.println("************************************");
		stringReversalBuiltin();
	}

}
