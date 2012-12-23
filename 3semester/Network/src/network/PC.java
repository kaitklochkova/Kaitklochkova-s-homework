/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package network;

import java.util.Random;

/**
 *
 * @author Miracle
 */
public class PC {
    
    /**
     * Constrictor
     */
    public PC(OS system, boolean state) {
        this.system = system;
        this.isInfected = state;
    }
    
    /**
     * Reports about PC's state
     *
     * @return true if PC infected and false if it isn't
     */
    public boolean isInfected() {
        return isInfected;
    }
    
    /**
     * Gives random test solution
     */
    public void virusAttack() {
        Random random = new Random();
        int num = random.nextInt(100);
        if (num <= system.getPossibilityOfInfection()) {
            isInfected = true;
        }
    }
    
    /**
     * Name of OS
     */
    private OS system;
    
    /**
     * Current state of PC
     */
    private boolean isInfected;
}
