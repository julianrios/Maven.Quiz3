package rocks.zipcode.io.quiz3.generics;

import java.util.function.Function;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        return findEvenOccurringValue();
    }

    public SomeType findEvenOccurringValue() {
        SomeType common = array[0];
        int commonCount = getNumberOfOccurrences(array, common);

        for (SomeType currentObject : array) {
            int currentCount = getNumberOfOccurrences(array, currentObject);

            if (currentCount > commonCount) {
                common = currentObject;
                commonCount = currentCount;
            }
        }
        return common;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        Integer count = 0;
        for(Object number : array) {
            if(number.equals(valueToEvaluate)) {
                count++;
            }
        }
        return count;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        return null;
    }

    public Integer getNumberOfOccurrences(SomeType[] array, SomeType objectToCount) {
        Integer count = 0;
        for(Object number : array) {
            if(number.equals(objectToCount)) {
                count++;
            }
        }
        return count;
    }
}
