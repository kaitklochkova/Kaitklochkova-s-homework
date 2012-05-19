/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package priorityqueue;

/**
 *
 * @author Miracle
 */
public class EmptyQueueException extends Exception {
    public EmptyQueueException() {
        super();
    }
    public EmptyQueueException(String str) {
        super(str);
    }
}
