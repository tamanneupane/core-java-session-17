package objectbasic.operator;

public class RelationalOperator {

    public static void main(String[] args) {

        String name = "ABC";

        int a = 5;
        int b = 5;

        boolean isEqual = (a != b);

        boolean lessThan = a < b;

        boolean greaterThan = a > b;

        boolean lessThanOrEqualTo = a <= b; // a < b OR a == b

        boolean greaterThanOrEqualTo = a >= b; // a > b OR a == b


        boolean combinedCheck = a != b && a > b;


        float computer = 85;
        float science = 90;
        float maths = 20;
        float english = 95;
        float account = 75;

        boolean isFailed = computer < 32 || science < 32 || maths < 32 || english < 32 || account < 32;


        // percentage = add marks of all subjects / 500 * 100

        // isDistinction -> percentage >= 80
        // isFirstDivision -> percentage >= 70 AND/OR percentage < 80
        // isSecondDivision -> percentage >= 60
        // isThirdDivision -> percentage >= 40
        // isFailed -> percentage < 40


    }
}
