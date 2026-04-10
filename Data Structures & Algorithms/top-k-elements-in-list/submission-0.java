class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for(int n: nums){
            freqMap.put(n, freqMap.getOrDefault(n, 0) + 1);
        }

        List<Integer>[] bucket = new List[nums.length + 1]; 
        
        for(int i = 0; i < bucket.length; i++){
        bucket[i] = new ArrayList<>();
        }

        for(int n: freqMap.keySet()){
        int v = freqMap.get(n);
        bucket[v].add(n);
        }

        int[] returnArr = new int[k];

        int counter = 0;

        for(int i = bucket.length - 1; i > 0 && counter < k; i--){
            for(int num: bucket[i]){
                returnArr[counter++] = num;
                if(counter == k){
                    break;
                }
            }

        }

        return returnArr;

        
    }
}
