package objectbasic.operator;

public class IncrementAndDecrement {

    public static void main(String[] args) {

        int number = 7;

//        number = number + 1;
//        number += 1;
//        ++number;
//        number++;

        int m = 7;
        int n = 7;

        int result1 = ++m * 2;
        int result2 = n++ * 2;

        System.out.println("m : " + m); // 8
        System.out.println("n : " + n); // 8

        System.out.println("result1 : " + result1); // 16
        System.out.println("result2 : " + result2); // 14
    }
}
