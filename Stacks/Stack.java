package Stacks;

public class Stack{

    //using array

    int[] arr;
    int topOfStack;//variable at the top of the stack

    public Stack(int size){
        this.arr = new int[size];//constant time complexity
        this.topOfStack = -1;//since the stack is empty right now - constant time complexity
        System.out.println("This stack is created with size of : "+ size);//constant time complexity
        //Creation of time complexity is O(1) and space complexity is O(n) as it is allocating n number of cells in the memory
    }

    //isEmpty
    public boolean isEmpty(){//time complexity is O(1) and space is also O(1) as no operation consuming space is being perfomed over here
        if(topOfStack == -1){
            return true;
        }
        else{
            return false;
        }
    }

    //isFull

    public boolean isFull(){
        if(topOfStack == arr.length - 1){
            System.out.println("The stack is full");
            return false;
        }
        else{
            return true;
        }
    }
    //Push
    public void push(int value){//Since everything within is O(1) therefore the total time and space complexity is O(1)
        if(isFull()){//O(1)
            System.out.println("The stack is full");
        }
        else{
            arr[topOfStack + 1] = value;//O(1)
            topOfStack++;
            System.out.println("The value is successfully inserted");

        }
    }
    
    //Pop
    public int pop(){//space and time complexity is O(1)
        if(isEmpty()){
            System.out.println("The stakc is empty");
            return -1;
        }
        else{
            int topStack = arr[topOfStack];
            topOfStack--;
            return topStack;
        }
    }
    
    public int peek(){//sapce and time complexity is O(1)
        if(isEmpty()){
            System.out.println("The stack is empty");
            return -1;
        }
        else{
            return arr[topOfStack];
        }
    }
}