package objectbasic.predefinedclass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class DatePractice {

    public static void main(String[] args) {

//        Date currentDate = new Date();
//        System.out.println("Current Date : " + currentDate);
//
//        Date birthDate = new Date(1993 - 1900, Calendar.DECEMBER, 7);
//        System.out.println(birthDate);
//
//        Date joiningDate = new Date("Sat, 12 Aug 1995 13:30:00 GMT");
//        System.out.println(joiningDate);


//        LocalDate currentDate =  LocalDate.now();
//        System.out.println(currentDate);
//
//        currentDate.plusDays(54);



//        LocalDateTime currentDateTime = LocalDateTime.now();
//        System.out.println(currentDateTime);
//
//        LocalDate birthDate =  LocalDate.of(1993, Month.DECEMBER, 7);
//        System.out.println(birthDate);


//        // Conversion of format to EEE dd MMM
//        String time1 =  "2024-02-28";
//        String time2 =  "02-28-2024";
//        String time3 = "2024/02/28";

        LocalDate convertedDate = LocalDate.parse("2024-02-29");
        System.out.println(convertedDate);
        LocalDate addedDate = convertedDate.plusDays(65);
        System.out.println(addedDate);

        String name = "Taman";
        name = "ABC";

    }
}
