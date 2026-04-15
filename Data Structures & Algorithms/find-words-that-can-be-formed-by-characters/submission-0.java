class Solution {
    public int countCharacters(String[] words, String chars) {
       int freq[]=new int[26];

       for(char c:chars.toCharArray()){
        freq[c-'a']++;
       }
       int result=0;

       for(String s:words){
        int clone[]=freq.clone();
        boolean valid=true;

        for(char c:s.toCharArray()){
        if(clone[c-'a']--==0){
            valid=false;
            break;
        }
        }

        if(valid){
            result+=s.length();
        }
       }

       return result;
    }
}