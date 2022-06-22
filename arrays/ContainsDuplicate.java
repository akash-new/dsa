/* 
Leetcode 217 - ContainsDuplicate 1 - https://leetcode.com/problems/contains-duplicate/
*/

/*

1) Best approach: Add items to a set. Since set only stores non duplicate elements, duplicate elements won't be stored. Now compare the size of the set and the array to verify if duplicates are present or not.

Time complexity: O(n), Space complexity: O(n)

*/
        Set<Integer> numSet = new HashSet<Integer>();
        
        for(int i=0;i<a.length;i++) {
            numSet.add(a[i]);
        }
        
         if(numSet.size()==a.length) {
        	return false;
        } else {
        	return true;
        }

/*
Approach 2: Brute force O(n^2) by running two loops and comparing 
*/

/*
Approach 3: Sort the array and compare adjacent elements using == , Time complexity : O(nlogn)
*/

        Arrays.sort(a);
        
        for(int i=0;i<a.length-1;i++) {
            if(a[i]==a[i+1]) {
                return true;
            }
        }
        
        return false; 

/* 
Approach 4: Sort the array and compare adjacent elements using XOR (^) operator. Time complexity: O(nlogn)
*/
      Arrays.sort(a);
      boolean duplicateExists = false;
      for (int i = 0; i < a.length - 1; i++) {
        if ((a[i] ^ a[i + 1]) == 0) {
          duplicateExists = true;
          break;
        }
      }
          return duplicateExists;
