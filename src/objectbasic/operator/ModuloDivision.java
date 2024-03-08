package objectbasic.operator;

public class ModuloDivision {

    public static void main(String[] args) {

        System.out.println(4 / 2);

        System.out.println(4 % 2);

        int number = 245;

        int lastNumber = number % 10;
        number = number / 10;

        int secondNumber = number % 10;

        number = number / 10;

        int firstNumber = number % 10;

        number = number / 10;
    }
}
