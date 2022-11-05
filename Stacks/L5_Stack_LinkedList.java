package Stacks;
import java.util.LinkedList;
import java.util.ListIterator;


//java docs suggest that instead of using the array class we should use a class that uses the deque interface
class LinkedStack{

    private LinkedList<Employee> stack;

    public LinkedStack(){
        stack = new LinkedList<Employee>();//For stack you dont need a doublyLinkedList as you are always workign with thte item at the front of the array but memory is not an issue so we can go ahead
    }

    public void push(Employee employeee){
        stack.push(employeee);
    }

    public Employee pop(){
        return stack.pop();
    }
    
    public Employee peek(){
        return stack.peek();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public void printStack(){
        ListIterator<Employee> iterator = stack.listIterator();
        while(iterator.hasNext()){//this iteratorlist traverses from head to tail
            System.out.println(iterator.next());
        }
    }
}

public class L5_Stack_LinkedList {
    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);
        
        LinkedStack stack = new LinkedStack();

        stack.push(janeJones);
        stack.push(johnDoe);
        stack.push(marySmith);
        stack.push(mikeWilson);
        stack.push(billEnd);

        stack.printStack();
        
        System.out.println(stack.peek());
        stack.printStack();

        System.out.println("Popped: " + stack.pop());
        System.out.println(stack.peek());

        
    }
}
