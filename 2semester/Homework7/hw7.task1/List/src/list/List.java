/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package list;

import java.util.NoSuchElementException;

/**
 *
 * @author Miracle
 */
public class List <Type> implements Iterable<Type> {
    /**
     * constructor for list
     */
    List() {
        head = null;
        count = 0;
    }

    /**
     * add value to head of the list
     *
     * @param valueForAdd value, which you want to add
     */
    public void addToHead(Type valueForAdd) {
        ListElement newEl = new ListElement();
        newEl.next = head;
        newEl.value = valueForAdd;
        head = newEl;
        count++;
    }

    /**
     * del value from the list
     *
     * @param valueForDel value, which you want to del
     */
    public void delEl(Type valueForDel) throws NotInList{
        if (head == null) {
            throw new NotInList();
        } else {
            ListElement i = head;
            while (i.value == valueForDel) {
                head = i.next;
                count--;
                i = head;
            }
            while (i.next != null) {
                if (i.next.value == valueForDel) {
                    i.next = i.next.next;
                    count--;
                } else {
                    i = i.next;
                }
            }
        }
    }

    /**
     * delete  the number from the begin of the list
     */
    public void delFromBegin() throws NotInList {
        if (head != null) {
            head = head.next;
        } else {
            throw new NotInList();
        }
    }

    
    /**
     * checks that the number is in list
     *
     * @return true if number is in list else false
     */
    public boolean isElementInList(Type number) {
        if (head == null) {
            return false;
        } else {
            ListElement i = head;
            if (i.value == number) {
                return true;
            } else {
                while (i.next != null) {
                    if (i.next.value == number) {
                        return true;
                    } else {
                        i = i.next;
                    }
                }
            }
        }
        return false;
    }

    /*
     * @return count of the list
     */
    public int getCount() {
        return count;
    }
    
    /**
     * @return first head's value
     */
    public Type getValueOfHead() {
        return head.value;
    }

    /*
     * @return iterator
     */
    public ListIterator iterator() {
        return new ListIterator();
    }

    public class ListIterator implements Iterator<Type> {

        /*
         * constructor for iterator
         */
        public ListIterator() {
            link = head;
        }

        /**
         * checks that the element pointed to by the iterator points to not null
         *
         * @return true if element points to not null else false
         */
        @Override
        public boolean hasNext() {
            return link != null;

        }

        /*
         * @return next of element pointed to by the iterator
         */
        @Override
        public Type next() {
            if (hasNext()) {
                link = link.next;
                return link.value;
            } else {
                throw new NoSuchElementException();
            }
            
        }
        /*
         * link to the element of list
         */
        private ListElement link;
    }

    private class ListElement {

        /**
         * value of listElement
         */
        private Type value;
        /**
         * next of listElement
         */
        private ListElement next;
    }
    /**
     * head of list
     */
    private ListElement head;
    /**
     * count of list
     */
    private int count;
}
