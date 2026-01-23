package jsp.dsa_practice;

public class BinarySearch {
	static int search(int[] arr, int key) {
		int l=0, h=arr.length-1;
		while(l<=h) {
			int m = (l+h)/2;
			if(arr[m] == key) {
				return m;
			}
			else if(arr[m] < key) {
				l=m+1;
			}
			else {
				h=m-1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = {8,11,17,21,29,33, 46};
		System.out.println(search(arr,33));
	}
}
