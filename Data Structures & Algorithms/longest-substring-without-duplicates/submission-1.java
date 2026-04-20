class Solution {
    public int lengthOfLongestSubstring(String s) {
        int []map=new int[256];
        int left=0;
        int max=0;

        for(int right=0;right<s.length();right++){
            char c=s.charAt(right);
            if(map[c]>0){
                left=Math.max(left,map[c]);
            }

            map[c]=right+1;

            max=Math.max(max.right-left+1);
        }

        return max;
    }
}
