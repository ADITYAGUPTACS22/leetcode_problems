// bottom to top
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
    int size = triangle.size();
        int[] arr = new int[size];
        for(int i =0 ;i< size;i++) arr[i] = triangle.get(size-1).get(i);
        
        for(int i =size-2 ;i >= 0;i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                arr[j] = Math.min(arr[j], arr[j+1]) + triangle.get(i).get(j);
            }
        }
        return arr[0];
    }
}
