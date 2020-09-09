package ds.linkedList;

public class DoubleLinkedList {

    static Node head;

    class Node{
        int data;
        Node previous;
        Node next;

        Node(int data){
            this.data = data;
            this.previous = null;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        new DoubleLinkedList().add(1);
        new DoubleLinkedList().add(2);
        new DoubleLinkedList().add(3);
        new DoubleLinkedList().add(4);
        new DoubleLinkedList().add(5);
        new DoubleLinkedList().addFirst(0);
        new DoubleLinkedList().display();
        System.out.println("Now linked list is in reverse order ");
        new DoubleLinkedList().printReverse(head);
    }


    public void add(int data){
        if(isEmpty()){
            Node firstNode = new Node(data);
            head = firstNode.previous;
            head = firstNode;
            
        }
        else{
            Node temp = head;
            Node newNode = new Node(data);
            while(null!=temp.next){
                temp = temp.next;
            }
            temp.previous = newNode;
            temp.next = newNode;


        }
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Double linked list is empty");
        }
        else{
            Node temp = head;
            while(null!=temp.next){
                System.out.println(temp.data);
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
    }

    public Boolean isEmpty(){
        return null==head?Boolean.TRUE:Boolean.FALSE;
    }
    public void firstNodeCreation(int node){
        Node firstNode = new Node(node);
        head = firstNode.previous;
        head = firstNode;
    }

    public void addLast(int data){
        if(isEmpty()){
            firstNodeCreation(data);
        }
        else{
            Node temp = head;
            Node new_node = new Node(data);
            while(null!=temp.next){
                temp = temp.next;
            }
            //temp.next = new_node.previous;
            temp.next = new_node;

        }
    }

    public void addFirst(int data){
        if(isEmpty()){
            firstNodeCreation(data);
        }
        else{
            Node temp = head;
            Node newNode = new Node(data);
            head = newNode.previous;
            head = newNode;
            head.next = temp;

        }
    }

    public void printReverse(Node headNode){
        
       if(headNode == null) return ;
       printReverse(headNode.next);
       System.out.println(headNode.data + " ");

    }


}