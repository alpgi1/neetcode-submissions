class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalCost = 0;
        int totalGas = 0;
        int tank = 0;
        int start = 0;

        for(int i = 0; i < gas.length; i++){
            tank += gas[i];
            totalCost += cost[i];
            totalGas += gas[i];
            tank -= cost[i];

            if(tank < 0){
                start = i+1;
                tank = 0;
            }
        }
        return totalGas >= totalCost ? start : -1;
    }
}
