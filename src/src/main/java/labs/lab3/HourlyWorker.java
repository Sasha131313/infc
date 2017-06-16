package src.main.java.labs.lab3;


public class HourlyWorker extends Employee {
    private int workedHours;
    private final int nominalHours = 120;
    private final double overWorkingCoefficient = 1.5;
    private final double salaryPerHour = 10;

    @Override
    public int countSalary() {
        int salary;
        int overworkedHours = workedHours - nominalHours;
        salary = (int) ((nominalHours * salaryPerHour ) + (overworkedHours * overWorkingCoefficient));
        return salary;
    }

    public HourlyWorker(String name, String surname, int workedHours) {
        super ( name, surname );
        this.workedHours = workedHours;
    }

    public int getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }

    public int getNOMINAL_HOURS() {
        return nominalHours;
    }

    public double getOVERWORKING_COEFFICIENT() {
        return overWorkingCoefficient;
    }

    public double getSalaryPerHour() {
        return salaryPerHour;
    }

    @Override
    public String toString() {
        return super.toString () +
                "workedHours=" + workedHours +
                ", nominalHour=" + nominalHours +
                ", overWorkingCoefficient=" + overWorkingCoefficient +
                ", salaryPerHour=" + salaryPerHour +
                "} ";
    }
}
