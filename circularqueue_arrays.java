
//rear + 1 = front - condition for full queue
//rear = (rear+1)%size - condition for circular queue for updating rear
public class circularqueue_arrays {
    static class queue{
        static int size;
        static int rear = -1;
        static int front = -1;
        static int arr[];

        queue(int n){
            size = n;
            arr = new int[n];

        }
        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }
        public static boolean isFull(){
            return (rear+ 1 )%size == front;
        }

        public static void add(int d){
            if(isFull()){
                System.out.println("queue is full");
                return;
            }
            //first element add
            if(front == -1){
                front = 0;
            }
            rear = (rear+1)%size;
            arr[rear] = d;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            int result = arr[front];
            if(front == rear){
                rear = front = -1;
            }
            else{
                front = (front+1)%size;
            }
            return result;
            
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            return arr[front];
        }
    }
    
    
}
