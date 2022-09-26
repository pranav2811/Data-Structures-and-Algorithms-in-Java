
//rear + 1 = front - condition for full queue
//rear = (rear+1)%size - condition for circular queue for updating rear
public class queue_linkedlist {
    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }
    static class queue{

        static Node head = null;
        static Node tail = null;
        
        public static boolean isEmpty(){
            return head == null && tail == null;
        }
        

        public static void add(int data){
            Node newNode = new Node(data);
            //first element
            if(tail == null){
                tail = head = newNode;
            }
            tail.next = newNode;
            tail = newNode; 

            
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            int front = head.data;
            if(head == tail){
               tail = null;
            }
            head = head.next;


            return front;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            return head.data;
        }
    }
    
    
}

