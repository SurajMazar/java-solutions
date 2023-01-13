//A fancy number is a number in the sequence 1,1,5,17,61,... Note the first two fancy numbers
//        are 1 and any fancy number other than the first two is sum of three times previous one and two times
//        the one before that. see below
//        1,
//        1,
//        3*1 + 2*1 = 5,
//        5*3 + 2*1 = 17,
//        17*3 + 5*2 = 61
//        61*3 + 17*2 = 217
//        Write a function named isFancy that returns 1, if it's integer argument is a Fancy number,
//        otherwise it returns 0.
public class IsFancyNumber {

    public static void main(String[] args){
        IsFancyNumber ifn =  new IsFancyNumber();
        System.out.println(ifn.isFancy(217));
    }
    public boolean isFancy(int number) {

        int previousFancy = 1;
        int fancy = 1;

        while (fancy < number) {
            int currentFancy = fancy;
            fancy = fancy * 3 + previousFancy * 2;
            previousFancy = currentFancy;
        }

        return fancy == number;
    }
}
