class Solution {
    public int lengthOfLastWord(String s) {
        int i=s.length()-1;
        int count=0;
        while(i>=0){
            if (s.charAt(i)==' ')i--;
            else break;
        }
        // if(i<)
        for(int j=0; j<=i; j++){
            if(s.charAt(j)==' ')count=0;
            else count++;
        }
        return count;
    }
}