package objectbasic.inheritance;

import java.util.List;

public class Manager extends Person{

    private String department;
    private String position;
    private double bonus;
    private List<Employee> tree;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public List<Employee> getTree() {
        return tree;
    }

    public void setTree(List<Employee> tree) {
        this.tree = tree;
    }
}
