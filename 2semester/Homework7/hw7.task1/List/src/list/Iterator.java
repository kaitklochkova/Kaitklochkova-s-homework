/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package list;

/**
 *
 * @author Miracle
 */
public interface Iterator<Type> {
   
    Type next();
    
    boolean hasNext();
}
