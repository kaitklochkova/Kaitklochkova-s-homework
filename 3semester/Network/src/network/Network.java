/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package network;

/**
 *
 * @author Miracle
 */
public class Network {

    /**
     * construct for network
     */
    public Network(int[][] connections, PC[] computers){
        this.connections = connections;
        this.computers = computers;
    }
    
    /**
     * Makes system progress
     */
    public void progressNetwork() {
        for (int i = 0; i < this.computers.length; i++) {
            for (int j = 0; j < this.computers.length; j++) {
                if (this.connections[i][j] == 1) {
                    if (this.computers[i].isInfected()) {
                        this.computers[j].virusAttack();
                    } 
                }
            }
        }       
    }

    /**
     * print the current state of net
     */
    public void printNetwork() {
        for (int i = 0; i < this.computers.length; ++i) {
            if (computers[i].isInfected()) {
                System.out.println("Computer # " + i + " is infected");
            } else {
                System.out.println("Computer # " + i + " isn't infected");
            }
        }
        System.out.println();
    }
    
    /**
     * @return true if all computers are infected else - false
     */
    public boolean networkIsInfected() {
        boolean result = true;
        for (int i = 0; i < this.computers.length; ++i) {
            if (!computers[i].isInfected()) {
                result = false;
            }
        }
        return result;
    }
    
    /**
     * peck network status
     */ 
    public void start() {
        int i = 0;
        while (!networkIsInfected()) {
            try {
                i++;
                System.out.println("Step #" + i);
                progressNetwork();
                printNetwork();  
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                System.out.println("This should not have happened because the exception is written only for delay");
            }
        }
    }
    
    /**
     * 
     * @return array of computers to do tests 
     */
    public PC[] getComputers() {
        return this.computers;
    }
    
    /*
     * computers are in net
     */
    private PC[] computers;
    
    /*
     * matrix relations
     */
    private int[][] connections;
}
