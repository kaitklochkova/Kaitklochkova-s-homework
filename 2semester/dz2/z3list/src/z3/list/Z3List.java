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
        count++;
    }

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

    public void add(int valueForAdd) {
        ListElement newEl = new ListElement();
        newEl.value = valueForAdd;
        ListElement i = head;
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

    public void clear() {
        head = null;
        count = 0;
    }

    public int delEl(int valueForDel) {
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

    public boolean isElOfList(int number) {
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

    public int getCount() {
        return count;
    }

    ListIterator getIterator() {
        ListIterator temp = new ListIterator();
        temp.link = head;
        return temp;
    }

    public class ListIterator {

        public boolean isGood() {
            return link != null;

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
    private int count;
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