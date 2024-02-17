package objectbasic.himalayantimes;

public class HimalayanTimesApplication {

    public static void main(String[] args) {

        Category kathmandu = new Category();
        kathmandu.categoryId = 1;
        kathmandu.categoryName = "Kathmandu";
        kathmandu.order = 1;
        kathmandu.isDeleted = false;
        kathmandu.isDisabled = false;
        kathmandu.createdAt = "2024-02-01";
        kathmandu.updatedAt = "2024-02-01";
        System.out.println(kathmandu);

        Category nepal = new Category();
        nepal.categoryId = 2;
        nepal.categoryName = "Nepal";
        nepal.order = 2;
        nepal.isDeleted = false;
        nepal.isDisabled = false;
        nepal.createdAt = "2024-02-17";
        nepal.updatedAt = "2024-02-17";
        System.out.println(nepal);

    }
}
