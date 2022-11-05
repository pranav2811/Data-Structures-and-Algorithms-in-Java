package SingleLinkedLists;
import java.util.Iterator;
import java.util.LinkedList;

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
