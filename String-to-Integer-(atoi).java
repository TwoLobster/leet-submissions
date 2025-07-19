class Solution {
    public int myAtoi(String s) {
        if (s == null || s.length() == 0) return 0;
        boolean negative=false;
        long num=0;
        int i=0;

        while(i<s.length() && s.charAt(i)==' '){
            i++;
        }
        if (i>=s.length()) return 0;

        if(s.charAt(i)=='-'){
            negative=true;
            i++;
        }
        else if(s.charAt(i)=='+')i++;
        if(i>s.length()-1)return 0;
        while(i<s.length() && s.charAt(i)>='0' && s.charAt(i)<='9'){
            num=num*10;
            num=num+(s.charAt(i)-'0');
            if(num>Integer.MAX_VALUE)return negative?Integer.MIN_VALUE:Integer.MAX_VALUE;
            i++;
        }
        if(negative==true){
            num=-num;
        }
        return (int)num;
    }
}