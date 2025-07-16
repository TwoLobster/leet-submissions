class Solution {
    public int maximumLength(int[] nums) {
        int even=0, odd=0, evenOdd=0, oddEven=0;
        for(int num : nums){
            if(num%2==0) even++;
            else odd++;
        }

        int parity=0;
        int revParity=1;

        for(int num : nums){
            if(num%2==parity){
                evenOdd++;
                parity^=1;
            }
            if(num%2==revParity){
                oddEven++;
                revParity^=1;
            }
        }
        return Math.max(Math.max(evenOdd, oddEven), Math.max(even, odd));
    }
}