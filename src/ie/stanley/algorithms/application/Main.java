package ie.stanley.algorithms.application;

import ie.stanley.algorithms.algorithms.BubbleSort;
import ie.stanley.algorithms.algorithms.InsertionSort;
import ie.stanley.algorithms.algorithms.OrdinaryBubbleSort;
import ie.stanley.algorithms.algorithms.SelectionSort;
import ie.stanley.algorithms.numberGenerators.RandomNumberGenerator;


import java.util.Scanner;

/**
 * Created by L00113337 stanley nyadzayo on 04/02/17.
 * Edited on 07/02/2017
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //ask for user input
        System.out.print("Please enter the number of array elements: ");
        int arrNum = scanner.nextInt();
        int[] array; //Size determined by the response to the above lines
        array = new int[arrNum];

        //Generate an array of the selected length
        array = RandomNumberGenerator.gen(array);

        //Display the generated array before it is passed into the sorting algorithm
        for (int anArray1 : array) System.out.print(anArray1 + ", ");

        System.out.println("\nSelection sort");
        System.out.println("\n************************************************************");
        array = SelectionSort.selectionSort(array);
        for (int anArray : array) System.out.print(anArray + ", ");
        System.out.println();

        System.out.println("\nBubble sort");
        System.out.println("\n************************************************************");
        array = BubbleSort.bubbleSort(array);
        for (int anArray : array) System.out.print(anArray + ", ");
        System.out.println();

        System.out.println("\nInsertion Sort");
        System.out.println("\n************************************************************");
        array = InsertionSort.insertionSort(array);
        for (int anArray : array) System.out.print(anArray + ", ");
        System.out.println();

        System.out.println("\nOdinary Bubble Sort");
        System.out.println("\n************************************************************");
        array = OrdinaryBubbleSort.oBubbleSort(array);
        for (int anArray : array) System.out.print(anArray + ", ");
    }
}

