package rocks.zipcode.io.quiz3.arrays;

import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class SquareArrayAnalyzer {
    public static Boolean compare(Integer[] input, Integer[] squaredValues) {
        squareNumber(input);

        Arrays.sort(input);
        Arrays.sort(squaredValues);
//        System.out.println(Arrays.toString(input));
        System.out.println(Arrays.toString(squaredValues));

        Boolean equal;
        Integer num =0;

        for (int i = 0; i < input.length; i++) {
            num = Integer.compare(input[i], squaredValues[i]);
        }
        if(num == 0) {
            equal = true;
        } else {
            equal = false;
        }
        return equal;

    }

    private static void squareNumber(Integer[] input) {
        Integer index = 0;
        for(Integer number : input) {
            input[index] =  (int)Math.sqrt(number);
            index++;
        }
        System.out.println(Arrays.toString(input));
    }
}
