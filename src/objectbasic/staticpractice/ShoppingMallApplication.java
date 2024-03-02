package objectbasic.staticpractice;

public class ShoppingMallApplication {

    public static void main(String[] args) {

        Door d1 = new Door("Door 1");
        Door d2 = new Door("Door 2");
        Door d3 = new Door("Door 3");
        Door d4 = new Door("Door 4");

        d1.personEntered();
        d2.personEntered();
        d2.personEntered();
        d2.personEntered();

        d3.personExited();
        d4.personExited();
        d3.personExited();
        d4.personExited();

//        System.out.println("Door 1 count : " + d1.getCount());
//        System.out.println("Door 2 count : " + d2.getCount());
//        System.out.println("Door 3 count : " + d3.getCount());
//        System.out.println("Door 4 count : " + d4.getCount());

        System.out.println("The number of person still inside : " + Door.getCount());

    }
}
