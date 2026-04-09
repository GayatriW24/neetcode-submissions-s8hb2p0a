class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> num=new HashSet<>();
        for(int n:nums){
            if(num.contains(n))
            return true;

            num.add(n);
        }
        return false;
    }
}