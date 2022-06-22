/*
  https://leetcode.com/problems/3sum/ IMPORTANT
*/

class Solution {

    /* Solving for unique triplets is a challenge 
    Use set to handle duplicate cases. Revise this problem again for the duplicate part
    */
    
    public List<List<Integer>> threeSum(int[] a) {
        int n = a.length;
        Arrays.sort(a);
        Set<List> ans = new HashSet<>();
        List<List<Integer>> resultList = new ArrayList<List<Integer>>();
        for(int i=0;i<n-2;i++) {
            if(i >0 && a[i] == a[i-1]){
                continue;
            }
            int target = a[i] * (-1);
            int low =i+1, high = n-1;
            while(low<high) {
                if(a[low]+a[high] == target) {
                    ans.add(Arrays.asList(a[i], a[low], a[high]));
                    low++;
                    high--;
                } else if((a[low] + a[high] ) < target) {
                    low++;
                } else {
                    high--;
                }
            }
        }
        List<List<Integer>> finalList = new ArrayList<>();
        ans.forEach((e) -> {finalList.add(e);});
        return finalList;
    }
}
