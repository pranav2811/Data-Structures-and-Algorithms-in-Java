
//it is an abstract data type
//provides access to data using keys
//key doesnt have to be an integer
//consists of a collection of key-value pairs and the keys and values dont have to be of the same data type
//in java the hash function is Object.hashCode()
//collision happend when more than one value has the same hashed value

//load factor tells us how full a hash table is
//load factor = #of items/capacity = size/capacity
//load factor is used to decide when to resize the array backing the hash table
//dont want the lf to be too low as it means lots of empty space
//dont want lf to be too high as it will increase the likelyhood of a collision
//can play a role in determining the time complexity of retrieval
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

class SimpleHashtable{

    private Employee[] hashTable;

    public SimpleHashtable(){
        hashTable = new Employee[10];

    }

    //function to add values to the hashTable

    public void put(String key, Employee employee){
        //hashing the key

        int hashedKey = hashKey(key);//this will give us the index in the array
        if (hashTable [hashedKey] != null){
            System.out.println("Sorry! theres already an employee at position " + hashedKey);
        }
        else{
            hashTable[hashedKey] = employee;
        }

    }

    //method for retrieving values from the hashtable

    public Employee get(String key){
        int hashedKey = hashKey(key);
        return hashTable[hashedKey];//retrieval is constant time as it is array access
    }

    //hashing function
    private int hashKey(String key){
        return key.length() % hashTable.length;//to get indices in the range 0 to 9
        //key and the hashed value are not the same thing.... the key is hashed to a hashed value
        
    }

    public void printHashtable(){
        for (int i = 0; i < hashTable.length; i++){
            System.out.println(hashTable[i]);
        }
    }
}
 
public class L7_1_Hashtables {

    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        SimpleHashtable ht = new SimpleHashtable();
        ht.put("Jones", janeJones);
        ht.put("Doe", johnDoe);
        ht.put("Wilson", mikeWilson);
        ht.put("Smith", marySmith);
        ht.put("End", billEnd);

        ht.printHashtable();

    }

}
