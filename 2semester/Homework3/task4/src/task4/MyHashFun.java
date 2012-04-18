/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package task4;

/**
 *
 * @author Miracle
 */
public class MyHashFun implements HashFunInterface {
    /**
     * hash-function
     *
     * @param str
     * @return hash-function for the string
     */
    @Override
    public int hashFun(String str) {
        int tempResult = 0;
        char[] tempStr = str.toCharArray();
        for (int i = 0; i < tempStr.length; i++) {
            tempResult = tempResult * 101 + tempStr[i];
        }
        return tempResult;
    }

}
