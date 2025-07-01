
class ArrayQueue {

    private int[] queue;
    private int front, rear, capacity, size;

    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        size = 0;
        front = 0;
        rear = -1;
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is Full");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = value;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int removedValue = queue[front];
        front = (front + 1) % capacity;
        size--;
        return removedValue;

    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return queue[front];
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayQueue q = new ArrayQueue(3);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.display();

        System.out.println("Dequeued: " + q.dequeue());
        q.enqueue(50);
        q.enqueue(60); // Should show "Queue is full" if full
        q.display();

        System.out.println("Front element: " + q.peek());
        System.out.println("Queue size: " + q.size());
    }
}
