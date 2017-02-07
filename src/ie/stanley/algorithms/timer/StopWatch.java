package ie.stanley.algorithms.timer;

/**
 * Created by stanley nyadzayo on 31/01/17.
 * L00113337
 * Cloud and Green
 * Semester 5
 */
public class StopWatch {
    private long elapsedTime;
    private long startTime;
    private boolean isRunning;

    public StopWatch() {
        reset();
    }

    public void start() {
        if (isRunning)
            return;
        isRunning = true;
        startTime = System.nanoTime();
    }

    public void stop() {
        if (!isRunning)
            return;
        isRunning = false;
        long endTime = System.nanoTime();
        elapsedTime = elapsedTime + endTime - startTime;
    }

    public long getElapsedTime() {
        if (isRunning) {
            long endTime = System.nanoTime();
            return elapsedTime + endTime - startTime;
        } else
            return elapsedTime;
    }

    public void reset() {
        elapsedTime = 0;
        isRunning = false;
    }
}
