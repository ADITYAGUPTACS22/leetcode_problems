class Solution {
    public int maxGoodNumber(int[] nums) {
        String[] binaryStrings = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            binaryStrings[i] = Integer.toBinaryString(nums[i]);
        }

        Arrays.sort(binaryStrings, (a, b) -> (b + a).compareTo(a + b));

        StringBuilder sb = new StringBuilder();
        for (String binary : binaryStrings) {
            sb.append(binary);
        }

        return Integer.parseInt(sb.toString(), 2);
    }
}
