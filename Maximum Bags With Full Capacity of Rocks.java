class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int ar) {
        for(int i=0;i<rocks.length;i++){
            rocks[i]=capacity[i]-rocks[i];
        }
        Arrays.sort(rocks);
        int count = 0;
        for(int i=0;i<rocks.length;i++){
            if(ar>=rocks[i]){
                ar-=rocks[i];
                count++;
            }
            
        }
        return count;
    }
}
