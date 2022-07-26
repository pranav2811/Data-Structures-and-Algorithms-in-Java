//capacity is the maximum no of items that the list can hold before it has to be resized
//size is the no of items that are actually in the list
import java.util.*;
class Employee{
    private String firstName;
    private String lastName;
    private int id;

    public Employee(String firstName, String lastName, int id){
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

public class arrayLists {
    public static void main(String[] args){
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));

        // employeeList.forEach(employee -> System.out.println(employee));//lambda expression

        System.out.println(employeeList.get(1));//an array is backing the list so a random access like this is done in constant time

        System.out.println(employeeList.isEmpty());

        employeeList.set(1, new Employee("John", "Adams", 4568));//replace the employee at index 1 with a new employee

        // employeeList.forEach(employee->System.out.println(employee));

        System.out.println(employeeList.size());
        //the add method can also be used to add at a specific position

        employeeList.add(3, new Employee("John", "Doe", 4567));

        // employeeList.forEach(Employee->System.out.println(employee));//Since values now need to be shifted up so the worst case will be O(n)
        //to get the backing array

        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);//this will create an array of the same size as the list   and then copy the values into the array
        //the size will return how many employees we have actually added

        for(Employee employee : employeeArray){
            System.out.println(employee);
        }

        System.out.println(employeeList.contains(new Employee("Mary", "Smith", 22)));//this will return true if the list contains the employee we are looking for
        //they are structurally the same, but we have to implement the equals method in the employee class so that it can compare the individual fiels against each other

        System.out.println(employeeList.indexOf(new Employee("John", "Doe", 4567)));//this will return the index of the employee we are looking for

        //to remove items from the list

        employeeList.remove(2);
        employeeList.forEach(employee->System.out.println(employee));//after removing elements need to be shifted down one postion so the worst case will be O(n)
    }
}
