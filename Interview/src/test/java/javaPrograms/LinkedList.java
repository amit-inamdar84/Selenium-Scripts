package javaPrograms;
//LinkedList can be represented as a class and a Node as a separate class. The LinkedList class contains a reference of Node class type.
//Every node in a linked list contains a data and address to next node. First node is called head and last node points to null.
public class LinkedList {
	Node head = null;//Head will be null initially as there are no nodes.
	static class Node {
        int value;//Data in the node
        Node next;//Pointer to next node.
    
        public Node(int value) {//Constructor to create a new node and insert data
            this.value = value;
        }
    }

    public void addAtFront(Node node) {//Method to add a node at the front. Accepts object of node class.
        node.next = head;//Make the next field in the node as null as this is the first node when this method is called first time.
                         //When second node object call this method, make the next field of this node object(node itself) as head.
        head = node;//Make new node as head as this is first node.
                    //Now as new node object is inserted at front it becomes first node. So make this node as head.
    }
    
    public void addAtEnd(Node node) {//Method to add at the end of linked list. Accepts node object as argument.
        if (head == null)//If this is the first node then head will be null.
            head = node;//Make this node as head.
        else {//If this is not first node
            Node ptr = head;//Create a new node object ptr and make it head
            while(ptr.next != null)//Traverse till end of list till we see a node that has next field as null. i.e. last node
                ptr = ptr.next;
            ptr.next = node;//When we see a node that has null make its next pointer to point to new node object.
        }
    }
    
    public void removeFront() {
        head = head.next;
    }

    public void print() {
        Node ptr = head;//Again create a new node object reference and point to head.
        while(ptr != null) {//While node object's reference variable ptr is not null
            System.out.print(ptr.value+" -> ");//Print the object's value by obj.reference.
            ptr = ptr.next;//Move pointer to next node.
        }
    }

    public static void main(String[] args) {
        LinkedList L = new LinkedList();//Create object of singly linked list
        L.addAtFront(new Node(1));//Call the method to add at the front of list and pass the object of node class initialized with 1 as data in the node.
        L.addAtFront(new Node(2));
        L.addAtFront(new Node(4));
        L.addAtFront(new Node(8));
        L.addAtEnd(new Node(5));//Last object of node class to be inserted at the end.
        L.print();
    }

}
