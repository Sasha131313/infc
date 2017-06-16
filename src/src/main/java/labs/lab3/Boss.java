package src.main.java.labs.lab3;


public class Boss extends Employee {
    private final int weekSalary = 5000;

    @Override
    public String toString() {
        return super.toString () +
                "weekSalary=" + weekSalary + "} ";
    }

    public Boss(String name, String surname) {
        super ( name, surname );
    }

    @Override
    public int countSalary() {
        return 5000 * 4;
    }
}
