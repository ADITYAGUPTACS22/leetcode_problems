class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int size = triangle.size();
        for (int i = size - 2; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                int minimumSum = Math.min(triangle.get(i + 1).get(j), triangle.get(i + 1).get(j + 1));
                int currVal = triangle.get(i).get(j);
                triangle.get(i).set(j, currVal + minimumSum);
            }
        }
        return triangle.get(0).get(0);
    }
}
