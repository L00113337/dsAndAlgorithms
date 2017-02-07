package ie.stanley.algorithms.numberGenerators;

import java.util.Random;

/**
 * Created by L00113337 stanley nyadzayo  on 04/02/17.
 * Edited on 07/02/2017
 */
public final class RandomNumberGenerator {
    //    public static final void main(String [] args) {
//        log("Generating random numbers in range 0 to 999");
//        for (int 1 = 0; i <)
    public static int[] gen(int[] array) {
        Random ran = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = ran.nextInt(9);
        }
        return array;
    }
}
