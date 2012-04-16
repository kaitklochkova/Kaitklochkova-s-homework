/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package list;

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
     * add value to tail of the list
     *
     * @param valueForAdd value, which you want to add
     */
    public void addToTail(Type valueForAdd) {
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
    public int delEl(Type valueForDel) {
        if (head == null) {
            return -1;
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
            return 0;
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

    /*
     * @return iterator
     */
    ListIterator iterator() {
        return new ListIterator();
    }

    public class ListIterator implements Iterator<Type> {

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
        @Override
        public boolean hasNext() {
            return link != null;

        }

        /*
         * @return next of element pointed to by the iterator
         */
        @Override
        public Type next() {
            link = link.next;
            return link.value;
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
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
