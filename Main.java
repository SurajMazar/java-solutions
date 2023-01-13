import java.util.Arrays;

class Main{
    public static void main(String[] args) {
        Main main =  new Main();
        String bool = main.reverse("test");
        System.out.println(bool);
    }


    public String reverse(String string){
        int strlen = string.length();

        char[] orgArray = string.toCharArray();

        StringBuilder revArray = new StringBuilder();

        for (int i = strlen-1; i >= 0; i--){
            revArray.append(orgArray[i]);
        }
         return revArray.toString();
    }


    public void swapNumberNoNewVariable(){
        int a = 10;
        int b = 5;

        System.out.printf("%d, is a and %d, is b \n", a, b);

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.printf("%d, is a and %d, is b", a, b);

    }


    public boolean hasVowel(String string){
        char[] stringArray = string.toCharArray();
        char[] vowels = {'a','e','i','o','u'};

        Arrays.sort(stringArray);

        for(int i = 0 ; i<vowels.length; i++){
            int index = Arrays.binarySearch(stringArray,vowels[i]);

            boolean bool = index >= 0;

            if(bool){
                return true;
            }
        }

        return false;

    }
}