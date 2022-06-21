/*
Problem Statement
Given an array/list 'ARR' of integers and a position ‘M’. You have to reverse the array after that position.
Example:
We have an array ARR = {1, 2, 3, 4, 5, 6} and M = 3 , considering 0 
based indexing so the subarray {5, 6} will be reversed and our 
output array will be {1, 2, 3, 4, 6, 5}.
*/


import java.util.ArrayList;

public class Solution 
{
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
        int n = arr.size();
        int remainingElements = n - (m+1);       
        for(int i=m+1,j=n-1; i<= m+(remainingElements/2);i++,j--) {
            int temp = 0, x = arr.get(i), y = arr.get(j);
            temp =x;
            x = y;
            y = temp;
            arr.set(i, x);
            arr.set(j, y);
        }
      
      /* Much cleaner code

       int i=m+1;
       int j=arr.size()-1;
       while(i<=j)
       {
           Collections.swap(arr, i, j);
           i++;
           j--;
       }

       */
      
    }
}
