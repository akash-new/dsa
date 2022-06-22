/*
Find triplets with zero sum - https://practice.geeksforgeeks.org/problems/find-triplets-with-zero-sum/1/

Approach 1: Brute force O(n^3) - Running 3 loops
Approach 2: O(n^2) - Sort the array and use two pointer approach
*/
class Solution
{
    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.

  public boolean findTriplets(int a[] , int n)
    {
        //add code here.
        Arrays.sort(a);
        boolean tripletExists = false;
        
        for(int i=0;i<n-2;i++) {
            int target = a[i] * (-1);
            int low =i+1, high = n-1;
            while(low<high) {
                if(a[low]+a[high] == target) {
                    return true; 
                } else if((a[low] + a[high] ) < target) {
                    low++;
                } else {
                    high--;
                }
            }
        }
        
/* Brute force approach
      for(int i=0;i<n-2;i++) {
            for(int j=i+1;j<n-1;j++) {
                for(int k=j+1;k<n;k++) {
                    if(a[i] + a[j] + a[k] ==0) {
                        tripletExists = true;
                        break;
                    }
                }
            }
        }
*/        
        return tripletExists;
    }
}
