package Hashing;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;

public class DirectChaining{
    
    LinkedList<String>[] hashTable;
    int maxChainSize = 5;//well set a limit to each node to keep to time complexity to O(1)

    DirectChaining(int size){
        hashTable = new LinkedList[size];
    }

    public int modASCIIFunction(String word, int M){
        char ch[];
        ch = word.toCharArray();
        int i, sum;

        for(sum = 0,i = 0; i < word.length(); i++){
            sum += ch[i];
        }
        return sum % M;
    }

    public void insertHashTable(String word){
        int newIndex = modASCIIFunction(word, hashTable.length);
        if(hashTable[newIndex] == null){
            hashTable[newIndex] = new LinkedList<String>();
            hashTable[newIndex].add(word);
        }
        else{
            hashTable[newIndex].add(word);
        }
    }


    public void displayHashTable(){
        if(hashTable == null){
            System.out.println("HashTable does not exist");
        }
        else{
            System.out.println("\n----------HashTable----------");
            for(int i = 0; i < hashTable.length; i++){
                System.out.println("Index: " + i + ", key: " + hashTable[i]);
            }
        }
    }

    public boolean searchHashTable(String word){
        int newIndex = modASCIIFunction(word, hashTable.length);
        if(hashTable[newIndex] != null && hashTable[newIndex].contains(word)){
            System.out.println("\n" + word + " found in HashTable at index: " + newIndex);
            return true;
        }
        else{
            System.out.println("Word not found in index");
            return false;
        }
    }

    public void deleteKeyHashTable(String word){
        int newIndex = modASCIIFunction(word, hashTable.length);
        boolean result = searchHashTable(word);
        if(result == true){
            hashTable[newIndex].remove(word);
            System.out.println(word + " has been deleted from HashTable");
        }
        else{
            System.out.println(word + " not found in HashTable");
        }
    }
    


}