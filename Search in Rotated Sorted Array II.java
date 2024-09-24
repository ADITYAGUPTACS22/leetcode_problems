class Solution {
     public boolean search(int[] nums, int target) {
        int end = nums.length-1;
        int mid = end/2;
        for (int i = 0, a=mid, b=mid, v=end; i <= mid; i++, a--, b++, v--){
            if (nums[i] == target || nums[a] == target || nums[v] == target || nums[b] == target){
                return true;
            }
    }
    return false;
}
}
