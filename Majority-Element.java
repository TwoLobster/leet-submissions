class Solution {
    public int majorityElement(int[] nums) {
        int count=0, element=0;
        for(int i=0; i<nums.length; i++){
            if(count==0){
                element=nums[i];
                count++;
            }
            else if(element==nums[i])count++;
            else count--;
        }
        int count1=0;
        for(int u=0; u<nums.length; u++){
            if(nums[u]==element)count1++;
        }
        if(count1>(nums.length/2))return element;
        return -1;
    }
}