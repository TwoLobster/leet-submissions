class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String arr[]=sentence.split(" ");
        int len=searchWord.length();
        for(int i=0; i<arr.length; i++){
            if(arr[i].length()<len)continue;
        else if(arr[i].substring(0, len).equals(searchWord)){
                return i+1;
            }
        }
        return -1;
    }
}