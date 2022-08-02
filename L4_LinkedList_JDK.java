import java.util.Iterator;
import java.util.LinkedList;

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
public class L4_LinkedList_JDK {
    public static void main(String[] args) {
            Employee janeJones = new Employee("Jane", "Jones", 123);
            Employee johnDoe = new Employee("John", "Doe", 4567);
            Employee marySmith = new Employee("Mary", "Smith", 22);
            Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
            Employee billEnd = new Employee("Bill", "End", 78);

            LinkedList<Employee> list = new LinkedList<>();
            list.addFirst(janeJones);
            list.add(johnDoe);
            list.addFirst(marySmith);
            list.addFirst(mikeWilson);


            Iterator<Employee> iter = list.iterator();
            System.out.println("HEAD ->");

            while (iter.hasNext()) {
                System.out.println(iter.next());
                System.out.println("<=>");
            }
            System.out.println("null");

            list.add(billEnd);//add method adds an item to the end of the list that is to the tail, addLast method can also be used
            iter = list.iterator();
            System.out.println("HEAD ->");

            while (iter.hasNext()) {
                System.out.println(iter.next());
                System.out.println("<=>");
            }
            System.out.println("null");

            list.removeFirst();//removes the first item from the list
            
            iter = list.iterator();
            System.out.println("HEAD ->");

            while (iter.hasNext()) {
                System.out.println(iter.next());
                System.out.println("<=>");
            }
            System.out.println("null");

            list.removeLast();//removes the last item from the list
            iter = list.iterator();
            System.out.println("HEAD ->");

            while (iter.hasNext()) {
                System.out.println(iter.next());
                System.out.println("<=>");
            }
            System.out.println("null");
            // for (Employee employee : list) {
            //     System.out.println(employee);
            // }
    }
}
