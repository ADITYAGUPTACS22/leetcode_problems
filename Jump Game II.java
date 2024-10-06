class Solution {
    public int jump(int[] nums) {
      int steps = 0;
      int currstep = 0;
      int currstop = 0;
      if(nums.length  == 1){
        return 0;
      }
      for(int i=0 ; i<nums.length;i++){
          currstep = Math.max(currstep , i + nums[i]);
          if( i == currstop){
              steps += 1;
              currstop = currstep;
              if(currstop >= nums.length - 1) {
                return steps;
              }
          }
      }
      return steps-1;
    }
} 
