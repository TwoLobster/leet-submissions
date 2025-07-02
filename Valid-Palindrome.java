class Solution {
    public boolean isPalindrome(String s) {
        String str=s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int size=str.length();
        for(int i=0; i<size/2; i++){
            if (str.charAt(i)!=str.charAt(size-i-1)){
                return false;
            }
            else continue;
        }
        return true;
    }
}