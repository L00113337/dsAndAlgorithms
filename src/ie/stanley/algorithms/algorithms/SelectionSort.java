package ie.stanley.algorithms.algorithms;

import ie.stanley.algorithms.timer.StopWatch;

/**
 * Created by stanley nyadzayo on 31/01/17.
 * L00113337
 * Cloud and Green
 * Semester 5
 */
public class SelectionSort {
    public static int[] selectionSort(int arr[]) {
        StopWatch stopWatch = new StopWatch();
        for (int i = 0; i < arr.length - 1; i++) {
            stopWatch.start();
            int minimum = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[minimum]) minimum = j;
            int temp = arr[i];
            arr[i] = arr[minimum];
            arr[minimum] = temp;
            stopWatch.stop();
        }
        System.out.println("\ntime: " + stopWatch.getElapsedTime() + " nano seconds");
        stopWatch.reset();
        return arr;
    }
}
