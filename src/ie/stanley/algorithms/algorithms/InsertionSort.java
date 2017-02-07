package ie.stanley.algorithms.algorithms;

import ie.stanley.algorithms.timer.StopWatch;

/**
 * Created by stanley nyadzayo on 31/01/17.
 * L00113337
 * Cloud and Green
 * Semester 5
 */
public class InsertionSort {
    public static int[] insertionSort(int[] arr) {
        StopWatch stopWatch = new StopWatch();
        for (int i = 1; i < arr.length; i++) {
            stopWatch.start();
            int index = arr[i];
            int j = i - 1;
            // Search through the array until a smaller element if found
            while (j > 0 && arr[j] > index) {
                arr[j + 1] = arr[j]; // move other elements to create space for insertion
                j--;
                stopWatch.stop();
            }
            System.out.println("\ntime: " + stopWatch.getElapsedTime() + " nano seconds");
            stopWatch.reset();
            return arr;
//            arr[j+1] = index;
        }
        return arr;
    }
}
