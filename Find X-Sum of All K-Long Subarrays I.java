import java.util.*;

class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int[] answer = new int[n - k + 1];

        for (int i = 0; i <= n - k; i++) {

            Map<Integer, Integer> frequencyMap = new HashMap<>();
            for (int j = i; j < i + k; j++) {
                frequencyMap.put(nums[j], frequencyMap.getOrDefault(nums[j], 0) + 1);
            }
            PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>(
                (a, b) -> {
                    if (b.getValue().equals(a.getValue())) {
                        return b.getKey() - a.getKey();
                    }
                    return b.getValue() - a.getValue(); 
                }
            );

            maxHeap.addAll(frequencyMap.entrySet());

            int sum = 0;
            int count = 0;
            while (!maxHeap.isEmpty() && count < x) {
                Map.Entry<Integer, Integer> entry = maxHeap.poll();
                sum += entry.getKey() * entry.getValue(); 
                count++;
            }

            answer[i] = sum;
        }

        return answer;
    }
}
