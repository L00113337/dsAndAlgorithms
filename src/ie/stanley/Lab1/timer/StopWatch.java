package ie.stanley.Lab1.timer;

/**
 * Created by stanley nyadzayo on 31/01/17.
 * L00113337
 * Cloud and Green
 * Semester 5
 */
public class StopWatch {
    private long elapsedTime;
    private long startTime, endTime;
    private boolean isRunning;

    public StopWatch() {
        reset();
    }

    public void start() {
        if (isRunning)
            return;
        isRunning = true;
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        if (!isRunning)
            return;
        isRunning = false;
        endTime = System.currentTimeMillis();
        elapsedTime = elapsedTime + endTime - startTime;
    }

    public long getElapsedTime() {
        if (isRunning) {
            endTime = System.currentTimeMillis();
            return elapsedTime + endTime - startTime;
        } else
            return elapsedTime;
    }

    public void reset() {
        elapsedTime = 0;
        isRunning = false;
    }
}
