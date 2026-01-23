package jsp.dsa_practice;

public class KthOccurance {
	static int findMax(int[] arr) {
		int max = arr[0];
		for(int ele : arr) {
			if(max < ele) {
				max = ele;
			}
		}
		return max;
	}
	
	static int findKthOccurance(int[] arr, int[] temp, int k) {
		for(int ele : arr) {
			temp[ele]++;
			if(temp[ele] == k) {
				return ele;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,4,3,6,7,3,6,9,4};
		int k=2;  // means first 2nd occurance
		int max = findMax(arr);
		int[] temp = new int[max+1];
		System.out.println(findKthOccurance(arr, temp, k));
	}

}
