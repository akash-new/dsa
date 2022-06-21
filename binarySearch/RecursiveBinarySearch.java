public static int recursiveBinarySearch( int[] arr, int low, int high, int x) {
  
  if(low>high) {
    return -1;
  }
  
  int mid = low + ((high - low)/2);   // int mid = (low + high) /2;
  
  if(arr[mid]==x) {
    return mid;
  } else if(arr[mid]>x) {
    return recursiveBinarySearch(arr,low,mid-1,x);
  } else {
    return recursiveBinarySearch(arr,mid+1,high,x);
  }
}
