//Question 2
//        Write a function that takes an array of integers as an argument and returns a
//        value based on the sums of the even and odd numbers in the array. Let X = the sum of the odd
//        numbers in the array and let Y = the sum of the even numbers. The function should return X - Y
//        The signature of the function is:
//        int f(int[] a)
//        Examples:
//        -----------------------|-----------------------------------------------------------------------
//        | if input array is     | return                                                                |
//        |-----------------------|-----------------------------------------------------------------------|
//        | {1}                   | 1                                                                     |
//        |-----------------------|-----------------------------------------------------------------------|
//        | {1,2}                 | -1                                                                    |
//        |-----------------------|-----------------------------------------------------------------------|
//        | {1,2,3}               | 2                                                                     |
//        |-----------------------|-----------------------------------------------------------------------|
//        | {1,2,3,4}             | -2                                                                    |
//        |-----------------------|-----------------------------------------------------------------------|
//        | {3,3,4,4}             | -2                                                                    |
//        |-----------------------|-----------------------------------------------------------------------|
//        | {}                    | 0                                                                     |
//        -----------------------------------------------------------------------------------------------


public class SumEvenOdd {
    public static void main(String[] args) {

        SumEvenOdd seo = new SumEvenOdd();
        int[] test1 = {1};
        int[] test2 = {1, 2};
        int[] test3 = {1, 2, 3};
        int[] test4 = {1, 2, 3, 4};
        int[] test5 = {3, 3, 4, 4};
        int[] test6 = {};

        boolean test1R = seo.getSumEvenOdd(test1) == 1;
        boolean test2R = seo.getSumEvenOdd(test2) == -1;
        boolean test3R = seo.getSumEvenOdd(test3) == 2;
        boolean test4R = seo.getSumEvenOdd(test4) == -2;
        boolean test5R = seo.getSumEvenOdd(test5) == -2;
        boolean test6R = seo.getSumEvenOdd(test6) == 0;

        System.out.println((test1R && test2R && test3R && test4R && test5R && test6R) ? "Pass":"Fail");
    }

    public int getSumEvenOdd(int[] intArr) {
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] % 2 == 0) {
                sumEven += intArr[i];
            } else {
                sumOdd += intArr[i];
            }
        }

        return sumOdd - sumEven;
    }
}
