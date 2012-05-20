/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package task4;

/**
 *
 * @author Miracle
 */
public class MyHashFun2 implements HashFunInterface {

    /**
     * hash-function
     *
     * @param str
     * @return hash-function for the string
     */
    @Override
    public int hashFun(String string) {
        return string.hashCode();
    }
}
