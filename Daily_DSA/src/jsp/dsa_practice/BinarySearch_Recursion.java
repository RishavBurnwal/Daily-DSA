package jsp.dsa_practice;

public class BinarySearch_Recursion {
	static int search(int[] arr, int key, int l, int h) {
		if(l>h) {
			return -1;
		}
		int m = (l+h)/2;
		if(arr[m] == key) {
			return m;
		}
		else if(arr[m] < key) {
			return search(arr,key,m+1,h);
		}
		else {
			return search(arr,key,l,m-1);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {8,11,17,21,29,33, 46};
		int result = search(arr,33,0,6);
		System.out.println(result);
	}
}
