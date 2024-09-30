class Solution {
    public int removeDuplicates(int[] nums) {
        int left=2;
        int i; 
        for(i=2; i<nums.length; i++){
                if(nums[left-1]==nums[i]){
                    if(nums[left-1]==nums[left-2]) continue;
                    nums[left++]=nums[i]; continue;
                }
                if(nums[left-1]!=nums[i])
                    nums[left++]=nums[i];
            }
        return left;    
    }
}
