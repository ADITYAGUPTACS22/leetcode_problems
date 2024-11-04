class Solution {
    public int binarySearch(int[] nums, int target, boolean findFirst) {
        int start = 0;
        int end = nums.length - 1;
        int idx = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                idx = mid;
                if (findFirst) end = mid - 1;
                else start = mid + 1;
            } else if (nums[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return idx;
    }

    public int[] searchRange(int[] nums, int target) {
        int[] range = new int[2];
        int first = binarySearch(nums, target, true);
        int last = binarySearch(nums, target, false);
        range[0] = first;
        range[1] = last;
        return range;
    }
}
