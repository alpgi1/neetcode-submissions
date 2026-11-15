class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] pair = new int[speed.length][2];
        for(int i = 0; i < speed.length; i++){
            pair[i][0] = position[i];
            pair[i][1] = speed[i];
        }
        Arrays.sort(pair, (a,b) -> Integer.compare(b[0], a[0]));
        double last = 0; int fleets = 0;
        for (int[] p : pair) {
            double t = (double)(target - p[0]) / p[1];
            if (t > last) { fleets++; last = t; }
        }
        return fleets;
    }
}
