class Solution {
    
    public boolean ispal(String str){
        int count=0, n=str.length();
        for(int i=0; i<=n/2; i++){
            if(str.charAt(i)!=str.charAt(n-i-1)) return false;
        }
              return true;
    }
    public String firstPalindrome(String[] words) {
        for(int i=0; i<words.length; i++){
            if(ispal(words[i]))return words[i];
        }
        return "";
    }
}