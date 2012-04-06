/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package task4;

/**
 *
 * @author Miracle
 */
public class List {
    
    /**
     * constructor for list
     */
    public List() {
        head = null;
        count = 0;
    }

    /**
     * add value to head of the list
     *
     * @param valueForAdd value, which you want to add
     */
    public void addToHead(String valueForAdd) {
        ListElement newEl = new ListElement();
        newEl.next = head;
        newEl.value = valueForAdd;
        head = newEl;
        count++;
    }
    
    /**
     * add value to tail of the list
     *
     * @param valueForAdd value, which you want to add
     */
    public void addToTail(String valueForAdd) {
        ListElement newEl = new ListElement();
        newEl.value = valueForAdd;
        if (head == null) {
            newEl.next = head;
            head = newEl;
        } else {
            newEl.next = null;
            ListElement i = head;
            while (i.next != null) {
                i = i.next;
            }
            i.next = newEl;
        }
        count++;
    }

    /*
     * del list
     */
    public void clear() {
        head = null;
        count = 0;
    }

    /**
     * del value from the list
     *
     * @param valueForDel value, which you want to del
     */
    public int delEl(String valueForDel) {
        if (head == null) {
            return -1;
        } else {
            ListElement i = head;
            while (i.value.equals(valueForDel)) {
                if (head.next != null) {
                    head = i.next;
                    count--;
                    i = head;
                } else {
                    head = null;
                    break;
                }
            }
            while (i.next != null) {
                if (i.next.value.equals(valueForDel)) {
                    i.next = i.next.next;
                    count--;
                } else {
                    i = i.next;
                }
            }
            return 0;
        }
    }

    /**
     * checks that the number is in list
     *
     * @return true if number is in list else false
     */
    public boolean isElementInList(String number) {
        if (head == null) {
            return false;
        } else {
            ListElement i = head;
            if (i.value.equals(number)) {
                return true;
            } else {
                while (i.next != null) {
                    if (i.next.value.equals(number)) {
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

    /*
     * @return iterator
     */
    ListIterator getIterator() {
        return new ListIterator();
    }

    public class ListIterator {

        /*
         * constructor for iterator
         */
        ListIterator() {
            link = head;
        }
        
        /**
         * checks that the element pointed to by the iterator points to not null
         *
         * @return true if element points to not null else false
         */
        public boolean isGood() {
            return link != null;

        }
        
        /*
         * @return value of element pointed to by the iterator
         */
        public String getValue() {
            return link.value;
        }

        /*
         * @return next of element pointed to by the iterator
         */
        public void next() {
            link = link.next;
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
        private String value;
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
