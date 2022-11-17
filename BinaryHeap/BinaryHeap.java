package BinaryHeap;

public class BinaryHeap {
    int arr[];
    int sizeOfTree;

    public BinaryHeap(int size){// O(1) time complexity ad O(n) space since we are allocating n number of contiguous cells
        arr = new int[size+1];
        this.sizeOfTree = 0;
        System.out.println("Binary heap has been created successfully");
    }

    public boolean isEmpty(){
        if(sizeOfTree == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public int peek(){//peek implies returning the root of heep - O(1) space and time complexity
        if(isEmpty()){
            System.out.println("Heap is empty");
            return -1;
        }
        return arr[1];
        
    }
    public int sizeOfBP(){ // O(1) time and space complexity
        return sizeOfTree;
    }

    public void levelOrder(){//time complexity is O(n) and space complexity is O(1)
        for(int i = 1; i < sizeOfTree; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }
    //Heapify for Insert
    public void heapifyBottomToTop(int index, String heapType) {//time complexity is O(log n) and space complexity is O(1)
        int parent = index / 2;
        if (index <= 1 ) {
          return;
        }
        if (heapType == "Min") {
          if (arr[index] < arr[parent]) {
            int tmp = arr[index];
            arr[index] = arr[parent];
            arr[parent] = tmp;
          }
        } else if (heapType == "Max") {
          if (arr[index] > arr[parent]) {
            int tmp = arr[index];
            arr[index] = arr[parent];
            arr[parent] = tmp;
          }
        }
        heapifyBottomToTop(parent, heapType);
    
      }
    
      public void insert(int value, String typeHeap) {// O(log n) time and O(1) space
        arr[sizeOfTree+1] = value;
        sizeOfTree++;
        heapifyBottomToTop(sizeOfTree, typeHeap);//O(log n) time complexity
        System.out.println("Inserted " +value+ " successfully in Heap");
      }
    
      // heapifyTopToBottom
      public void heapifyTopToBottom(int index, String heapType) {
        int left = index*2;
        int right = index*2 + 1;
        int swapChild = 0;
        if (sizeOfTree < left) {
          return;
        }
        if (heapType == "Max") {
          if (sizeOfTree == left) {
            if (arr[index] < arr[left]) {
              int tmp = arr[index];
              arr[index] = arr[left];
              arr[left] = tmp;
            }
            return;
          } else {
            if (arr[left]>arr[right]) {
              swapChild = left;
            } else {
              swapChild = right;
            }
            if (arr[index] < arr[swapChild]) {
              int tmp = arr[index];
              arr[index] = arr[swapChild];
              arr[swapChild] = tmp;
            }
          }
        } else if (heapType == "Min") {
          if (sizeOfTree == left) {
            if (arr[index] > arr[left]) {
              int tmp = arr[index];
              arr[index] = arr[left];
              arr[left] = tmp;
            }
            return;
          } else {
            if (arr[left] < arr[right]) {
              swapChild = left;
            } else {
              swapChild = right;
            }
            if (arr[index] > arr[swapChild]) {
              int tmp = arr[index];
              arr[index] = arr[swapChild];
              arr[swapChild] = tmp;
            }
          }
        }
        heapifyTopToBottom(swapChild, heapType);
      }
      //Extraction of an element - only root node can be extracted in a binary heap
      //after extraction we find last eleement and replace it with the root node and then heapify the tree

      public int extractHeadOfBP(String heapType) {// O(log n) time and O(logn) space
        if (isEmpty()) {
          return -1;
        } else {
          int extractedValue = arr[1];
          arr[1] = arr[sizeOfTree];
          sizeOfTree--;
          heapifyTopToBottom(1, heapType);
          return extractedValue;
        }
      }
      // delete
  public void deleteBH() {
    arr = null;
    System.out.println("BH has been successfully deleted");
  }
}
