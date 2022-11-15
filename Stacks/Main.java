package Stacks;

public class Main {
    public static void main(String[] args) {

        //using arrays
        Stack_arrays newStack = new Stack_arrays(4);
        boolean result = newStack.isEmpty();
        System.out.println(result);
        newStack.push(1);
        newStack.push(2);
        newStack.push(3);
        newStack.push(4);
        System.out.println(newStack.isFull());
        int popResult = newStack.pop();
        System.out.println(popResult);
        System.out.println(newStack.peek());


        //Using Linked List
        Stack_LinkedList myStack = new Stack_LinkedList();  
        myStack.push(0);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        boolean Result = myStack.isEmpty();
        System.out.println(Result);

        int deleted = myStack.pop();
        System.out.println(deleted);


    }
}
