/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package robots;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Miracle
 */
public class Robots {

    /**
     * Constructor
     * @param matrix is a matrix 
     * @param robotPositions are positions for robots
     */
    public Robots(int[][] matrix, int[] robotPositions) {
        this.robotPositions = robotPositions;
        this.matrix = matrix;
    }
    
    /**
     * It counts robots
     * @return count of robots
     */
    public int getCountOfRobot() {
        int count = 0;
        for (int i = 0; i < this.robotPositions.length; i++) {
            if (this.robotPositions[i] == 1) {
                count++;
            }
        }
        return count;
    }
    
    /**
     * @return true if robots can be destroyed else false
     */
    public boolean canRobotsBeDestroed() {
        
        int countOfRobot = getCountOfRobot();
        
        if (countOfRobot == 1) {
            return false;
        }      
        
        Queue<Integer> queue = new LinkedList<Integer>(); 
        
        
        return true;
    }
    
    
    /**
     *  matrix
     */
    private int[][] matrix;
    
    /**
     * True, when robot exist in this node
     */
    private int[] robotPositions;
}
