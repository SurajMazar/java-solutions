import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//An array with an odd number of elements is said to be centered
//if all elements (except the middle one) are strictly greater than the value
//of the middle element. Note that only arrays with an odd number of elements
//have a middle element. Write a function that accepts an integer array and
//returns 1 if it is a centered array, otherwise it returns 0.
//Examples:
//-----------------------|-----------------------------------------------------------------------
//| if the input array is | return                                                                |
//|-----------------------|-----------------------------------------------------------------------|
//| {1,2,3,4,5}           | 0 (the middle element 3 is not strictly less than all other elements) |
//|-----------------------|-----------------------------------------------------------------------|
//| {3,2,1,4,5}           | 1 (the middle element 1 is strictly less than all other elements)     |
//|-----------------------|-----------------------------------------------------------------------|
//| {3,2,1,4,1}           | 0 (the middle element 1 is not strictly less than all other elements) |
//|-----------------------|-----------------------------------------------------------------------|
//| {1,2,3,4}             | 0 (no middle element)                                                 |
//|-----------------------|-----------------------------------------------------------------------|
//| {}                    | 0 (no middle element)                                                 |
//|-----------------------|-----------------------------------------------------------------------|
//| {10}                  | 1 (the middle element 10 is strictly less than all other elements)    |
//-----------------------------------------------------------------------------------------------
public class IsCentered {
    public static void main(String[] args) {
        IsCentered ic = new IsCentered();

        int[] test1 = {1, 2, 3, 4, 5};
        int[] test2 = {3, 2, 1, 4, 5};
        int[] test3 = {3, 2, 1, 4, 1};
        int[] test4 = {1, 2, 3, 4};
        int[] test5 = {};
        int[] test6 = {10};

        boolean test1R = ic.isCentered(test1) == 0;
        boolean test2R = ic.isCentered(test2) == 1;
        boolean test3R = ic.isCentered(test3) == 0;
        boolean test4R = ic.isCentered(test4) == 0;
        boolean test5R = ic.isCentered(test5) == 0;
        boolean test6R = ic.isCentered(test6) == 1;

        System.out.println((test1R && test2R && test3R && test4R && test5R && test6R) ? "Pass" : "Fail");
    }

    public int isCentered(int[] intArray) {
        int value = 0;
        int arrayLength = intArray.length;

        if (arrayLength % 2 != 0) {

            int centralIndex = arrayLength / 2;
            int centralValue = intArray[centralIndex];

            intArray = this.removeIndexValue(intArray, centralIndex);

            int[] smallerValue = Arrays.stream(intArray).filter(x -> x <= centralValue).toArray();

            if (smallerValue.length == 0) {
                return 1;
            }

        }

        return value;
    }


    public int[] removeIndexValue(int[] intArr, int index) {

        List<Integer> intStack = new ArrayList<>(IntStream.of(intArr).boxed().toList());

        intStack.remove(index);

        return intStack.stream().mapToInt(Integer::intValue).toArray();
    }
}
