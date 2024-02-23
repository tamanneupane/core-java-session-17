package objectbasic.polymorphism;

import objectbasic.inheritance.Manager;

public class CalculatorApplication {

    // Compile Time Polymorphism

    public static void main(String[] args) {

        int a, b;
        float c, d;
        double e, f;

        a = 5;
        b = 10;

        add(a,b);

        a = 4;
        b = 12;

        add(a,b);

        c = 3.0f;
        d = 27.0f;

        add(c,d);

        e = 2.0;
        f = 3.0;

        add(e,f);
    }

    // Function Overloading

    public static void add(int a, int b){
        int sum = a + b;
        System.out.println("Sum of " + a + " and " + b + " : " + sum);
    }

    public static void add(float a, float b){
        float sum = a + b;
        System.out.println("Sum of " + a + " and " + b + " : " + sum);
    }

    public static void add(double a, double b){
        double sum = a + b;
        System.out.println("Sum of " + a + " and " + b + " : " + sum);
    }
}
