/* 
   Have implemented this using the Two pointer approach 
*/

class Sort0sAnd1s {

	public static void main(String args[]) {
		int [] arr = {0,1,1,0,0,1};
		int n = arr.length;
		int low=0, high = n-1;
		
		while(low<high) {
			if(low<high && arr[low]==0) {
				low++;
			}
			
			if(low<high && arr[high]==1) {
				high--;
			}
			
			if(low<high) {
				int temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
			}
		}
		
		for(int i=0; i<n;i++) {
			System.out.println(arr[i]);
		}

	}
}
