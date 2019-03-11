package rocks.zipcode.io.quiz3.arrays;

import rocks.zipcode.io.quiz3.fundamentals.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        str = str.toLowerCase();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(StringUtils.capitalizeNthCharacter(str, i));
        }
        String[] stringArray = list.toArray(new String[0]);
        return stringArray;
    }
}
