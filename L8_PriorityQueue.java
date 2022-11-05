import java.util.PriorityQueue;

/* 
* Queues are usually fifo but what if we wanted to access the highest priority item so when we add an item 
*we assign it a priority and then we can access the highest priority item, so when we go to remove an item
*the highest priority item is removed
*Abstract data type commonly implemented as a max heap

*/


public class L8_PriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        pq.add(25);
        pq.add(-22);
        pq.add(1343);
        pq.add(54);
        pq.add(0);
        pq.add(-3492);
        pq.add(429);

        System.out.println(pq.peek());//returns the highest priority item in the queue
        System.out.println(pq.remove());//removes the highest priority item in the queue
        System.out.println(pq.peek());
        System.out.println(pq.poll());//removes the highest priority item in the queue, same as remove
        System.out.println(pq.peek());
        System.out.println(pq.remove(54));//doesnt return the object but instead true or false to indicate whether the operation has been done or not

        Object[] ints = pq.toArray();
        for(Object num : ints){
            System.out.println(num);
        }
        
        System.out.println(pq.peek());
        pq.add(-1);
        System.out.println(pq.peek());

        //if you call remove or poll then by default it removes the root i.e the highest priority item
        // we can get an array from the pq by calling toArray

    }
    
}
