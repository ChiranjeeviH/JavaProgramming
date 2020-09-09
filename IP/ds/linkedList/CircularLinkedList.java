package ds.linkedList;

public class CircularLinkedList {

    Node head = null;
    Node tail = null;
    
    class Node{
        int data;
        Node link;

        Node(int data){
            this.data=data;
            this.link=null;

        }

    }

    public static void main(String[] args) {
        
    }

    public void add(int data){
        Node node = new Node(data);
        if(null == head){
            head = node.link;
            head = node;
            tail = node.link;
        }
        head.link=node;
        
        

    }

}