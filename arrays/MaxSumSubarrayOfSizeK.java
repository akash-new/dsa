//Sliding window concept

static long maximumSumSubarray(int k, ArrayList<Integer> a,int n){
        // code here
        long cur_sum=0, max_sum = 0;
        
        for(int i=0;i<k;i++) {
            cur_sum+=a.get(i);
        }

        max_sum = cur_sum;
        for(int i=1, j=i+k-1; j<n; i++,j++) {
            cur_sum = cur_sum+a.get(j)-a.get(i-1);
            if(cur_sum > max_sum) {
                max_sum = cur_sum;
            }
        }
        return max_sum;
    }
