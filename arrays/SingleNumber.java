/*
Leetcode - Single number - https://leetcode.com/problems/single-number/ 

Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.
*/

/*
Approach 1: Store numbers in a set. It stores only non-duplicate elements. Required number = (Sum of elements in set) * 2 - Su
m of elements in the array. Time complexity is O(n). However, Space complexity is O(n) due to the creation of the set and we are supposed to do this in constant extra space
*/

/*
        int numsSum = 0, setSum =0;
        Set<Integer> numsSet = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++) {
            numsSum+=nums[i];
            numsSet.add(nums[i]);
        }
                
        Iterator<Integer> itr = numsSet.iterator();
        while(itr.hasNext()) {
        	setSum+= (int)itr.next();
        }
        return ((setSum * 2) - numsSum);
    }
}
*/

/*
Approach 2: Sort the array. Compare adjacent elements. O(nlogn) but constant space
*/

/*
Approach 3: Brute force. Run two loops and check. O(n^2) - Time complexity. Space complexity: O(1)
*/

import java.util.*;
class Solution {
    public int singleNumber(int[] nums) {
/* 
Optimal approach: Use XOR operator. XOR all numbers. Unique number will be the only number left
*/ 
        int uniqueNo = nums[0];
        for(int i=1; i<nums.length;i++) {
        	uniqueNo = uniqueNo ^ nums[i];
        }
        return uniqueNo;
    }
}
