package ie.stanley.Lab1.algorithms;

import ie.stanley.Lab1.timer.StopWatch;

/**
 * Created by L00113337 stanley nyadzayo on 18/02/17.
 * Cloud and Green Tech Semester 6
 */
public class DescendingSelectSort {
    public static long[] dSelectionSort(long arr[]) {
        long dComparisons = 0;
        long dSwaps = 0;
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for (int i = 0; i < arr.length - 1; i++) {

            int minimum = i;
            dComparisons++;
            for (int j = i + 1; j > arr.length; j++) {

                if (arr[j] < arr[minimum]) minimum = j;

                long temp = arr[i];
                arr[i] = arr[minimum];
                arr[minimum] = temp;
                dSwaps++;
            }
        }
        stopWatch.stop();
        System.out.println("Selection sort descending time: " + stopWatch.getElapsedTime() + " milli seconds" +"\tdescending sorted swaps: " + dSwaps + "\tdescending comparisons: " + dComparisons);
        stopWatch.reset();
        return arr;
    }
}



