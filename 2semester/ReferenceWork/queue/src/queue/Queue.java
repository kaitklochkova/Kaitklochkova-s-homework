/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author Miracle
 */
public class Queue<Type> {

    /**
     * constructor for list
     */
    Queue() {
        head = null;
        highPriority = 0;
        count = 0;
    }

    /**
     * add value to the head of the queue
     *
     * @param valueForAdd value, which you want to add
     * @param priorityValue priority of value
     */
    public void enqueue(Type valueForAdd, int priorityValue) {
        if (priorityValue > highPriority) {
            highPriority = priorityValue;
        }
        QueueElement newEl = new QueueElement();
        newEl.next = head;
        newEl.value = valueForAdd;
        newEl.priority = priorityValue;
        head = newEl;
        count++;
    }

    /**
     * del value from the queue with highest priority
     */
    public Type dequeue() throws EmptyQueue {
        if (count == 0) {
            throw new EmptyQueue();
        } else {
            QueueElement i = head;
            Type result = head.value;
            if (i.priority == highPriority) {
                result = i.value;
                head = i.next;
                count--;
                i = head;
            }
            while (i.next != null) {
                if (i.next.priority == highPriority) {
                    result = i.next.value;
                    i.next = i.next.next;
                    count--;
                } else {
                    i = i.next;
                }
            }
            return result;
        }
    }

    /*
     * @return count of the list
     */
    public int getCount() {
        return count;
    }

    /**
     * dequeue and catch exception
     */
    private void dequeueElement() throws EmptyQueue {
        try {
            dequeue();
        } catch (EmptyQueue emptyQueue) {
            throw emptyQueue;
        }
    }

    private class QueueElement {

        /**
         * value of QueueElement
         */
        private Type value;
        /**
         * priority of QueueElement
         */
        private int priority;
        /**
         * next of QueueElement
         */
        private QueueElement next;
    }
    /**
     * head of queue
     */
    private QueueElement head;
    /**
     * highPriority of queue
     */
    private int highPriority;
    /**
     * count of queue
     */
    private int count;

    public static void main(String[] args) {
        // TODO code application logic here
    }
}
