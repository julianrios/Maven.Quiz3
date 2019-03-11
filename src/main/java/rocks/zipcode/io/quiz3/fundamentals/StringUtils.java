package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        char[] array = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if(i == indexToCapitalize) {
                sb.append(Character.toUpperCase(array[indexToCapitalize]));
            } else {
                sb.append(array[i]);
            }
        }

        return sb.toString();

    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        char[] array = baseString.toCharArray();
        if(array[indexOfString] == characterToCheckFor) {
                return true;
        }
        return false;
    }

    public static String[] getAllSubStrings(String string) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i+1; j <= string.length(); j++) {
                list.add(string.substring(i,j));
            }
        }
        String[] stringArray = list.toArray(new String[0]);
        return stringArray;
    }

    public static Integer getNumberOfSubStrings(String input){
        return getAllSubStrings(input).length-1;
    }
}
