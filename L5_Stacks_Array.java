import java.util.EmptyStackException;

//instead of dictating how we store the items stacks dictate what operations we can do on them
//LIFO - last in first out i.e there is no random access
//abstract data type
//ideal backing data structure : linked list
//we can perform three operations - push(add), pop(remove) and peek(get the top item)
//O(1) - for push pop and peek when using a linked list
//O(n) - for push pop and peek when using an array because the array may have been resized
//if you know the max number of items that will be on the stack then the array is a good choice
//if memory is tight then array is a good choice
//Linked list is ideal
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
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (id != employee.id) return false;
        if (!firstName.equals(employee.firstName)) return false;
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
class ArrayStack{
    //we are going to need a field for array thats going to back the stack
    private Employee[] stack;
    private int top;

    public ArrayStack(int capacity){
        stack = new Employee[capacity];


    }

    public void push(Employee employee){
        if(top == stack.length){//then the next available position is the length of the array i.e out of bound
            //we need to resize the backing array
            Employee[] newArray = new Employee[2 * stack.length];
            System.arraycopy(stack, 0, newArray, 0, stack.length);;
            stack = newArray;

        }
        stack[top++] = employee;
    }

    public Employee pop(){//if we dont worry about worry about resizing the array then the pop operation will work in constant time
        //but if we want to be dilegent and worry about resizing then it will run in linear complexity
        if (isEmpty()){
            throw new EmptyStackException();
        }

        Employee employee = stack [--top];
        stack[top] = null;
        return employee;

    }

    public Employee peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return stack[top-1];//top contains the index however the element is present at top - 1
    }

    public int size(){
        return top;
    }

    public boolean isEmpty(){
        return top == 0;
    }

    public void printStack(){
        for (int i = top-1; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
}

    

public class L5_Stacks_Array {
    public static void main(String[] args) {
        
        //since we are using arrays, we need to provide an initial size
        ArrayStack stack = new ArrayStack(10);


        stack.push(new Employee("Jane", "Jones", 123));
        stack.push(new Employee("John", "Doe", 4567));
        stack.push(new Employee("Mary", "Smith", 22));
        stack.push(new Employee("BIll", "Wilson", 3245));
        stack.push(new Employee("Bill", "End", 78));


        System.out.println(stack.peek());
        stack.printStack();

        System.out.println("Popped: " + stack.pop());

        
    }
}
