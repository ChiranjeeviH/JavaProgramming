package ProgrammingIQ;

public class ReverseLinkedList {

    Node head;

    class Node{
        int data;
        Node link;

        public Node(int newNodedata){
            this.data = newNodedata;
            this.link = null;
        }
    }

    public boolean add(int data){
        addLast(data);

        return true;

    }

    private void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head.link = newNode;
            head = newNode;
        }else{
            Node temp = head;
            while(temp!=null){
                temp = temp.link;
            }
            temp = newNode;
        }
    }

    public void display(){
        if(head == null){
            System.out.println("Linked list is empty");
        }else{
            Node temp = head;
            while(temp!=null){
                
            }
        }
    }
    
}