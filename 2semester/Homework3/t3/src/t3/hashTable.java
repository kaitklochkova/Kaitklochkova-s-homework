/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package t3;

/**
 *
 * @author Miracle
 */
class HashTable {

    /**
     * constructor of the hash-table
     */
    HashTable() {
        for (int i = 0; i < 100; i++) {
            bucket[i] = new List();
        }
    }

    /**
     * hash-function
     *
     * @param str
     * @return hash-function for the string
     */
    public static int hashFun(String str) {
        int tempResult = 0;
        char[] tempStr = str.toCharArray();
        for (int i = 0; i < tempStr.length; i++) {
            tempResult = tempResult * 101 + tempStr[i];
        }
        return tempResult;
    }

    /**
     * add element String str to hash
     *
     * @param str
     */
    void addHash(String str) {
        int index = hashFun(str) % 100;
        bucket[index].addToTail(str);
    }

    /**
     * del hash-table
     */
    void clearHash() {
        for (int i = 0; i < 100; i++) {
            bucket[i].clear();
        }
    }

    /**
     * determine whether there is an element in the hash table
     *
     * @param str
     */
    boolean isElementInHashTable(String str) {
        return bucket[hashFun(str)].isElementInList(str);       
    }
    
    private List[] bucket;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.format("%d \n", hashFun("1"));// TODO code application logic here
    }
}
