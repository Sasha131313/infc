package src.main.java.labs.lab3;


public class PieceWorker extends Employee {
    private int countOfDetails;
    final private int salaryPerDetail = 30;

    public int getSalaryPerDetail() {
        return salaryPerDetail;
    }

    public int getCountOfDetails() {
        return countOfDetails;
    }

    public void setCountOfDetails(int countOfDetails) {
        this.countOfDetails = countOfDetails;
    }

    @Override
    public int countSalary() {
        int salary = countOfDetails * salaryPerDetail;
        return salary;
    }

    @Override
    public String toString() {
        return super.toString () +
                "countOfDetails=" + countOfDetails +
                ", salaryPerDetail=" + salaryPerDetail +
                "} ";
    }

    public PieceWorker(String name, String surname, int countOfDetails) {
        super ( name, surname );
        this.countOfDetails = countOfDetails;
    }
}
