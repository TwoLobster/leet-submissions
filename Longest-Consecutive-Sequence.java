class Solution {
    public int longestConsecutive(int[] nums) {
     HashSet<Integer> h=new HashSet<>();
     for(int num:nums){
        h.add(num);
     }   
     int maxLen=0;
     for(int num: h){
        if(!h.contains(num-1)){
            int len=1;
            int current=num;
            while(h.contains(current+1)){
                len++;
                current++;
            }
            maxLen=Math.max(len, maxLen);
        }
     }
     return maxLen;
    }
}