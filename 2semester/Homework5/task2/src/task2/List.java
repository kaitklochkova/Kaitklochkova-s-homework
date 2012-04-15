/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

/**
 *
 * @author Miracle
 */
public class List {

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
    public void addToHead(int valueForAdd) {
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
    public void addToTail(int valueForAdd) {
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

    /**
     * add value to the sorted list
     *
     * @param valueForAdd value, which you want to add
     */
    public void add(int valueForAdd) throws IsInList {
        ListElement i = head;
        if (head == null) {
            addToHead(valueForAdd);
        } else {
            if (i.value > valueForAdd) {
                addToHead(valueForAdd);
            } else {
                ListElement newEl = new ListElement();
                newEl.value = valueForAdd;
                while (i.next != null) {
                    if (i.next.value <= valueForAdd) {
                        i = i.next;
                    } else {
                        newEl.next = i.next;
                        i.next = newEl;
                        break;
                    }
                }
                if (i.next == null) {
                    newEl.next = null;
                    i.next = newEl;
                }
                count++;
            }
        }
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
    public void del(int valueForDel) throws NotInList {
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

    /**
     * checks that the number is in list
     *
     * @return true if number is in list else false
     */
    public boolean isElementInList(int number) {
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
        public int getValue() {
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
        private int value;
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
