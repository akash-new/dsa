package RandomTesting;

import java.util.*;
import java.lang.*;

class ReverseArray {

	public static void main(String args[]) {
		int [] arr = {2,5,4,7,9,10};
		int n = arr.length;
		for(int i=0,j=n-1; i<n/2;i++,j--) {
			int temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}
}
