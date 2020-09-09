package ds.linkedList;

/*
creation of linked list involves 3 steps
    1. Create a Head node and assign it to null
    2. Create a Tail Node and assign it to null
    3. Create a node which have data and connect to the head and tail
*/
public class SingleLinkedList {

     static Node head = null;
     static Node tail = null;

    public static void main(String[] args) {
        SingleLinkedList sll = new SingleLinkedList();
        sll.add(20);
        sll.add(30);
        sll.add(40);
        sll.traverse();
        sll.search(30);
        sll.search(50);
        sll.deleteFirstNode();
        System.out.println(head.data);
        System.out.println("After deleting the head node: ");
        sll.traverse();
        sll.deleteFirstNode();
        System.out.println("Final elements in the linked list ");
        sll.traverse();
        sll.deleteFirstNode();
        System.out.println("Final elements in the linked list1 ");
        sll.traverse();
        sll.add(45);
        sll.add(65);
        sll.add(80);
        sll.traverse();

        
    }

    public void add(int value){
        Node node = new Node(value);
        if(head == null){
            node.link = head;
            head=node;
            node.link = tail;
            tail=node;
        }else{
            tail.link = node;
            tail = node;
        }
    }
    public void traverse(){
        if( null == head){
            System.out.println("Linked List doesn't exist");
        }
        else{
            Node peek = head;
            while(peek.link!=null){
                System.out.println(peek.data);
                peek = peek.link;
            }
            System.out.println(tail.data);
        }
        
    }

    public void search(int data){
        boolean  flag = false;
        if(head == null){
            System.out.println("Linked list is not exist");
        }
        else if(data == tail.data || data == head.data){
            flag = true;
        }
        else{
            Node peek = head;
            while(peek.link!=null){
                if(data == peek.data){
                    flag= true;
                    break;
                }
                peek = peek.link;
            
            }
        }
        if(flag){
            System.out.println("Element found");
        }
        else{
            System.out.println("Element not found");
        }
    }

    public void deleteFirstNode(){
       
        if(null == head){
            System.out.println("No elements found to delete");
        }
        else if(head.link!=null){
            Node temp = head.link;
            head=null;
            head = temp.link;
            head = temp;
        }
        else{
            head = null;
            tail = null;
            System.out.println("Linked list becomes null");
        }
    }

    public void deleteEndElement(){

    }


}

class Node{
    int data;
    Node link;

    Node(int data){
        this.data = data;
        this.link = null;
    }
}