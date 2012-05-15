/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package priorityqueue;

/**
 *
 * @author Author
 */
// This is an example of priority queue class.
// High priority items have low 'prio' value, i.e. ("str1", 0) > ("str2", 1)
public class MyPriorityQueue<T> {

    // constructor
    public MyPriorityQueue() {
        head = null;  // create head
    }

    // add item to queue
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
    
    // get item from queue with highest priority

    public T dequeue() throws Exception {
        if (head == null) {
            throw new RuntimeException("Queue is empty!!!");
        }
        ListElement tmp = head;
        head = tmp.getNext();
        return tmp.getValue();
    }

    private class ListElement {

        // yet another constructor for ListElement
        public ListElement(T value, int priority) {
            next = null;
            this.value = value;
            this.priority = priority;
        }

        // @return next listElement
        public ListElement getNext() {
            return next;
        }

        // @param listElement wich we want to do next for this.listElement
        // do listElement is next for this.listElement
        public void setNext(ListElement listElement) {
            next = listElement;
        }

        // @return value of listElement
        public T getValue() {
            return value;
        }

        // @return priority of listElement
        public int getPriority() {
            return priority;
        }
        private T value;           // stored value
        private ListElement next;  // next item
        private int priority;      // item priority
    }
    private ListElement head; // head of list
}
