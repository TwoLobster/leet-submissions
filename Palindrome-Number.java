class Solution {
    public boolean isPalindrome(int x) {
        if (x<0 || (x%10==0 && x!=0)) return false;
        int y=0;
        int z=x;
        while (z!=0){
            y*=10;
            y+=z%10;
            z/=10;
        }
        if (x==y){
            return true;
        }
        return false;
    }
}