/*
Use two pointers to reduce worst case complexity
*/

public static int optimizedLinearSearch(int[] arr, int x) {

		int n = arr.length;
		int left = 0, right = n - 1;

		for (; left <= right;) {
			if (arr[left] == x) {
				return left;
			} else if (arr[right] == x) {
				return right;
			}

			left++;
			right--;
		}

		return -1;
	}
