/*
Approaches:

1) Rotate once. Then do it k times. Time complexity is o(n * k)
2) Rotate elements to the right. Store remaining elements that get pushed out in a separate array. Then finally add these elements into the original array
3) Reverse two times approach. Reverse the two parts individually once. Then reverse the whole remaining array one more time to get the right answer. Same approach can be followed for anticlockwise rotation as well.
Use this diagram for reference: https://github.com/Prince-1501/Hello_world-Competiitve-Programming/blob/master/Leetcode/Rotate%20Array%20Leetcode%20Solution.pdf

Leetcode question: 

Leetcode optimal solution:
*/

class Solution {
    public void rotate(int[] arr, int k) {
        int n = arr.length;
        if(k>n) {
            k = k%n;
        }
        reverseArray(arr, 0, n-k-1);
        reverseArray(arr,  n-k, n-1);
        reverseArray(arr, 0, n-1);
    }
    
    public static void reverseArray(int arr[], int start, int end) {
		
		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	
	/* Using O(n) space code
	int k = 3;
		int n = arr.length;
		int [] tempArr = new int[k];
	
		
		for(int i=k-1,j=0; i<n;i++,j++) {
			tempArr[j] = arr[i];
		}

		for(int i=k, j=0;i<n;i++,j++) {
			arr[i] = arr[j];
		}
		
		for(int i=0;i<k;i++) {
			arr[i] = tempArr[i];
		}
	*/
}
