package ds.Stack;

public class StackDataStructureImpl {


    public static void main(String[] args) {
    Stack s = new Stack();
    s.push(10);
    s.push(20);
    s.push(30);
    s.display();
    s.pop();
    s.display();
    System.out.println(s.peek());
        
    }
}

class Stack{

    int size = Integer.MIN_VALUE;
    int top = Integer.MIN_VALUE;
    int[] stack;


    Stack(){
        stack = new int[10];
        this.top = -1;
    }

    Stack(int size){
        stack = new int[size];
        this.top = -1;
    }

    public void push(int value){
        if(stack.length == top){
            System.out.println("stack is full");
            return;
        }else{
            stack[++top] = value;
        }
    }
    public void pop(){
        if(top==-1){
            System.out.println("Stack is full can't delete element ");
        }else{
            System.out.println("The values poped up from the stack is "+stack[top]);
            stack[top]=0;
            top--;
        }
        
    }
    public String peek(){
        return top==-1?null:"The value at the peek of ths stack is "+stack[top];
    }

    public void display(){
        System.out.println("Stack values are ");
        int temp = top;
        for(int i=temp;i>=0;i--){
            System.out.println(stack[i]);
        }
    }
}