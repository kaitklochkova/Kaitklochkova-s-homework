/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package t3;

/**
 *
 * @author Miracle
 */
public class List {

    public List() {
        head = null;
        count = 0;
    }

    public void addToHead(String valueForAdd) {
        ListElement newEl = new ListElement();
        newEl.next = head;
        newEl.value = valueForAdd;
        head = newEl;
        count++;
    }

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

    public void clear() {
        head = null;
        count = 0;
    }

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

    public int getCount() {
        return count;
    }

    ListIterator getIterator() {
        return new ListIterator();
    }

    public class ListIterator {

        ListIterator() {
            link = head;
        }

        public boolean isGood() {
            return link != null;

        }

        public String getValue() {
            return link.value;
        }

        public void next() {
            link = link.next;
        }
        private ListElement link;
    }

    private class ListElement {

        private String value;
        private ListElement next;
    }
    private ListElement head;
    private int count;
}
