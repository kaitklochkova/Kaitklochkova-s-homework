/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package task4;

/**
 *
 * @author Miracle
 */
public class HashTable {
    /**
     * constructor of the hash-table
     */
    public HashTable(HashFunInterface hashFun) {
        count = 100;
        bucket = new List[count];
        for (int i = 0; i < count; i++) {
            bucket[i] = new List();
        }
        this.hashFun = hashFun;
    }

    /**
     * add element String str to hash
     *
     * @param str
     */
    public void addHash(String str) {
        int index = hashFun.hashFun(str) % count;
        bucket[index].addToTail(str);
    }

    /**
     * del element String str to hash
     *
     * @param str
     */
    public int delHash(String str) {
        int index = hashFun.hashFun(str) % count;
        return bucket[index].delEl(str);
    }
    
    /**
     * del hash-table
     */
    public void clearHash() {
        for (int i = 0; i < count; i++) {
            bucket[i].clear();
        }
    }
    
    /*
     * @return the count of hash-table
     */
    public int getCount() {
        return count;
    }
    
    public void changeHashFunction(HashFunInterface newHashFun) {
        List[] newBuckets = new List[count];     
        for (int i = 0; i < count; i++) {
            newBuckets[i] = new List();
        }
        for (int i = 0; i < count; i++) {
            List.ListIterator iterator = bucket[i].getIterator();
            while (iterator.isGood()) {
                String currentString = iterator.getValue();
                int index = newHashFun.hashFun(currentString);
                newBuckets[index].addToTail(currentString);
                bucket[i].delEl(currentString);
                iterator.next();
            }        
        }
        
        System.arraycopy(newBuckets, 0, bucket, 0, count);
        this.hashFun = newHashFun;
    }

    /**
     * determine whether there is an element in the hash table
     *
     * @param str
     */
    public boolean isElementInHashTable(String str) {
        return bucket[hashFun.hashFun(str) % count].isElementInList(str);       
    }
    
    private List[] bucket;
    private int count;
    HashFunInterface hashFun;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyHashFun myHashFun = new MyHashFun();
        HashTable hashTable = new HashTable(myHashFun);
        hashTable.addHash("1");
        hashTable.addHash("2");
        MyHashFun2 myHashFun2 = new MyHashFun2();
        hashTable.changeHashFunction(myHashFun2);
    }
}
