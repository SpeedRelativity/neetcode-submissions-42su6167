class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
            
        int n = position.length; // number of cars
        int[][] cars = new int[n][2];

        for(int i = 0; i < n; i++){
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }
        
        // now we must sort the cars 

        Arrays.sort(cars, (a,b) -> b[0] - a[0]); // if a car is ahead, then move it ahead in sort. 

        // now we have a sorted array. 

        int fleetNums = 0;
        double lastFleetTime = 0;

        for(int i = 0; i < n; i++){
            int pos = cars[i][0];
            int spd = cars[i][1];

            double time = (double)(target - pos) / spd;
            if (time > lastFleetTime){
                fleetNums++;
                lastFleetTime = time;
            }
        }

        return fleetNums;
        

    }
}
