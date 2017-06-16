package src.main.java.labs.lab3;


public abstract class Employee implements Comparable<Employee> {
    private String name;
    private String surname;

    abstract public int countSalary();

    @Override
    public int compareTo(Employee o) {
        return countSalary () - o.countSalary ();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
