/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author Miracle
 */
public class Queue <Type> {

    Queue() {
        head = null;
        tail = null;
        highPriority = 0;
        count = 0;
    }

    public void enqueue(Type valueForAdd, int priorityValue) {
        QueueElement newEl = new QueueElement();
        newEl.next = head;
        newEl.value = valueForAdd;
        newEl.priority = priorityValue;
        head = newEl;
        if (priorityValue > highPriority) {
            highPriority = priorityValue;
        }
        count++;
    }

    public void dequeue() throws EmptyQueue {
        if (count == 0) {
            throw new EmptyQueue();
        } else {
            QueueElement i = head;
            while (i.priority == highPriority) {
                head = i.next;
                count--;
                i = head;
            }
            while (i.next != null) {
                if (i.next.priority == highPriority) {
                    i.next = i.next.next;
                    count--;
                } else {
                    i = i.next;
                }
            }
        }
    }

    public int getCount() {
        return count;
    }
    
    private class QueueElement {

        private Type value;
        private int priority;
        private QueueElement next;
    }
    private QueueElement head;
    private QueueElement tail;
    private int highPriority;
    private int count;

    public static void main(String[] args) {
        // TODO code application logic here
    }
}
