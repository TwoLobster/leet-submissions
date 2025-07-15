class Solution {
    public boolean isValid(String word) {
        int consonant=0, vowel=0;
        if(word.matches("[a-zA-Z0-9]+")==false)return false;
        for(char w: word.toCharArray()){
            
            if(Character.isLetter(w)){
                w=Character.toLowerCase(w);
                 if (w == 'a' || w == 'e' || w == 'i' || w == 'o' || w == 'u') vowel++;
                 else consonant++;
            }
        }
        return word.length()>=3 && consonant>=1 && vowel>=1;
    }
}