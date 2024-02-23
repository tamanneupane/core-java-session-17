package objectbasic.himalayantimes;

import objectbasic.himalayantimes.Category;

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

//        Category nepal = new Category();
//        nepal.categoryId = 2;
//        nepal.categoryName = "Nepal";
//        nepal.order = 2;
//        nepal.isDeleted = false;
//        nepal.isDisabled = false;
//        nepal.createdAt = "2024-02-17";
//        nepal.updatedAt = "2024-02-17";
//        System.out.println(nepal);

    }
}
