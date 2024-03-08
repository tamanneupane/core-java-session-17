package objectbasic.bank;

public enum Gender {

    MALE("M") , FEMALE("F"), OTHERS("O");

    Gender(String abbv){
        System.out.println("Abbv value is " + abbv);
    }
}
