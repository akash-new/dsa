public static int iterativeBinarySearch(int[] arr, int low, int high, int x) {
  
  while(low<=high) {
    int mid = low + ((high-low)/2);
    
    if(arr[mid]==x) {
      return mid;
    } else if(arr[mid] > x) {
      high = mid-1;
    } else {
      low = mid+1;
    }
  }
  
  return -1;
}
