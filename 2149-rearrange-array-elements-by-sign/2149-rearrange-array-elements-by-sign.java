class Solution {
    public int[] rearrangeArray(int[] nums) {
        int [] arr=new int[nums.length];int index=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>0)
            {
                arr[index]=nums[i];
                index+=2;
            }
            else continue;
        }
        index=1;
        for(int j=0; j<nums.length; j++){
            if(nums[j]<0)
            {
                arr[index]=nums[j];
                index+=2;
            }
            else continue;
        }
        return arr;
    }
}