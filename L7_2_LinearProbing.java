//this is used for handling collisions in hashtable
//open addresssing - if a collison occurs then we look for another position in the array - one of the ways to do so is linear probling
//when we discover that a position is already occupied we increment the hashed value by 1 and check the resulting index we keep doing that until we find an empty spot
//every increment to the index is called a probe
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

class StoredEmployee {// we have an employee array but we are storing only the employee so need to
                      // store the key as well in the array

    public String key;
    public Employee employee;

    public StoredEmployee(String key, Employee employee) {
        this.key = key;
        this.employee = employee;
    }

}

class SimpleHashtable {

    private StoredEmployee[] hashtable;

    public SimpleHashtable() {
        hashtable = new StoredEmployee[10];
    }

    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);
        if (occupied(hashedKey)) {
            // first well set a stop index and that index will be equal to the hashed key as
            // if it the position is hit again that means we have looped around
            int stopIndex = hashedKey;
            if (hashedKey == hashtable.length - 1) {
                hashedKey = 0;// this sets the first probe position
            } else {
                hashedKey++;
            }

            while (occupied(hashedKey) && hashedKey != stopIndex) {
                hashedKey = (hashedKey + 1) % hashtable.length;// this set the next probe position and takes care of the
                                                               // wrapping
            }

        }
        if (occupied(hashedKey)) {
            System.out.println("Sorry, there's already an employee at position " + hashedKey);
        } else {
            hashtable[hashedKey] = new StoredEmployee(key, employee);
        }

    }

    public Employee get(String key) {
        int hashedKey = findKey(key);
        if(hashedKey == -1){
            return null;
        }
        return hashtable[hashedKey].employee;
    }

    public Employee remove(String key){
        //we have to use lienar probing as we need to find the employee we need to remove
        int hashedKey = findKey(key);
        if(hashedKey == -1){
            return null;//because there is no employee in the hashtable with the given key so theres nothing to remove
        }

        Employee employee = hashtable[hashedKey].employee;
        hashtable[hashedKey] = null;
        return employee;
    }

    private int hashKey(String key) {
        return key.length() % hashtable.length;
    }

    private int findKey(String key) {
        int hashedKey = hashKey(key);
        if (hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key)) {// we want to know fi the employee
                                                                                   // was added with the key we are
                                                                                   // interested in
            return hashedKey;
        }

        // if thats not the case we need to use linear probing to find the key
        if (occupied(hashedKey)) {
            // first well set a stop index and that index will be equal to the hashed key as
            // if it the position is hit again that means we have looped around
            int stopIndex = hashedKey;
            if (hashedKey == hashtable.length - 1) {
                hashedKey = 0;// this sets the first probe position
            } else {
                hashedKey++;
            }

            while (hashedKey != stopIndex && hashtable[hashedKey] != null && !hashtable[hashedKey].key.equals(key)) {
                hashedKey = (hashedKey + 1) % hashtable.length;// this set the next probe position and takes care of the
                                                               // wrapping
            }
            if (hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key)){
                return hashedKey;
            }
            else {
                return -1;//we will get nullpointer exception otherwise as it will assume thatif we are not finding the key we are dropping out
            }
            
        }
        return hashedKey;

    }

    private boolean occupied(int index) {
        return hashtable[index] != null;
    }

    public void printHashtable() {
        for (int i = 0; i < hashtable.length; i++) {
            if (hashtable[i] == null){
                System.out.println("empty");
            }
            else {
                System.out.println(hashtable[i].key + " " + hashtable[i].employee);
            }
            
        }
    }

}

public class L7_2_LinearProbing {
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

        ht.printHashtable();

        System.out.println("Retrieving employee for key = Doe: " + ht.get("Doe"));
        System.out.println("Retrieving employee for key = Smith: " + ht.get("Smith"));

        ht.remove("Wilson");
        ht.remove("Jones");
        ht.printHashtable();
    }
}
