package SingleLinkedLists;

//arrays are not involved
//each item is aware of other items, i.e they know which item comes after them
//so each items stores an integer value as well as the reference to the next integer in the list

//each item in the list is called a node and each item is aware of the next item in the list as each item contains a link to the next item
//the first item in the list is the head of the list and the head will ahve a reference to the next item in the list
//the last item always points to null
//if you have a refernce to the head then you can traverse the entire list
//we always insert elements at the front of the list as we only store the reference to the first element and this is done in constant time complexity
//To delete an element from the list we need to find the element and then replace it with the next element in the list
//as long as you are inserting and deleting from the front of the list it is done in constant time complexity
//con - have to store an extra field and thus use a lot more memory than arrays



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
