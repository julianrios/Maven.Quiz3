package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        return word.matches("[AEIOUaeiou]+");
    }

    public static Integer getIndexOfFirstVowel(String word) {
        Integer counter = 0;
        for (Character character : word.toCharArray()) {

            if(isVowel(character)) {
                return counter;
            } else {
                counter++;
            }
        }
        return null;
    }


    public static Boolean startsWithVowel(String word) {
        return isVowel(word.charAt(0));
    }

    public static Boolean isVowel(Character character) {
        return hasVowels(character.toString());
    }
}
