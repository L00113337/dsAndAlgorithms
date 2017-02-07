package ie.stanley.algorithms.algorithms;

import ie.stanley.algorithms.timer.StopWatch;

/**
 * Created by L00113337 stanley nyadzayo on 07/02/17.
 * This is the most inefficient sorting algorithm
 */
public class OrdinaryBubbleSort {

    public static int[] oBubbleSort(int arr[]) {
        int i;
        int temp;
        StopWatch stopWatch = new StopWatch();
        {
            stopWatch.start();

            for (i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                }
            }
            stopWatch.stop();
        }
        System.out.println("\ntime: " + stopWatch.getElapsedTime() + " nano seconds");
        stopWatch.reset();

        return arr;
    }
}

