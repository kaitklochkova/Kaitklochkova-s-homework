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
        this.random = new Random();
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
        int num = random.nextInt(100);
        if (num <= system.getPossibilityOfInfection()) {
            isInfected = true;
        }
    }
    
    private Random random;
    /**
     * Name of OS
     */
    private OS system;
    
    /**
     * Current state of PC
     */
    private boolean isInfected;
}
