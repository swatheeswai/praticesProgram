class LinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null; // Initialize next to null
        }
    }

    public void insertAtBeginning(int val) {
        Node newNode = new Node(val);
        newNode.next = head; // Link newNode to head
        head = newNode; // Update head to newNode
    }

    public void traverse() {
        Node temp = head;
        while (temp != null) { // Traverse until temp is null
            System.out.print(temp.data + " "); // Print the data
            temp = temp.next; // Move to the next node
        }
    }

    public void insertAtPos(int val, int pos) {
        if (pos == 0) {
            insertAtBeginning(val);
            return;
        }
        Node newNode = new Node(val);
        Node temp = head;
        for (int i = 1; i < pos; i++) {
            if (temp == null) {
                throw new IndexOutOfBoundsException("Position out of bounds");
            }
            temp = temp.next; // Move to the next node
        }
        newNode.next = temp.next; // Link newNode to the next node
        temp.next = newNode; // Link previous node to newNode
    }

    public void deleteAtPos(int pos) {
        if (head == null) {
            throw new IndexOutOfBoundsException("Deletion failed: list is empty");
        }
        if (pos == 0) {
            head = head.next; // Update head
            return;
        }
        Node temp = head;
        Node prev = null;
        for (int i = 0; i < pos; i++) {
            if (temp == null) {
                throw new IndexOutOfBoundsException("Position out of bounds");
            }
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) {
            throw new IndexOutOfBoundsException("Position out of bounds");
        }
        prev.next = temp.next; // Link previous node to the next node
    }
    public int getIndex(int pos) {
    Node temp = head;
    for (int i = 0; i < pos; i++) { // Loop until the specified position
        if (temp == null) { // Check if temp is null to prevent NullPointerException
            throw new IndexOutOfBoundsException("Position out of bounds");
        }
        temp = temp.next; // Move to the next node
    }
    if (temp != null) {
        return temp.data; // Return the data at the specified position
    } else {
        throw new IndexOutOfBoundsException("Position out of bounds");
    }
}
}

class LinkedList_implementation{
    public static void main(String[] args) {
        LinkedList li = new LinkedList();
        li.insertAtBeginning(9);
        li.insertAtBeginning(2);
        li.insertAtBeginning(3);
        li.insertAtBeginning(5);
        li.traverse(); // Call traverse method
        System.out.println(); // Print a newline

        li.insertAtPos(7, 2); // Insert 7 at position 2
        li.traverse(); // Traverse again to see the change
        System.out.println(); // Print a newline

        li.deleteAtPos(1); // Delete at position 1
        li.traverse(); // Traverse again to see the change
        System.out.println(); // Print a newline
        
       System.out.println( li.getIndex(7));
        
    }
}

