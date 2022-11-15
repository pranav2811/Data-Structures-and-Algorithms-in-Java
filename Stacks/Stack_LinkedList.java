package Stacks;

public class Stack_LinkedList {
    LinkedList linkedList;

    public Stack_LinkedList() {
        linkedList = new LinkedList();
    }

    // Push Method
    public void push(int value) {// O(1) time and spacecomplexity
        linkedList.insertInLinkedList(value, 0);
        System.out.println("Inserted " + value + " in Stack");
    }

    // isEmpty
    public boolean isEmpty() {// O(1) time and space complexity
        if (linkedList.head == null) {// O(1) time and space complexity
            System.out.println("The stack is empty");
            return true;// O(1) time and space complexity
        } else {// O(1) time and space complexity
            System.out.println("The stack is not empty");
            return false;
        }
    }

    // POP
    public int pop() {// space and time is o(1)
        int result = -1;// O(1)
        if (isEmpty()) {// O(1)
            System.out.println("The stack is empty");
        } else {// O(1)
            result = linkedList.head.value;// O(1)
            linkedList.deletionOfNode(0);// O(1) SINCE WE ARE DELETING FROM END
        }
        return result;// O(1)
    }

    // Peek
    public void peek() {//space and time complexity is O(1)
        if (isEmpty()) {// O(1)
            System.out.println("The stack is empty");
        } else {// O(1)
            System.out.println(linkedList.head.value);
        }
    }

    public void delete(){//time and space complexity is O(1)
        linkedList.head = null;//deleting simply means setting the head to nul as then all subsequent nodes will return garbarge value
        System.out.println("The stackk is successfully deleted");
    }
}
