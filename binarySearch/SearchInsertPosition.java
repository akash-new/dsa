/* https://leetcode.com/problems/search-insert-position/

Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity. */

class Solution {
    public int searchInsert(int[] nums, int target) {
        int result = binarySearch(nums, target, 0, nums.length-1);
        return result;
    }
    
    public static int binarySearch(int[] nums, int target, int low, int high ) {
        int mid = (low + high) /2;
        if(low>high) {
            if(nums[mid] > target) {
                return mid;
            }
            return mid+1;
        }

        if(nums[mid] == target) {
			return mid;
		}
		else if(nums[mid]>target) {
			return binarySearch(nums, target, low, mid-1);
		}
		else{
			return binarySearch(nums, target, mid+1, high);
		}
    } 
}
