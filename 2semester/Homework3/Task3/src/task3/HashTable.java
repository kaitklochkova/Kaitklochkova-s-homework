/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

/**
 *
 * @author Miracle
 */
public class HashTable {

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
    public int hashFun(String str) {
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
    void delHash() {
        for (int i = 0; i < 100; i++) {
            bucket[i].clear();
        }
    }

    /**
     * determine whether there is an element in the hash table
     * @param str 
     */
    void isElementInHashTable(String str) {
        for (int i = 0; i < 100; i++) {
            bucket[i].isElementInList(str);
        }
    }
    private List[] bucket;
}
