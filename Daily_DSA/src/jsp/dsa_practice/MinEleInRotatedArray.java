package jsp.dsa_practice;

//LeetCode 153
public class MinEleInRotatedArray {
	public static void main(String[] args) {
		int[] arr = {3,4,5,2,1,0};
		int l=0, h=arr.length-1;
		while(l<h) {
			int mid = (l+h)/2;
			if(arr[mid]> arr[h]) {
				l=mid+1;
			}
			else {
				h=mid;
			}
		}
		System.out.println(arr[l]);
	}
}
