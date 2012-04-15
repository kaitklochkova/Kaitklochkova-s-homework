/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package set;

/**
 *
 * @author Miracle
 */
public class Set<Type> {

    /**
     * constructor for set
     */
    Set() {
        head = null;
    }

    /*
     * add value to the set
     *
     * @param valueForAdd value, which you want to add
     */
    public void add(Type valueForAdd) throws IsInSet {
        if (isElementInSet(valueForAdd)) {
            throw new IsInSet();
        } else {
            SetElement newEl = new SetElement();
            newEl.next = head;
            newEl.value = valueForAdd;
            head = newEl;
        }
    }

    /*
     * del value from the set
     *
     * @param valueForDel value, which you want to del
     */
    public void delete(Type valueForDel) throws NotInSet {
        if (!isElementInSet(valueForDel)) {
            throw new NotInSet();
        } else {
            SetElement i = head;
            while (i != null && i.value == valueForDel) {
                head = i.next;
                i = head;
            }
            while (i != null && i.next != null) {
                if (i.next.value == valueForDel) {
                    i.next = i.next.next;
                } else {
                    i = i.next;
                }
            }
        }
    }

    /**
     * checks that the value is in Set
     *
     * @return true if value is in set else false
     */
    public boolean isElementInSet(Type value) {
        SetElement i = head;
        while (i != null) {
            if (i.value == value) {
                return true;
            } else {
                i = i.next;
            }
        }
        return false;
    }

    public Set<Type> sum(Set<Type> set) throws IsInSet {
        Set<Type> newSet = new Set<Type>();
        SetElement i = head;
        newSet.add(i.value);
        while (i.next != null) {
            newSet.add(i.next.value);
            i = i.next;
        }
        i = set.head;
        newSet.add(i.value);
        while (i.next != null) {
            try {
                newSet.add(i.next.value);
            } catch (IsInSet isInSet) {
            }
            i = i.next;
        }
        return newSet;
    }

    public Set<Type> cross(Set<Type> set) throws IsInSet {
        Set<Type> newSet = new Set<Type>();
        SetElement i1 = head;
        SetElement i2 = set.head;
        while (i1 != null) {
            while (i2 != null) {
                if (i1.value == i2.value) {
                    newSet.add(i1.value);
                }
                i2 = i2.next;
            }
            i2 = set.head;
            i1 = i1.next;
        }
        return newSet;
    }

    private class SetElement {

        /**
         * value of setElement
         */
        Type value;
        /**
         * next of setElement
         */
        SetElement next;
    }
    /**
     * head of set
     */
    private SetElement head;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
