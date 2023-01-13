//Write a function nextPerfectSquare that returns the first perfect square that is greater than
//        it's integer argument. A perfect square is an integer that is equal to some integer squared.
//
//        For example 16 is a perfect square because 16 = 4*4. However 15 is not a perfect square because
//        there is no integer n such that 15 = n*n.
//
//        The signature of the function is
//        int isPerfectSquare(int n)
//        Examples
//        -------------------------|--------------------------------------------------------------
//        | n                       | next perfect square                                          |
//        |-------------------------|--------------------------------------------------------------|
//        | 6                       | 9                                                            |
//        |-------------------------|--------------------------------------------------------------|
//        | 36                      | 49                                                           |
//        |-------------------------|--------------------------------------------------------------|
//        | 0                       | 1                                                            |
//        |-------------------------|--------------------------------------------------------------|
//        | -5                      | 0                                                            |
//        -------------------------|--------------------------------------------------------------
public class NextPerfectSquare {

    public static void main(String[] args){
        NextPerfectSquare nps =  new NextPerfectSquare();
        System.out.println(nps.nextPerfectSquare(12431));
    }

    public int nextPerfectSquare(int number){
        double sqrt = 0;
        double floor = 1;

        number = number+1;

        while((sqrt - floor) != 0){
            sqrt = Math.sqrt(number);
            floor = Math.floor(sqrt);
            number++;
        }

        return (int) floor;
    }
}
