import java.util.NoSuchElementException;

//abstract data type
//fifo - first in first out
//add - enqueue add an item to the end of the queue
//remove - dequeue remove an item from the front of the queue
//peek get the item at the fron tog the queue but dont remove it 
//time complexity depends on what youre backing it with

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
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Employee employee = (Employee) o;

        if (id != employee.id)
            return false;
        if (!firstName.equals(employee.firstName))
            return false;
        return lastName.equals(employee.lastName);
    }

    @Override
    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + id;
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                '}';
    }

}

class ArrayQueue {

    private Employee[] queue;
    private int front;
    private int back;

    public ArrayQueue(int capacity) {
        queue = new Employee[capacity];
        // back is always pointing towards the next available spot in the array
        // the front field never changes as we always add items to the back
    }

    public void add(Employee employee) {
        if (back == queue.length) {// for resizing the array
            Employee[] newArray = new Employee[2 * queue.length];
            System.arraycopy(queue, 0, newArray, 0, queue.length);
            queue = newArray;

        }

        // once we are sure that hte back firled is not going to point ot an invalid
        // index
        // we just go ahead and assign the new employee to back

        queue[back] = employee;
        back++;

    }

    // removing an element from the queue

    public Employee remove() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        Employee employee = queue[front];
        queue[front] = null;
        front++;
        if (size() == 0) {
            front = 0;
            back = 0;
        }

        return employee;
    }
    public Employee peek(){
        if (size() == 0){
            throw new NoSuchElementException();
        }
        return queue[front];
    }

    public int size() {
        return back - front;// front - back gives us the size of the queue
    }

    public void printQueue(){
        for (int i = front; i < back; i++){
            System.out.println(queue[i]);
        }
    }
}

public class L6_Queues {
    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        ArrayQueue queue = new ArrayQueue(10);
        queue.add(janeJones);
        queue.add(johnDoe);
        queue.add(marySmith);
        queue.add(mikeWilson);
        queue.add(billEnd);

        

        queue.remove();
        queue.remove();
        // queue.printQueue();

       System.out.println(queue.peek());
       queue.printQueue();
    }
}