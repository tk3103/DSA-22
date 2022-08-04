public class Akash_stack_array
{
	public static void main(String[] args) {
	    MyStack s=new MyStack(8);
	    s.push(1);
	    s.push(2);
	    s.push(45);
	    s.push(90);
	    s.pop();
	    s.push(60);
	    s.peek();
	    s.display();
	    
		//System.out.println("Hello World");
	}
}
class MyStack{
    private int top=-1;
    private int[] stack;
    private int size;
    public MyStack(int size){
        this.size=size;
        stack=new int[size];
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public boolean isFull(){
        return top==size-1;
    }
    public void push(int element){
        if(isFull()){
            System.out.println("stackoverflow");
        }
        this.stack[++top]=element;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("stack is empty");
        }
        return stack[top--];
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("stack is empty");
        }
        return stack[top];
    }
    public void display() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
        }
        for(int i=top;i>=0;i--) {
            System.out.print(stack[i]+" ");
        }
        System.out.println();
    }
    
}