package SingleLinkedLists;

public class EmployeeLinkedList {

    private EmployeeNode head;
    // for the best performance we should add items to the beginning
    private int size;

    public void addtoFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);// first we create a new node
        node.setNext(head);//we are inserting the node right at the front of the list
        head = node;//we point the head to the node we just created
        size++;//this will always be O(1) as we are doing the same number of steps as we are always adding in the front
    }

    public EmployeeNode removeFromFont(){
        if(isEmpty()){
            return null;
        }

        EmployeeNode removedNode = head;//removing will also be O(1) as we are always removing from the front and performing the same number of steps
        head = head.getNext();
        //we now want the head field to point to whatever the next field is pointing to 
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }
    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return head == null;
    }

    public void printList() {
        EmployeeNode current = head;
        System.out.println("Head -> ");
        while (current != null) {
            System.out.print(current);
            System.out.println(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}