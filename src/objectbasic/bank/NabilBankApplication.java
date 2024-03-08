package objectbasic.bank;

import java.util.ArrayList;
import java.util.EnumSet;

public class NabilBankApplication {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        //bankAccount.accountNumber = "1213123";
        bankAccount.transfer();

        NabilBankApplication nabilBankApplication = new NabilBankApplication();
        nabilBankApplication.someFunction();

        // Some other codes

        User user1 =  new User(1, "taman",  Constants.MALE  , "password");

        EnumSet<Gender> genderList1 = EnumSet.allOf(Gender.class);
        System.out.println(genderList1);

        ArrayList<String> genderList2 = new ArrayList<>();
        genderList2.add(Constants.MALE);
        genderList2.add(Constants.FEMALE);
        genderList2.add(Constants.OTHER);

        System.out.println(genderList2);

    }

    public void  someFunction()
    {
        User user1 =  new User(1, "taman",  Constants.MALE  , "password");
    }
}
