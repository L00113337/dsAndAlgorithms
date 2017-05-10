package ie.stanley.Lab1.algorithms;

import ie.stanley.Lab1.timer.StopWatch;

/**
 * Created by stanley nyadzayo on 24/01/17.
 * L00113337
 * Cloud and Green
 * Semester 5
 */
public class EnhancedBubbleSort {
    public static long[] bubbleSort(long arr[]) {
        long comparisons = 0;
        long swaps = 0;
        int i;
        boolean flag = true;
        long temp;
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        while (flag) {
            flag = false;

            for (i = 0; i < arr.length - 1; i++) {
                comparisons++;
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    flag = true;
                    swaps++;
                }
            }

        }

        stopWatch.stop();
        System.out.println("Enhanced Ascending time: " + stopWatch.getElapsedTime() + " milli seconds" +"\tAscending sorted swaps: " + swaps + "\tAscending comparisons: " + comparisons);
        stopWatch.reset();

        return arr;
    }

    public static long[] dBubbleSort(long arr[]) {
        long dComparisons = 0;
        long dSwaps = 0;
        boolean flag = true;
        while (flag) {
            flag = false;

            StopWatch stopWatch = new StopWatch();
            stopWatch.start();
            for (int i = 0; i < arr.length - 1; i++) {
                dComparisons++;
                if (arr[i] < arr[i + 1]) {
                    long temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    dSwaps++;
                }

            }
            stopWatch.stop();
            System.out.println("Enhanced descending time: " + stopWatch.getElapsedTime() + " milli seconds" +"\tdescending sorted swaps: " + dSwaps + "\tdescending comparisons: " + dComparisons);
            stopWatch.reset();

        }
        return arr;
    }
}