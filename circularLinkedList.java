public class circularLinkedList {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void add(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;
            newNode.next = head;
        }

        else{
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    public void printList(){
        Node currNode = head;
        if(head == null){
            System.out.println("List is empty");
        }
        else{
            System.out.println("Nodes of circular linked list: ");
            do{
                System.out.println(" " + currNode.data);
                currNode = currNode.next;
            }
            while(currNode != head);
            System.out.println();
        }
    }

    //reverse 
    public void reverse(Node currNode){
        if(currNode.next == head){
            System.out.println(" " + currNode.data);
            return;
        }

        reverse(currNode.next);
        System.out.println(" " + currNode.data);
    }

    public static void main(String[] args) {
        circularLinkedList list = new circularLinkedList();
        list.add(1);
        list.add(2);
    list.add(3);
    list.add(4);

    list.printList();

    list.reverse(list.head);
    }
}