
class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

class LinkedList {

    private Node head;

    public void traverseList() {
        Node temp = head;
        while (temp != null) {
            System.out.println("Value: " + temp.data);
            temp = temp.next;
        }
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int data) {
        Node endNode = new Node(data);
        endNode.next = null;

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = endNode;
    }

    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        Node temp = head;

        int count = 1;
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        while (temp != null && count < position - 1) {
            temp = temp.next;
            count++;
        }
        if (temp == null) {
            System.out.println("Position exceeded list size");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Insert at beginning
        list.insertAtBeginning(30);
        list.insertAtBeginning(20);
        list.insertAtBeginning(10); 

        list.insertAtEnd(50);
        list.insertAtPosition(40, 4);
        list.traverseList();

    }
}
