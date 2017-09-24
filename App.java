public class App {

	public static void main(String[] args) {
		int[] n = { 2, 6, 13, 21, 36, 42, 63, 81, 97 };
		int target = 13;
		int index = binarySearch(n, n.length, target);
		if (index != -1)
			System.out.println("Found " + target + " at " + index);
		else
			System.out.println("Not Found !! ");
	}

	public static int binarySearch(int n[], int size, int target) {
		int start = 0;
		int end = n.length - 1;
		while (start <= end) {
			/* because (start+end) / 2 may overflow.*/
			int mid = start + (end - start) / 2; 
			if (n[mid] == target) {
				return mid;
			} else if (target < n[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}
}