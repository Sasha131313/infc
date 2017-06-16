package src.main.java.labs.lab2.part2;

import java.io.IOException;



public class Runner extends SportsmanBasic{
    private static final int numberOfRuns = 3;

    private double[] runStat = new double[numberOfRuns];
    private double averageRun;

    public double getAverageRun() {
        return averageRun;
    }

    public void setAverageRun(double averageRun) {
        this.averageRun = averageRun;
    }

    @Override
    public String toString() {
        return "Спортсмен{" +
                "Имя='" + name + '\'' +
                ", Фамилия='" + surname + '\'' +
                ", Средний результат=" + averageRun +
                '}';
    }

    public static int getNumberOfRuns() {
        return numberOfRuns;
    }



    public double[] getRunStat() {
        return runStat;
    }

    public double getDefiniteRunStat(int positionInArray) {
        return runStat[positionInArray];
    }

    public void setDefiniteRunStat(int positionInArray, double currentVariable) {
        runStat[positionInArray] = currentVariable;
    }

    public void setRunStat(double[] runStat) {
        this.runStat = runStat;
    }
}
