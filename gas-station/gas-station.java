class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tank = 0;
        int curTank = 0;
        int res = -1;
        for(int i = 0 ; i < gas.length ; ++i){
            tank += gas[i];
            tank -= cost[i];
            
            if(curTank + gas[i] - cost[i] < 0) curTank = gas[i] - cost[i];
            else {
                curTank += gas[i];
                curTank -= cost[i];
            }
            
            if(res != -1 && curTank < 0 && gas[i] < cost[i]){
                res = -1;
                curTank = 0;
            }
            
            if(gas[i] >= cost[i] && res == -1){
                if(gas[i] + gas[(i + 1) % gas.length] - cost[i] >= cost[(i + 1) % gas.length]) res = i;
            }
        }
        
        return tank >= 0 ? res : -1;
    }
}