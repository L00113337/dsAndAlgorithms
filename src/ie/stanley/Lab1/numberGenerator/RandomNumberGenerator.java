package ie.stanley.Lab1.numberGenerator;

import java.util.Random;

/**
 * Created by L00113337 stanley nyadzayo  on 04/02/17.
 * Edited on 07/02/2017
 */
public final class RandomNumberGenerator {
    public static long[] gen(long[] array) {
        Random ran = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = ran.nextInt(9);
        }
        return array;
    }
}
