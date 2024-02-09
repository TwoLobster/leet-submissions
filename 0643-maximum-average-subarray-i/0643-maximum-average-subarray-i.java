class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxavg=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<=n-k; i++ ){
            int sums=0;
            for(int j=i; j<i+k; j++){
                sums=sums+nums[j];
            }
         double avg=(double)sums/k;
            maxavg=Math.max(maxavg, avg);
        }
        return maxavg;
    }
}