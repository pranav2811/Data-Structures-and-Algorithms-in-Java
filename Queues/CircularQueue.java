//circular queue is required as in the case of linear queue, even after we perform dequeue, the topOfQueue remains the same
//and hence isFull returns true and we are not allowed to enter any more elements in the queue even though
//the queue is not full

package Queues;
public class CircularQueue {
  int[] arr;
  int topOfQueue;
  int beginningOfQueue;
  int size;

  public CircularQueue(int size) {
    this.arr = new int[size];
    this.size = size;
    this.topOfQueue = -1;
    this.beginningOfQueue = -1;
    System.out.println("The CQ is successfully created with size of " + size);
  }

  // isEmpty
  public boolean isEmpty() {
    if (topOfQueue == -1) {
      return true;
    } else {
      return false;
    }
  }

  // isFull
  public boolean isFull() {
    if (topOfQueue+1 == beginningOfQueue) {
      return true;
    } else if (beginningOfQueue==0 && topOfQueue+1==size) {
      return true;
    } else {
      return false;
    }
  }

  // enQueue
  public void enQueue(int value) {
    if (isFull()) {
      System.out.println("The CQ is full!");
    } else if (isEmpty()) {
      beginningOfQueue = 0;
      topOfQueue++;
      arr[topOfQueue] = value;
      System.out.println("Successfully inserted "+value+" in the queue");
    } else {
      if (topOfQueue+1 == size) {
        topOfQueue = 0;
      } else {
        topOfQueue++;
      }
      arr[topOfQueue] = value;
      System.out.println("Successfully inserted "+value+" in the queue");
    }
  }

  // deQueue
  public int deQueue() {
    if (isEmpty()) {
      System.out.println("The CQ is empty!");
      return -1;
    } else {
      int result = arr[beginningOfQueue];
      arr[beginningOfQueue] = 0;
      if (beginningOfQueue == topOfQueue) {
        beginningOfQueue = topOfQueue = -1;
      } else if (beginningOfQueue+1 == size) {
        beginningOfQueue = 0;
      } else {
        beginningOfQueue++;
      }
      return result;
    }
  }

  // peek
  public int peek() {
    if (isEmpty()) {
      System.out.println("The CQ is emtpy");
      return -1;
    } else {
      return arr[beginningOfQueue];
    }
  }

  // deleteQueue
  public void deleteQueue() {
    arr = null;
    System.out.println("The CQ is successfully deleted!");
  }

}