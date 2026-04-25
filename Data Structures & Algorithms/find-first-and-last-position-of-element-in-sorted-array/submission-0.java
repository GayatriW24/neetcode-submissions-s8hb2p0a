class Solution {
    public int[] searchRange(int[] nums, int target) {
         int first=findFirst(nums, target);
         int last=findLast(nums,target);

         return new int[]{first,last};
    }
    public int findFirst(int []nums, int target){
        int res=-1;
        int left=0;
        int right=nums.length-1;

        while(left<=right){
            int mid=left+(right-left)/2;

            if(target==nums[mid]){
                res=mid;
                right=mid-1;
            }
            else if(target<nums[mid])
                 right=mid-1;
            else
             left=mid+1;
               
        }

        return res;
    }


    public int findLast(int []nums, int target){
        int res=-1;
        int left=0;
        int right=nums.length-1;


        while(left<=right){
            int mid=left+(right-left)/2;
             if(target==nums[mid]){
                res=mid;
                left=mid+1;
             }else if(target<nums[mid])
                right=mid-1;
            else
              left=mid+1;    

        }
        return res;

    }
}