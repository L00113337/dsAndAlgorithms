package ie.stanley.Lab1.application;

import ie.stanley.Lab1.algorithms.*;
import ie.stanley.Lab1.numberGenerator.RandomNumberGenerator;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by L00113337 stanley nyadzayo on 11/02/17.
 * Algorithms and Data Structures
 */
public class AlgorithmsApplication {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please select the number of elements for your array");
        //allow user to determine the number of elements
        long arrNum = 0;
        try {
            arrNum = scanner.nextLong();
        } catch (InputMismatchException e) {
            System.out.print("Your selection must be a long!\n");
            System.out.print("Please restart your analysis.");
            System.exit(0);

        }

        long[] array; //Array size will be determined by the user
        array = new long[(int) arrNum];

        //Generate an array of the selected length
        array = RandomNumberGenerator.gen(array);
        long algo = 0;
        do {
            System.out.println("---------------------------------------------------------------------------------------------------------------");
            System.out.println("Select a Sorting algorithm :\n" + "\t1.Bubble Sort\n" + "\t2.Enhanced Bubble Sort\n" + "\t3.Selection Sort\n" + "\t4.Insertion Sort\n" + "\t5.Quit\n" + "\nEnter: ");
            {
                try {
                    algo = scanner.nextLong();
                } catch (InputMismatchException e) {
                    System.out.print("Your selection must be an integer! Try again");
                    System.exit(0);

                }

                switch ((int) algo) {
                    case 1:
                        System.out.println("\nBubble Sort in Ascending order\n");
                        long[] bsArray = BubbleSort.oBubbleSort(copyArray(array));


                        System.out.println("\nBubble Sort inverse order\n");
                        bsArray = BubbleSort.dBubbleSort(copyArray(array));
                        //System.out.println("\n" + Arrays.toString(bsArray) +"\n"); not required for large data sets
                        break;
                    case 2:
                        System.out.println("\nEnhanced Bubble sort in Ascending order\n");
                        long[] ehArray = EnhancedBubbleSort.bubbleSort(copyArray(array));

                        System.out.println("\nEnhanced Bubble sort inverse order\n");
                        ehArray = EnhancedBubbleSort.dBubbleSort(copyArray(array));
                        System.out.println("\n");
                        break;
                    case 3:
                        System.out.println("\nSelection sort Ascending order\n");
                        long[] selectArr = SelectionSort.selectionSort(copyArray(array));

                        System.out.println("\nSelection Sort inverse order\n");
                        selectArr = DescendingSelectSort.dSelectionSort(copyArray(array));
                        System.out.println("\n");
                        break;
                    case 4:
                        System.out.println("\nInsertion Sort in ascending order\n");
                        long[] inArray = InsertionSort.insertionSort(copyArray(array));

                        System.out.println("Insertion Sort inverse order\n");
                        inArray = InverseInsertionSort.inverseSort(copyArray(array));
                        System.out.println("\n");
                        break;
                    case 5:
                        System.out.println("You have completed this analysis.");
                }
            }
        } while (algo != 5);
    }

    private static long[] copyArray(long[] array) {
        long[] newArray = new long[array.length];
        System.arraycopy(array, 0, newArray, 0, array.length);
        return newArray;
    }
}

