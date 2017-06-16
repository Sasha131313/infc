package src.main.java.labs.lab3;


public class CommisionWorker extends Employee {

    private final double basicSalary = 1500;
    private final double percentOfSales = 2;
    private int amountOfSales;

    public CommisionWorker(String name, String surname, int amountOfSales) {
        super ( name, surname );
        this.amountOfSales = amountOfSales;
    }

    @Override
    public String toString() {
        return super.toString () +
                "basicSalary=" + basicSalary +
                ", percentOfSales=" + percentOfSales +
                ", amountOfSales=" + amountOfSales +
                "} ";
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public double getPercentOfSales() {
        return percentOfSales;
    }

    public int getAmountOfSales() {
        return amountOfSales;
    }

    public void setAmountOfSales(int amountOfSales) {
        this.amountOfSales = amountOfSales;
    }

    @Override
    public int countSalary() {
        return (int) (basicSalary + (amountOfSales * percentOfSales / 100));
    }
}
