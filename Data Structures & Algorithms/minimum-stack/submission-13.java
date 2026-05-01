class MinStack {

    Stack<Long> stack;
    long mini;
    public MinStack() {
        stack = new Stack<>();
    }
    public void push(int val) {
        if(stack.isEmpty()){
            stack.push(0L);
            mini = val;
        }else{
            stack.push(val-mini);
            if(val<mini) mini = val;
        }
    }

    public void pop() {
        if (stack.isEmpty()) return;
        long peek = stack.peek();
        if(peek<0){
            mini = mini - peek;
        }
        stack.pop();
    }

    public int top() {
        long top = stack.peek();
        if(top>0){
            return (int) (top+mini);
        }else{
            return (int) mini;
        }
    }

    public int getMin() {
        return (int) mini;
    }
}
