public class Minimum_Number_of_K_Consecutive_Bit_Flips {
    public static int minKBitFlips(int[] nums, int k) {
        int n = nums.length;
        int ans = 0;
        int times = 0;

        for (int i = 0; i < n; i++) {
            if (i >= k) {
                if (nums[i - k] > 1) {
                    nums[i - k] -= 2;
                    times -= 1;
                }
            }

            if ((nums[i] == 1 && times % 2 == 1) || (nums[i] == 0 && times % 2 == 0)) {
                if (i + k > n)
                    return -1;
                ans++;
                times++;
                nums[i] += 2;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums={0,1,0};
        int k=1;
        System.out.println(minKBitFlips(nums,k));
     }
}
