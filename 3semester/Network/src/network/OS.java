/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package network;

/**
 *
 * @author Miracle
 */
public abstract class OS {

    /**
     * Get virus infection possibility
     *
     * @return
     */
    public int getPossibilityOfInfection() {
        return possibilityOfInfection;
    }
    
    public int possibilityOfInfection;
}
