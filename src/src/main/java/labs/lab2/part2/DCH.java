package src.main.java.labs.lab2.part2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DCH {
    public static void createRunner(int numberOfRunners, Runner[] runners) throws IOException {
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i <  numberOfRunners; i++) {
            String temporary;
            runners[i] = new Runner();
            System.out.println("введите имя");
            runners[i].setName(br1.readLine());

            System.out.println("введите фамилию");
            runners[i].setSurname(br1.readLine());

            System.out.println("введите 3 результата забегов");
            for (int z = 0; z < Runner.getNumberOfRuns(); z++)
            {
                System.out.println("input-" + (z + 1) + "run");
                runners[i].setDefiniteRunStat(z, Double.parseDouble(br1.readLine()));
            }
            runners[i].setAverageRun(countAverageRun(runners[i]));
        }

    }

    //counting average result of all sportsman
    public static double countAllAverage(Runner[] runners, int numberOfRunners)//cчитаем среднее значение
    {
        int result = 0;
        for (int i = 0; i < numberOfRunners; i++) {
            result += runners[i].getAverageRun();
        }

        return result / numberOfRunners;
    }

    /* method for counting each sportsman average result */
    private static double countAverageRun(Runner sportsman) {
        double result = 0;
        for (int i = 0; i < sportsman.getNumberOfRuns(); i++) {
            result += sportsman.getDefiniteRunStat(i);
        }

        return result / sportsman.getNumberOfRuns();
    }


    // method for showing sportsman by some attributes//
    public static void showSportsman(Runner[] runners, int  numberOfRunners) {

        System.out.println("спорстмены, результаты которых выше средней скорости по спортшколе");
                for (int i = 0; i <  numberOfRunners; i++) {
                    if (runners[i].getAverageRun() > countAllAverage(runners,  numberOfRunners)) {
                        System.out.println(runners[i].toString());
                    }

                }

        System.out.println("спорстмены, результаты которых ниже средней скорости по спортшколе");

                for (int i = 0; i < numberOfRunners; i++) {
                    if (runners[i].getAverageRun() <= countAllAverage(runners, numberOfRunners)) {
                        System.out.println(runners[i].toString());
                    }

                }


    }

    public static void showSportsman(Runner[] runners, int  numberOfRunners, int VALUE) {
        System.out.println("спорстмены со средней скоростью выше пороговой");
                for (int i = 0; i <  numberOfRunners; i++) {
                    if (runners[i].getAverageRun() > VALUE) {
                        System.out.println(runners[i].toString());
                    }

                }


        System.out.println("спорстмены со средней скоростью ниже пороговой");

                for (int i = 0; i <  numberOfRunners; i++) {
                    if (runners[i].getAverageRun() <= VALUE) {
                        System.out.println(runners[i].toString());
                    }

                }



    }

}




