class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }
}

public class LinkedList {

    private Node head;

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        
        Node currNode = head;
        while(currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtAGivenPosition(int data, int position) {
        Node newNode = new Node(data);
        Node currNode = head;

        if(position == 1) {
            insertAtBeginning(data);
            return;
        }

        int count = 1;
        while(currNode != null && count < position - 1) {
            currNode = currNode.next;
            count++;
        }
        if(currNode == null) {
            System.err.println("Position out of bound");
            return;
        }
        Node nextNode = currNode.next;
        currNode.next = newNode;
        newNode.next = nextNode;

    }

    public void printList() {
        Node currNode = head;
        while(currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(10);
        ll.insertAtEnd(20);
        ll.insertAtEnd(40);
        ll.insertAtEnd(50);
        System.out.println("Insert at End.");
        ll.printList();
        
        // System.out.println("");
        // ll.insertAtBeginning(0);
        // System.out.println("Insert at Beginning.");
        // ll.printList();

        System.out.println("");
        ll.insertAtAGivenPosition(30, 3);
        System.out.println("Insert at Given Position.");
        ll.printList();
        System.out.println("");
    }
}