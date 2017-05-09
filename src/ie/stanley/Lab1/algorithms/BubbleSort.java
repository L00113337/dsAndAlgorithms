package ie.stanley.Lab1.algorithms;
import ie.stanley.Lab1.timer.StopWatch;

/**
 * Created by L00113337 stanley nyadzayo on 07/02/17.
 * This is the most inefficient sorting algorithm
 */
public class BubbleSort {

    public static long[] oBubbleSort(long arr[]) {
        long comparisons = 0;
        long swaps = 0;
        long temp;
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                comparisons++;
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                }
            }
        }
        stopWatch.stop();
        System.out.println("Ascending time: " + stopWatch.getElapsedTime() + " milli seconds" +"\tAscending sorted swaps: " + swaps + "\tAscending comparisons: " + comparisons);
        return arr;
    }
    public static long[] dBubbleSort(long arr[]) {
        long dComparisons = 0;
        long dSwaps = 0;

        long temp;
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                dComparisons++;
                if (arr[j] < arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    dSwaps++;
                }
            }
        }
        stopWatch.stop();
        System.out.println("Descending time: " + stopWatch.getElapsedTime() + " milli seconds" +"\tDescending sorted swaps: " + dSwaps + "\tDescending comparisons: " + dComparisons);
        stopWatch.reset();
        return arr;
    }
}