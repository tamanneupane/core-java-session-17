package objectbasic.himalayantimes;

import objectbasic.himalayantimes.Category;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Objects;

public class HimalayanTimesApplication {


    public static void main(String[] args) {

        Category kathmandu = new Category();
        kathmandu.setCategoryId(1);
        kathmandu.setCategoryName("Kathmandu");
        kathmandu.setOrder(1);
        kathmandu.setDeleted(false);
        kathmandu.setDisabled(false);
        kathmandu.setCreatedAt("2024-02-01");
        kathmandu.setUpdatedAt("2024-02-01");

        System.out.println(kathmandu);

        kathmandu.setCategoryName("Kathmandu Nepal");
//
//        System.out.println(kathmandu);
//
//        ImmutableCategory immutableCategory = new ImmutableCategory(2, "Sports", false, 2, false, "2024-02-29", "2024-02-29");
//
//        System.out.println(immutableCategory);
//
//        ImmutableCategory updatedCategory = immutableCategory.setCategoryName("Political");
//
//        System.out.println(updatedCategory);


        Category nepal = new Category(2, "Nepal");
        nepal.setCategoryId(2);
//        nepal.categoryName = "Nepal";
//        nepal.order = 2;
//        nepal.isDeleted = false;
//        nepal.isDisabled = false;
//        nepal.createdAt = "2024-02-17";
//        nepal.updatedAt = "2024-02-17";
        System.out.println(nepal);

        Category international = new Category();
        //System.out.println(international.getCreatedAt());
        LocalDate createdDate = LocalDate.parse(international.getCreatedAt());
        LocalDate newCreatedDate = createdDate.plusDays(5);
        System.out.println(newCreatedDate);

        Category sports = new Category();
        LocalDate createdDateSport = LocalDate.parse(sports.getCreatedAt());
        createdDateSport.plusDays(5);

        LocalDate currentDate =  LocalDate.now();

        currentDate.plusDays(5);








    }
}
