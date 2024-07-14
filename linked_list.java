import java.io.*;

class linked_list {
    Node head;

    private int size;

    linked_list() {    //constructor
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    //add   first
    public void addFirt(String data) {
        Node newNode = new Node(data);
        if(head==null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    //add last
    public void addLast(String data) {
        Node newNode = new Node(data);
        if(head==null) {
            head = newNode;
            return;
        }

        Node currentNode = head;
        while(currentNode.next != null) {
            currentNode = currentNode.next;
        }

        currentNode.next = newNode;
    }

    //print list
    public void printList() {
        if(head==null) {
            System.out.println("List is empty");
            return;
        }

        Node currentNode = head;
        while(currentNode != null) {
            System.out.print(currentNode.data + "-->");
            currentNode = currentNode.next;
        }
        System.out.println("Null");
    }
    
    //delete at first
    public void deleteFirst() {
        if(head==null) {
            System.out.println("The list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    //delete at last
    public void deleteLast() {
        if(head==null) {
            System.out.println("The list is empty");
            return;
        }

        size--;

        if(head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;  //head.nect = null -> lastNode = null

        while(lastNode.next != null) { //null.next gives error
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }

    public int getSize() {
        return size;
    }

    // reverse linked-list through iterative
    public void reverseIterate() {
        if(head==null || head.next==null) {
            return;
        }

        Node prevNode = head;
        Node currentNode = head.next;

        while(currentNode != null) {
            Node nextNode = currentNode.next;
            currentNode.next = prevNode;

            //update
            prevNode = currentNode;
            currentNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    //reverse linked-list through recursive manner
    public Node reverseRecursive(Node head) {
        if(head==null || head.next==null) {
            return head;
        }

        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    public static void main(String args[]) {
        linked_list list = new linked_list();

        list.addFirt("an");
        list.addFirt("is");
        list.addFirt("Dog");
        list.printList();

        list.addLast("Animal");
        list.printList();

        // list.addFirt("The");
        list.printList();

        // list.deleteFirst();
        // list.printList();

        // list.deleteLast();
        // list.printList();

        // System.out.println("Size is: " + list.getSize());

        // list.addFirt("The");
        // list.printList();
        // System.out.println("Size is: " + list.getSize());

        // list.reverseIterate();
        // list.printList();

        list.head = list.reverseRecursive(list.head);
        list.printList();

    }
}
