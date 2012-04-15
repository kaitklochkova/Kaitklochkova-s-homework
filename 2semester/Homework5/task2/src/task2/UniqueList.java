/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

/**
 *
 * @author Miracle
 */
public class UniqueList extends List {

    /**
     * constructor for UniqueList
     */
    UniqueList() {
    }

    /**
     * add value to the list in a single copy
     *
     * @param valueForAdd value, which you want to add
     */
    @Override
    public void add(int valueForAdd) throws IsInList {
        if (isElementInList(valueForAdd)) {
            throw new IsInList();
        } else {
            add(valueForAdd);
        }
    }

    /**
     * del value from the list
     *
     * @param valueForDel value, which you want to del
     */
    @Override
    public void del(int valueForDel) throws NotInList {
        if (isElementInList(valueForDel)) {
            del(valueForDel);
        } else {
            throw new NotInList();
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }
}
