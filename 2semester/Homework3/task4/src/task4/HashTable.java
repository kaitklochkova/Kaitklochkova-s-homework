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
        // TODO code application logic here
    }
}
