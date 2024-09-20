class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gasInCar = 0;
        int n = gas.length;
        int totalmoney = 0, totalGas = 0;
        for(int i=0; i< n;i++) {
            totalmoney += cost[i];
            totalGas += gas[i];
        }
        if(totalGas < totalmoney) return -1;
        int iStation = 0;
        for(int i=0; i< n;i++) {
            gasInCar += gas[i] - cost[i];
            if(gasInCar < 0) {
                gasInCar = 0;
                iStation = i+1;
            }
        }
        return iStation;
        
    }
}
