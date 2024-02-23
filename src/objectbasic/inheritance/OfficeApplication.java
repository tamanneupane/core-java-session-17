package objectbasic.inheritance;

import java.time.LocalDate;

public class OfficeApplication {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Taman");
        employee.setAddress("Kathmandu, Nepal");
        employee.setGender("Male");
        employee.setSalary(5000);
        employee.setId(1);
        employee.setJoiningDate(LocalDate.now());

        Manager manager = new Manager();
        manager.setName("ABC");
        manager.setAddress("Some address");
        manager.setGender("Male");
        manager.setSalary(8000);
        manager.setBonus(1000);

        Director director = new Director();

    }
}
