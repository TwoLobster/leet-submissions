class Solution {
    public boolean divideArray(int[] nums) {
        int[] freq=new int[501];
        int count=0;
        for(int num : nums){
            freq[num]++;
        }
        for(int f : freq){
            if(f%2!=0)return false;
            else count+=(f/2);
        }
        return count==(nums.length/2);
    }
}