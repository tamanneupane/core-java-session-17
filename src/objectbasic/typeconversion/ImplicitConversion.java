package objectbasic.typeconversion;

public class ImplicitConversion {

    public static void main(String[] args) {

        byte b = 22;

        short s = b;

        int i = s;

        long l = i;

        float f = l; // There is chance of data loss

        double d = l;


        double principal = 5000.0;
        float rate = 11.2f;
        int time = 5;

        double interest = (principal * rate * time)/100;


        float r = 1f/2;
        System.out.println(r);

        System.out.println(2.0 + "");

        String str =  "" + 2.0 + 3.0 ;
        System.out.println(str);
    }
}
