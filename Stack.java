package Others;

/**
 * Created by isuru on 10/26/2016.
 */
public class Stack {

    private int maxSize;
    private double[] stackArray;
    private int top;

    public Stack(int s){
        maxSize = s;
        stackArray = new double[maxSize];
        top = -1;   //no items yet
    }

    public void push(double j){
        if(isFull()){
            System.out.println("stack is full, cannot insert");
        }
        else
            stackArray[++top] = j;
    }

    public double pop(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return -1;
        }
        else
            return stackArray[top--];
    }

    public double peek()
    {
        if(top == -1){
            System.out.println("stack is empty");
            return -1;
        }
        else
            return stackArray[top];
    }

    public boolean isEmpty(){
        if(top == -1)
            return true;
        else
            return false;
    }

    public boolean isFull(){
        if(top == maxSize)
            return true;
        else
            return false;
    }
}
