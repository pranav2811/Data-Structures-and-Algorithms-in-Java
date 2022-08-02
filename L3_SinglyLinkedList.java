
//arrays are not involved
//each item is aware of other items, i.e they know which item comes after them
//so each items stores an integer value as well as the reference to the next integer in the list

//each item in the list is called a node
//the first item in the list is the head of the list
//the last item always points to null
//if you have a refernce to the head then you can traverse the entire list
//we always insert elements at the front of the list as we only store the reference to the first element and this is done in constant time complexity
//To delete an element from the list we need to find the element and then replace it with the next element in the list
//as long as you are inserting and deleting from the front of the list it is done in constant time complexity
//con - have to store an extra field and thus use a lot more memory than arrays

class Employee {
    private String firstName;
    private String lastName;
    private int id;

    public Employee(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee [firstName=" + firstName + ", id=" + id + ", lastName=" + lastName + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
        result = prime * result + id;
        result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (firstName == null) {
            if (other.firstName != null)
                return false;
        } else if (!firstName.equals(other.firstName))
            return false;
        if (id != other.id)
            return false;
        if (lastName == null) {
            if (other.lastName != null)
                return false;
        } else if (!lastName.equals(other.lastName))
            return false;
        return true;
    }

}

class EmployeeNode {

    private Employee employee;
    private EmployeeNode next;

    public EmployeeNode(Employee employee) {// the constructor only takes employee because we dont know what the next node will be 
                                           
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }

    public String toString(){
        return employee.toString();
    }

}

class EmployeeLinkedList {

    private EmployeeNode head;
    // for the best performance we should add items to the beginning
    private int size;

    public void addtoFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);// first we create a new node
        node.setNext(head);//we are inserting the node right at the front of the list
        head = node;//we point the head to the node we just created
        size++;
    }

    public EmployeeNode removeFromFont(){
        if(isEmpty()){
            return null;
        }

        EmployeeNode removedNode = head;
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

public class L3_SinglyLinkedList {
    public static void main(String[] args) {
        

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        EmployeeLinkedList list = new EmployeeLinkedList();

        System.out.println(list.isEmpty());

        list.addtoFront(janeJones);
        list.addtoFront(johnDoe);
        list.addtoFront(marySmith);
        list.addtoFront(mikeWilson);

        

        list.printList();


        list.removeFromFont();
        System.out.println(list.getSize());
        list.printList();

    }
}
