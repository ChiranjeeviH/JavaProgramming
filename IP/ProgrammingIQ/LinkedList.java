package ProgrammingIQ;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

public class LinkedList {

    Node head;

    class Node{
        Object data;
        Node next;
        Node(Object data){
            this.data = data;
            this.next = null;
        }
    }

    public void add(Object data){
        Node new_node = new Node(data);
        if(null == head){
            new_node.next = head;
            head = new_node;
        }else{
            Node temp = head;
            while(null!=temp.next){
                temp = temp.next;
            }
            temp.next = new_node;
        }
    }
    public void addAll(Collection<Object> c){
        for(Object c1:c){
            add(c1);
        }
    }

    public boolean isLinkedListSorted(Collection<Object> c){
        //first add those elements into Linked List
        addAll(c);
        if(null!=head){
            Node temp = head;
            Node temp1 = temp.next;
            while(null!=temp1){
                if((Integer) temp.data > (Integer) temp1.data){
                    System.out.println("temp value "+temp.data + " temp1 value "+temp1.data);
                    return false;
                }
                temp = temp.next;
                temp1 = temp1.next;
            }
        }else{
            System.out.println("Linked list is empty");
        }
        return true;

    }

    public void display(){
        List<Object> values = new ArrayList<>();
        if(null==head){
            System.out.println("Linked list is empty");
        }else{
            Node temp = head;
            while(null!=temp){
                values.add(temp.data);
                temp = temp.next;
            }
        }
        System.out.println("Linked list values are "+values.toString());
    }

    public void revereseLinkedList(){
        
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // ll.add(12);
        // ll.add(13);
        // ll.add(14);
        // ll.add(15);
        // ll.add("Chiru");
        // ll.addAll(Arrays.asList(2,3,4,5));
        Boolean result = ll.isLinkedListSorted(Arrays.asList(2,3,4,5,6,7,8));
        ll.display();
        System.out.println(result);
    }
    
}