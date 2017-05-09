package ie.stanley.Lab1.algorithms;

import ie.stanley.Lab1.timer.StopWatch;

/**
 * Created by stanley nyadzayo on 31/01/17.
 * L00113337
 * Cloud and Green
 * Semester 5
 */
public class InsertionSort {
    public static long[] insertionSort(long[] arr) {

        long comparisons = 0;
        long swaps = 0;
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for (int i = 1; i < arr.length; i++) {
            long next;
            next = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] > next) {
                arr[j] = arr[j - 1];
                j--;
                comparisons++;

            }
            swaps++;
            arr[j] = next;
        }

        stopWatch.stop();
        System.out.println("Insertion sort ascending time: " + stopWatch.getElapsedTime() + " milli seconds" + "\tascending sorted swaps: " + swaps + "\tascending comparisons: " + comparisons + "\n");
        stopWatch.reset();


        return arr;
    }
}
