/* Leetcode - https://leetcode.com/problems/remove-duplicates-from-sorted-array/ 
Keep a pointer at the beginning and swap the number at the pointer with the new unique number found and increment the pointer ahead
*/

public int removeDuplicates(int[] nums) {
   int k =1;
        
        for(int i=1; i<nums.length;i++) {
            if(nums[i] != nums[i-1]) {
                nums[k++] = nums[i];
            }
        }
        
        return k;
}
