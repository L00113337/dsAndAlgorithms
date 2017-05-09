package ie.stanley.Lab1.algorithms;

import ie.stanley.Lab1.timer.StopWatch;

/**
 * Created by stanley nyadzayo on 31/01/17.
 * L00113337
 * Cloud and Green
 * Semester 5
 */
public class SelectionSort {
    public static long[] selectionSort(long arr[]) {
        long comparisons = 0;
        long swaps = 0;
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for (long i = 0; i < arr.length - 1; i++) {

            long minimum = i;
            comparisons++;
            for (long j = i + 1; j < arr.length; j++) {

                if (arr[(int) j] < arr[(int) minimum]) minimum = j;

                long temp = arr[(int)i];
                arr[(int) i] = arr[(int) minimum];
                arr[(int) minimum] = temp;
                swaps++;
            }
        }
        stopWatch.stop();
        System.out.println("Selection Ascending time: " + stopWatch.getElapsedTime() + " milli seconds" +"\tAscending sorted swaps: " + swaps + "\tAscending comparisons: " + comparisons);
        stopWatch.reset();
        return arr;
    }



}

