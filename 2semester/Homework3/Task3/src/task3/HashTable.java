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

    HashTable() {
        for (int i = 0; i < 100; i++) {
            bucket[i] = new List();
        }
    }

    public int hashFun(char[] str) {
        int temp = 0;
        for (int i = 0; i < str.length; i++) {
            temp = temp * 101 + str[i];
        }
        return temp;
    }

    void addHash(char[] str) {
        int index = hashFun(str) % 100;
        bucket[index].add(str);
    }

    void delHash() {
        for (int i = 0; i < 100; i++) {
            bucket[i].clear();
        }
    }
    private List[] bucket;
}
