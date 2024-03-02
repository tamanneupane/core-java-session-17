package objectbasic.staticpractice;

public class Door {

    private static int count;

    private String name;

    public Door(String name) {
        this.name = name;
    }

    public static int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public void personEntered(){
        this.count = this.count + 1;
    }

    public void personExited(){
        this.count = this.count - 1;
    }
}
