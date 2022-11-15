package Stacks;

public class Main {
    public static void main(String[] args) {
        Stack newStack = new Stack(4);
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
    }
}
