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
}
