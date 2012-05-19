/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package priorityqueue;

/**
 *
 * @author Author
 */
//This is an example of priority queue class.
// High priority items have low 'prio' value, i.e. ("str1", 0) > ("str2", 1)
public class MyPriorityQueue<T> {
    /*
     * constructor
     */

    public MyPriorityQueue() {
        head = null;  // create head
    }

    /*
     * add item to queue
     *
     * @param val value of the added element @param prio priority of the added
     * element
     */
    public void enqueue(T value, int priority) {
        ListElement newEl = head;
        ListElement tmp = new ListElement(value, priority);
        if (head == null) {
            head = tmp;
        } else {
            if (head.getPriority() < priority) {
                tmp.setNext(newEl);
                head = tmp;
            }
            while (newEl.getNext() != null && newEl.getNext().getPriority() > priority) {
                newEl = newEl.getNext();
            }
            tmp.setNext(newEl.getNext());
            newEl.setNext(tmp);
        }
    }

    /*
     * delete item with highest priority from queue
     *
     * @return value of the deleted element
     */
    public T dequeue() throws Exception {
        if (head == null) {
            throw new EmptyQueueException("Queue is empty!!!");
        }
        ListElement tmp = head;
        head = tmp.getNext();
        return tmp.getValue();
    }

    /*
     * queue's element
     */
    private class ListElement {
        
        /*
         * constructor for ListElement
         * @param v value of added element @param p priority of added element
         */
        public ListElement(T value, int priority) {
            next = null;
            this.value = value;
            this.priority = priority;
        }
        
        /*
         * @return next listElement
         */
        public ListElement getNext() {
            return next;
        }

        /*
         * @param listElement wich we want to do next for this.listElement
         * do listElement is next for this.listElement
         */
        public void setNext(ListElement listElement) {
            next = listElement;
        }

        /*
         * @return value of listElement
         */
        public T getValue() {
            return value;
        }
        
        /*
         * @return priority of listElement
         */
        public int getPriority() {
            return priority;
        }
        
        /*
         * value of element
         */
        private T value;    
        /*
         * next element
         */
        private ListElement next; 
        /*
         * priority of element
         */
        private int priority;      
    }
    /*
     * head of the queue
     */
    private ListElement head;
}
