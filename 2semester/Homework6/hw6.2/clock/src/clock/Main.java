/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clock;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Miracle
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Timer timer = new Timer();
        int startTime = Integer.parseInt("10");
        int endTime = Integer.parseInt("20");
        for (int i = startTime; i <= endTime; i++) {
            MyClock task = new MyClock();
            timer.schedule(task, 1000);
        }
    }
}
}
