class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int left = 1;

        int right = 0;
        for(int n : piles){
            if(n > right){
                right = n;
            }
        }
        
        int mid = 0;
        while (left <= right){
            mid = (left + right) / 2; // mid is the rate.
            int hours = 0;

            for(int i = 0; i < piles.length; i++){
                

                hours += (piles[i]) / mid;
                if(piles[i] % mid != 0){
                    hours++;
                }
            }

            if(hours > h){
                left = mid + 1;;
            }
            else{
                right = mid - 1;
                
            }
            
        }

        return left;
        
    }

    
}
