class StackArray {

    private int maxSize;
    private int[] stack;
    private int top;

    public StackArray(int maxSize) {
        this.maxSize = maxSize;
        stack = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full.");
        }
        top++;
        stack[top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        return stack[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public static void main(String[] args) {
        StackArray stack = new StackArray(6);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack Pop: " + stack.pop()); // 20
    }

}
