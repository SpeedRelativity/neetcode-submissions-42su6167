class Solution {
    public int evalRPN(String[] tokens) {
         
         Deque<Integer> stack = new ArrayDeque<>();

         for(String i: tokens){
            if(i.equals("+") || i.equals("-") || i.equals("/") || i .equals("*")){
                int num2 = stack.pop(); // most recent
                int num1 = stack.pop(); // 2nd most recent
                if(i.equals("+") ){
                    stack.push(num1+num2);
                }
                else if(i.equals("-") ){
                    stack.push(num1-num2);
                }
                else if(i.equals("/") ){
                    stack.push(num1/num2);
                }
                else if(i.equals("*") ){
                    stack.push(num1*num2);
                }
            }
            else{
                int num = Integer.parseInt(i);
                stack.push(num);
            }

         }

         return stack.pop();
    }
}
