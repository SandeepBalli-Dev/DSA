
class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListStack {

    private Node top;

    public LinkedListStack() {
        top = null;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (isEmpty()) {
            System.err.println("Stack is Empty");
            return -1;
        }
        int removedValue = top.data;
        top = top.next;
        return removedValue;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    public void display() {
        Node curr = top;
        System.out.print("Stack: ");
        while (curr != null) {
            System.err.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display(); // Stack: 30 20 10

        System.out.println("Top element: " + stack.peek()); // 30
        System.out.println("Popped: " + stack.pop());       // 30

        stack.display(); // Stack: 20 10
    }

}
