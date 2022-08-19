
import java.util.NoSuchElementException;

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
        if (size() == queue.length - 1) {// this doesnt mean that the queue is going to be full as theres going to be
                                         // empty space in the front
            int numItems = size();
            Employee[] newArray = new Employee[2 * queue.length];
            System.arraycopy(queue, front, newArray, 0, queue.length - front);
            System.arraycopy(queue, 0, newArray, queue.length - front, back);

            queue = newArray;

            // now we need to set the front and the back fields
            front = 0;
            back = numItems;// we cant just call size()because back is still set to the old back value and
                            // that is why we had to save size earlier

        }

        // once we are sure that hte back firled is not going to point ot an invalid
        // index
        // we just go ahead and assign the new employee to back

        queue[back] = employee;
        if (back < queue.length - 1) {
            back++;
        } else {
            back = 0;
        }

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
        } else if (front == queue.length) {
            front = 0;
        }

        return employee;
    }

    public Employee peek() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }
        return queue[front];
    }

    public int size() {// as front can be larger than back we have to change the size method alo
        if (front <= back) {
            return back - front;
        } else {
            return back - front + queue.length;
        }
    }

    public void printQueue() {
        if (front <= back) {//because the queue hasnt wrapped
            for (int i = front; i < back; i++) {
                System.out.println(queue[i]);
            }
        }
        else{
            for (int i = front; i < queue.length; i++) {
                System.out.println(queue[i]);
            }
            for (int i = 0; i < back; i++){
                System.out.println(queue[i]);
            }

        }
    }
}
// THERES A LOT OF EMPTY SPACE IN THE ARRAY STILL WE ARE RESIZING THE ARRAY SO
// IN ORDER TO USE THE EMPTY SPACE AT THE FRONT OF THE ARRAY IF WE WRAP THE BACK
// OF THE QUEUE TO THE FRONT OF THE ARRAY

public class L6_1_CircularQueue {
    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        ArrayQueue queue = new ArrayQueue(5);

        queue.add(janeJones);
        queue.add(johnDoe);
        queue.remove();
        queue.add(marySmith);
        queue.remove();
        queue.add(mikeWilson);
        queue.remove();
        queue.add(billEnd);
        queue.remove();
        queue.add(janeJones);

        queue.printQueue();

    }
}
