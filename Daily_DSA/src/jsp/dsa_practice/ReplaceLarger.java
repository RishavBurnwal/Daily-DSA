package jsp.dsa_practice;

// Replace the element by larger element towards right side. If larger element is not larger than current replaced by -1.

public class ReplaceLarger {
	public static void main(String[] args) {
		int[] arr = {12,6,17,7,8,2};
		int max = arr[arr.length-1];
		
		for(int i=arr.length-1 ; i>=0; i--) {
			if(max <= arr[i]) {
				max = arr[i];
				arr[i] = -1;
			}
			else {
				arr[i] = max;
			}
		}
		for(int ele : arr) {
			System.out.print(ele+ " ");
		}
	}
}
