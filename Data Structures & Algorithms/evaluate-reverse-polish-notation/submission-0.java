class Solution {
    public int evalRPN(String[] tokens) {
        int sum = 0;
        Stack<Integer> stack = new Stack<>();
        HashMap<String, Integer> operators = new HashMap<>();
        operators.put("+", 1);
        operators.put("-", 2);
        operators.put("*", 3);
        operators.put("/", 4);
        for (int i = 0; i < tokens.length; i++) {
            String  token = tokens[i];
            if(operators.containsKey(token)) {
                int second = stack.pop();
                int first = stack.pop();
                if(operators.get(token) == 1) {
                    stack.push(second+first);
                } else if(operators.get(token) == 2) {
                    stack.push(first-second);
                }else if(operators.get(token) == 3) {
                    stack.push(second*first);
                }else if(operators.get(token) == 4) {
                    stack.push(first/second);
                }
            }else{
                int num = Integer.valueOf(tokens[i]);
                stack.push(num);
            }
        }
        sum = stack.peek();
        return sum;
    }
}
