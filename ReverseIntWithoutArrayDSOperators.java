//        Write a function to reverse an integer using numeric operators and without
//        using any arrays or other data structures.
//
//        The signature of the function is:
//        int f(int n)
//        Examples
//
//        --------------------------------|--------------------------------------------------------------
//        | if the input integer is        | return                                                       |
//        |--------------------------------|--------------------------------------------------------------|
//        | 1234                           | 4321                                                         |
//        |--------------------------------|--------------------------------------------------------------|
//        | 12005                          | 50021                                                        |
//        |--------------------------------|--------------------------------------------------------------|
//        | 1                              | 1                                                            |
//        |--------------------------------|--------------------------------------------------------------|
//        | 1000                           | 1                                                            |
//        |--------------------------------|--------------------------------------------------------------|
//        | 0                              | 0                                                            |
//        |--------------------------------|--------------------------------------------------------------|
//        | -12345                         | -54321                                                       |
//        --------------------------------|--------------------------------------------------------------

public class ReverseIntWithoutArrayDSOperators {


    public static void main(String[] args) {
        ReverseIntWithoutArrayDSOperators ri = new ReverseIntWithoutArrayDSOperators();
        System.out.println(ri.reverse(-123));
    }


    public int reverse(int number) {
        String numChar = Integer.toString(number);

        StringBuilder sb = new StringBuilder();

        boolean isNegative = numChar.charAt(0) == '-';

        for (int i = numChar.length() - 1; i >= 0; i--) {
            if (!(isNegative && i == 0)) {
                sb.append(numChar.charAt(i));
            }
        }

        return Integer.parseInt((isNegative ? "-" : "") + sb.toString());

//        int rev = 0;
//
//        while (number < 0) {
//            rev <<= 1;
//            if ((number & 1) == 1) {
//                rev ^= 1;
//            }
//            number >>= 1;
//        }
//
//        return rev;
    }
}
