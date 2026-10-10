class Solution {
    public int removeDuplicates(int[] nums) {
     int result =    removeDuplicatesOnebyOne(nums);
     return result+1;

    }
    public static int removeDuplicatesOnebyOne(int[] nums){
        int start =0;
        for(int end =1; end<=nums.length-1;end++){
            if(nums[end]!=nums[start]){
                start=start+1;
                nums[start] = nums[end];
            }
        }

return start;
    }


}