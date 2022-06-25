//Leetcode - https://leetcode.com/problems/spiral-matrix/

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        
        int top = 0, bottom = rows-1, left =0, right = columns-1;
        List<Integer> resultList = new ArrayList<Integer>();
        
        while(top<=bottom && left<=right) {
            for(int i=left;i<=right;i++) {
                resultList.add(matrix[top][i]);
            }
            top++;
            
            for(int i=top;i<=bottom;i++) {
                resultList.add(matrix[i][right]);
            }
            right--;
            
            // Important: Don't miss this if check
            if(top<=bottom) {
                for(int i=right;i>=left;i--) {
                    resultList.add(matrix[bottom][i]);
                }
                bottom--;
            }
            
            // Important: Don't miss this if check
            if(left<=right) {
                for(int i=bottom;i>=top;i--) {
                    resultList.add(matrix[i][left]);
                }
                left++;
            }
            
        }
        
        return resultList;
    }
}
