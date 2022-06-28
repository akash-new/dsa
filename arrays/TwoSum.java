// Brute force - O(n^2) Run two loops

import java.util.HashMap;
import java.util.Map;
class Solution {
    public int[] twoSum(int[] a, int target) {
   // Implementation using hashmap
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] resultArr = new int[2];
        for(int i=0;i<a.length;i++) {
            int x = target - a[i];
            if(map.containsKey(x)) {
                if(i < map.get(x)) {
                    resultArr[0] = i;
                    resultArr[1] = map.get(x);
                } else {
                    resultArr[0] = map.get(x);
                    resultArr[1] = i;
                }
                return resultArr;
            }
            map.put(a[i], i);
        }
        return resultArr;
    }
}
