class Solution {
    public boolean isValid(String s) {
        String[] brackets = s.split("");
        if(brackets.length%2!=0) return false;
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Integer> openBrackets = new HashMap<>();
        openBrackets.put('[', 0);
        openBrackets.put('{', 1);
        openBrackets.put('(', 2);
        HashMap<Character, Integer> closeBrackets = new HashMap<>();
        closeBrackets.put(']', 0);
        closeBrackets.put('}', 1);
        closeBrackets.put(')', 2);
        int sum =0;
        for (int i = 0; i < brackets.length; i++) {
            char bracket = brackets[i].charAt(0);
            if(openBrackets.containsKey(bracket)){
                sum++;
                stack.push(bracket);
            }
            else{
                if(!stack.isEmpty()){
                    if(!Objects.equals(closeBrackets.get(bracket), openBrackets.get(stack.pop()))) return false;
                    else sum--;
                }else{
                    return false;
                }
            }
        }
        return sum==0;
    }
}
