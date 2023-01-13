import java.util.Arrays;

//        Write a function that accepts a character array, a zero-based start position and
//        a length. It should return a character array containing lengthCharacters starting with
//        the startCharacter of the input array. The function should do error checking on the start
//        position and the length and return null if the either value is not legal.
//
//        The function signature is:
//        char[] f(char[] a, int start, int len)
//
//        --------------------------------|--------------------------------------------------------------
//        | if the input parameters are is | return                                                       |
//        |--------------------------------|--------------------------------------------------------------|
//        | {'a','b','c'}, 0, 4            | null                                                         |
//        |--------------------------------|--------------------------------------------------------------|
//        | {'a','b','c'}, 0, 3            | {'a','b','c'}                                                |
//        |--------------------------------|--------------------------------------------------------------|
//        | {'a','b','c'}, 0, 2            | {'a','b'}                                                    |
//        |--------------------------------|--------------------------------------------------------------|
//        | {'a','b','c'}, 0, 1            | {'a'}                                                        |
//        |--------------------------------|--------------------------------------------------------------|
//        | {'a','b','c'}, 1, 3            | null                                                         |
//        |--------------------------------|--------------------------------------------------------------|
//        | {'a','b','c'}, 1, 2            | {'b','c'}                                                    |
//        |--------------------------------|--------------------------------------------------------------|
//        | {'a','b','c'}, 1, 1            | {'b'}                                                        |
//        |--------------------------------|--------------------------------------------------------------|
//        | {'a','b','c'}, 2, 2            | null                                                         |
//        |--------------------------------|--------------------------------------------------------------|
//        | {'a','b','c'}, 2, 1            | {'c'}                                                        |
//        |--------------------------------|--------------------------------------------------------------|
//        | {'a','b','c'}, 3, 1            | null                                                         |
//        |--------------------------------|--------------------------------------------------------------|
//        | {'a','b','c'}, 1, 0            | {}                                                           |
//        |--------------------------------|--------------------------------------------------------------|
//        | {'a','b','c'}, -1, 2           | null                                                         |
//        |--------------------------------|--------------------------------------------------------------|
//        | {'a','b','c'}, -1, -2          | null                                                         |
//        |--------------------------------|--------------------------------------------------------------|
//        | {}, 0, 1                       | null                                                         |
//        -----------------------------------------------------------------------------------------------
//
//        NOTE: To ease debugging, i will return string containing the characters
public class CharIndexLength {
    public static void main(String[] args) {
        CharIndexLength cil = new CharIndexLength();
        char[] test1 = {'a', 'b', 'c'};
        char[] test2 = {};

        char[] ans1 = {'a', 'b', 'c'};
        char[] ans2 = {'a', 'b'};
        char[] ans3 = {'a'};
        char[] ans4 = {'b', 'c'};
        char[] ans5 = {'b'};
        char[] ans6 = {'c'};
        char[] ans7 = {};


        boolean test1R = cil.charsViaIndexLength(test1, 0, 4) == null;
        boolean test2R = Arrays.equals(cil.charsViaIndexLength(test1, 0, 3), ans1);
        boolean test3R = Arrays.equals(cil.charsViaIndexLength(test1, 0, 2), ans2);
        boolean test4R = Arrays.equals(cil.charsViaIndexLength(test1, 0, 1), ans3);
        boolean test5R = cil.charsViaIndexLength(test1, 1, 3) == null;
        boolean test6R = Arrays.equals(cil.charsViaIndexLength(test1, 1, 2), ans4);
        boolean test7R = Arrays.equals(cil.charsViaIndexLength(test1, 1, 1), ans5);
        boolean test8R = cil.charsViaIndexLength(test1, 2, 2) == null;
        boolean test9R = Arrays.equals(cil.charsViaIndexLength(test1, 2, 1), ans6);
        boolean test10R = cil.charsViaIndexLength(test1, 3, 1) == null;
        boolean test11R = Arrays.equals(cil.charsViaIndexLength(test1, 1, 0), ans7);
        boolean test12R = cil.charsViaIndexLength(test1, -1, 2) == null;
        boolean test13R = cil.charsViaIndexLength(test1, -1, -2) == null;
        boolean test14R = cil.charsViaIndexLength(test2, 0, 1) == null;

        System.out.println(test1R
                && test2R
                && test3R
                && test4R
                && test5R
                && test6R
                && test7R
                && test8R
                && test9R
                && test10R
                && test11R
                && test12R
                && test13R
                && test14R
        );

    }

    public char[] charsViaIndexLength(char[] charArr, int index, int length) {
        StringBuilder finalStr = new StringBuilder();
        char[] finalArr = null;

        if(index < 0 || length < 0){
            return null;
        }

        if (!(charArr.length - 1 < index)) {
            StringBuilder remainingStr = new StringBuilder();

            for (int i = 0; i < charArr.length; i++) {
                if (i >= index) {
                    remainingStr.append(charArr[i]);
                }
            }

            char[] remainingCharArr = remainingStr.toString().toCharArray();
            if (remainingCharArr.length >= length) {
                for (int j = 0; j < length; j++) {
                    finalStr.append(remainingCharArr[j]);
                }
            }
        }

        if (length == 0 || finalStr.length() != 0) {
            finalArr = finalStr.toString().toCharArray();
        }

        return finalArr;
    }


}
