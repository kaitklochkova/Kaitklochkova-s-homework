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
        MyClock clock = new MyClock();
        timer.scheduleAtFixedRate(clock, 0, 1000);

    }
}

public class Ex {

    public static void main(String[] args) {
        Timer timer = new Timer();
        int startTime = Integer.parseInt("10");
        int endTime = Integer.parseInt("20");
        for (int i = startTime; i <= endTime; i++) {
            MyTask task = new MyTask();
            timer.schedule(task, 1000);
        }
    }
}

class MyTask extends TimerTask {

    public void run() {
        System.out.println("hello");
    }
}
