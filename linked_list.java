import java.io.*;

class linked_list {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
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


    public static void main(String args[]) {
        linked_list list = new linked_list();

        list.addFirt("an");
        list.addFirt("is");
        list.addFirt("Dog");
        list.printList();

        list.addLast("Animal");
        list.printList();

        list.addFirt("The");
        list.printList();
    }
}
