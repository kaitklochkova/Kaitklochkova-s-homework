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
    public HashTable() {
        count = 100;
        bucket = new List[count];
        for (int i = 0; i < count; i++) {
            bucket[i] = new List();
        }
    }

    /**
     * add element String str to hash
     *
     * @param str
     */
    public void addHash(String str) {
        int index = hashFun(str) % count;
        bucket[index].addToTail(str);
    }

    /**
     * del element String str to hash
     *
     * @param str
     */
    public int delHash(String str) {
        int index = hashFun(str) % count;
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
        return bucket[hashFun(str) % count].isElementInList(str);       
    }
    
    /**
     * hash-function
     *
     * @param str
     * @return hash-function for the string
     */
    private static int hashFun(String str) {
        int tempResult = 0;
        char[] tempStr = str.toCharArray();
        for (int i = 0; i < tempStr.length; i++) {
            tempResult = tempResult * 101 + tempStr[i];
        }
        return tempResult;
    }

    
    private List[] bucket;
    private int count;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
