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
     * @return true if robots can be destroyed else false
     */
    public boolean canRobotsBeDestroed() {
        
        int countOfRobot = getCountOfRobot();            
        
        Queue<Integer> queue = new LinkedList<Integer>(); 
        
        int componentAmount = 0;
        int[] visitedNodes = new int[robotPositions.length];        
        visitedNodes[0] = 1;
        queue.add(0);   
        
        if (this.robotPositions[0] == 1) {
            componentAmount++;
        }
        
        while (!queue.isEmpty()) {
            int currentNode = queue.remove();
            
            for (int i = 0; i < this.matrix.length; i++) {
                if (this.matrix[currentNode][i] == 1) {
                    
                    for (int j = 0; j < this.matrix.length; j++) {
                        
                        if (this.matrix[i][j] == 1) {
                            
                            if (visitedNodes[j] == 0) {
                                
                                visitedNodes[j] = 1;
                                queue.add(j);

                                if (this.robotPositions[j] == 1) {
                                    componentAmount++;
                                }
                            }
                        }
                    }
                }
            }
        }
        
        
        return !(componentAmount == 1 || countOfRobot - componentAmount == 1);
    }
    
    /**
     * It counts robots
     * @return count of robots
     */
    private int getCountOfRobot() {
        int count = 0;
        for (int i = 0; i < this.robotPositions.length; i++) {
            if (this.robotPositions[i] == 1) {
                count++;
            }
        }
        return count;
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
