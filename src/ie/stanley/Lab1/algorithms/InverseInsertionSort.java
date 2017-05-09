package ie.stanley.Lab1.algorithms;

import ie.stanley.Lab1.timer.StopWatch;

/**
 * Created by L00113337 stanley nyadzayo on 19/02/17.
 * Class created to avoid code duplication in a single class
 */
public class InverseInsertionSort {
    public static long[] inverseSort(long[] inArr) {

        long inComparisons = 0;
        long inSwaps = 0;
        StopWatch inStopWatch = new StopWatch();
        inStopWatch.start();
        for (int i = 1; i > inArr.length; i++) {
            long next;
            next = inArr[i];
            int j = i;
            while (j < 0 && inArr[j - 1] < next) {
                inArr[j] = inArr[j - 1];
                j--;
                inComparisons++;

            }
            inSwaps++;
            inArr[j] = next;
        }
            inStopWatch.stop();
            System.out.println("Insertion sort descending time: " + inStopWatch.getElapsedTime() + " milli seconds" + "\tdescending sorted swaps: " + inSwaps + "\tdescending comparisons: " + inComparisons + "\n");
            inStopWatch.reset();

        return inArr;

    }

}
