/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package z3.list;

/**
 *
 * @author Miracle
 */
class List {

    List() {
        head = null;
    }

    public void addToHead(int valueForAdd) {
        ListElement newEl = new ListElement();
        newEl.next = head;
        newEl.value = valueForAdd;
        head = newEl;
    }

    public void clear() {
        head = null;
    }

    public int delEl(int valueForDel) {
        if (head == null) {
            return -1;
        } else {
            ListElement i = head;
            while (i.value == valueForDel) {
                head = i.next;
                i = head;
            }
            while (i.next != null) {
                if (i.next.value == valueForDel) {
                    i.next = i.next.next;
                } else {
                    i = i.next;
                }
            }
            return 0;
        }
    }

    ListIterator getIterator() {
        ListIterator temp = new ListIterator();
        temp.link = head;
        return temp;
    }

    public class ListIterator {

        public boolean isGood() {
            if (link != null) {
                return true;
            } else {
                return false;
            }
        }

        public int getValue() {
            return link.value;
        }

        public void next() {
            link = link.next;
        }

        public ListElement getNext() {
            return link.next;
        }
        private ListElement link;
    }

    private class ListElement {

        private int value;
        private ListElement next;
    }
    private ListElement head;
}

public class Z3List {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List list = new List();
        for (int i = 0; i < 10; i++) {
            list.addToHead(i);
        }
        List.ListIterator iterator = list.getIterator();
        while (iterator.isGood()) {
            System.out.format("%d ", iterator.getValue());
            iterator.next();
        }
        System.out.format("\n");
        list.clear();
    }
}