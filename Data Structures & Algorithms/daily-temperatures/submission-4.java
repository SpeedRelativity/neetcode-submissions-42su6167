class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int[] result = new int[temperatures.length];

        for(int i = 0; i < result.length; i++){
            result[i] = 0;
        }

        Deque<Integer> stack = new ArrayDeque<>();

        for(int i = 0; i < temperatures.length; i++){
            
            if(stack.isEmpty()){
                stack.push(i);
            }
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                int j = stack.pop();
                result[j] = i - j;
            }
            stack.push(i);
        }

        return result;
        
    }
}
