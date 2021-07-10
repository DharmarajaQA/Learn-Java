package learnJava;

public class DuplicateValueinArray {

	static int[] a = {1,2,4,2,1,4};
	static int duplicateCount = 0;

	public static void findDuplicate() {
		System.out.println("Duplicate Values in array are: ");
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i] == a[j]){
					System.out.println(a[j]);
					duplicateCount++;
				} 
			}		
		} 	
		System.out.println("Duplicate Values in array count: "+duplicateCount);
	}

	public static void main(String[] args) {
		findDuplicate();
	}
}
