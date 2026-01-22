package jsp.dsa_practice;

public class ArrayRepresentation {
	static int m1(int... arr) {
		for(int ele : arr) {
			System.out.print(ele+ " ");
		}
		System.out.println();
		return -1;
	}
	
	static int m2(int[] arr) {
		for(int ele : arr) {
			System.out.print(ele+ " ");
		}
		System.out.println();
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		m1(1,2,3,4,5);     // int... lets Java make the array by itself, while int[] needs the caller to give an array explicitly.
		// m2(1,2,3,4,5);  // Not possible 
		m1(arr);
		m2(arr);
		m2(new int[] {12,34,13});
	}
}
