package ds.linkedList;

public class LinkedListImplementationSll {


    class  Node{
        int data;
        Node next;
    
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    public static void main(String args[]){
        LinkedListImplementationSll sll = new LinkedListImplementationSll();
        sll.add(1);
        sll.add(2);
        sll.add(3);
        sll.add(4);
        sll.add(5);
        sll.add(6);
        sll.addLast(7);
        sll.addFirst(0);
        sll.display();
    }

    public void add(int data){
        Node new_node = new Node(data);
        if(null == head){
            head = new_node;
        }else{
            Node next_node = head;
            while(null!=next_node.next){
                next_node = next_node.next;
            }
            next_node.next = new_node;
            next_node=new_node;
            
        }

    }

    public void display(){
        if(null==head){
            System.out.println("Linked list is null");
        }else{
            Node currentNode = head;
            while(null!=currentNode.next){
                System.out.println(currentNode.data);
                currentNode = currentNode.next;
            }
            System.out.println(currentNode.data);
        }
    }

    public void addLast(int data){
        if(isEmpty()){
            head = new Node(data);
        }
        else{
            Node temp = head;
            Node lastNode = new Node(data);
            while(null!=temp.next){
                temp = temp.next;
            }
            temp.next = lastNode;
            temp = lastNode;
        }
        
    }

    public boolean isEmpty(){
        return null == head?true:false;
    }
    public void addFirstElement(int data){
        head = new Node(data);
    }

    public void addFirst(int data){
        if(isEmpty()){
            addFirst(data);
        }else{
            Node temp = head;
            Node newFirst = new Node(data);
            head = newFirst;
            head.next = temp; 
        }
    }

}