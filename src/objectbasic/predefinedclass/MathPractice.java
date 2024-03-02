package objectbasic.predefinedclass;

public class MathPractice {

    private MathPractice(){}

    public static void main(String[] args) {

//        Math math = new Math();

        // Convert number from negative to positive

        double positiveNumber =  Math.abs(-555.5);
        System.out.println("Positive Value : " + positiveNumber);

        // Rounding

        // floor

        double floorValue = Math.floor(5.9);
        System.out.println("Floor Value : " + floorValue);

        // ceil

        double ceilValue = Math.ceil(5.9);
        System.out.println("Ceil Value : " + ceilValue);

        // round

        long roundValue = Math.round(5.6);
        System.out.println("Round Value : " + roundValue);

        // abs
        // floor
        // ceil
        // round
        // max
        // min
        // random
        // signum
        // sqrt
    }
}
