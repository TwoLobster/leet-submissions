class Solution {
    public String reverseWords(String s) {
        String[] strs = s.trim().split("\\s+");
        for(int i=0; i<strs.length/2; i++){
            String temp=strs[i];
            strs[i]=strs[strs.length-i-1];
            strs[strs.length-i-1]=temp;
        }   
        
       StringBuilder sb = new StringBuilder();
        sb.append(strs[0]);
        for (int i = 1; i < strs.length; i++) {
            sb.append(" ").append(strs[i]);
        }
        return sb.toString();
    }
}