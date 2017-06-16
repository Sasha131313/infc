/*package src.main.java.homework.homework3.hwpart2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;


public class TemperatureMeasure {

    List<Float> monthTempList;

    public TemperatureMeasure(Date date) {
        this.monthTempList = new ArrayList<>(date.toLocalDate().lengthOfMonth());
    }

    static public void addTemperatures() {
        System.out.println("input year month and date(YYYY-MM-DD)");
        Date date = null;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            date = Date.valueOf(br.readLine());
        } catch (IllegalArgumentException ilgarg) {
            System.out.println("try again");
        } catch (IOException e) {

        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        TemperatureMeasure tm = new TemperatureMeasure(date);

        for (int i = 0; i < date.toLocalDate().lengthOfMonth(); i++) {
            System.out.println("input temp of" + (i + 1) + "day of" + date.toLocalDate().getMonth());
            try {
                tm.monthTempList.add(Float.parseFloat(br.readLine()));
            } catch (IOException e) {
                System.out.println("error wrong type try again");
            }
        }
        tm.calculateTemp();
    }

    public void calculateTemp() {
        float avg = 0;
        for (int i = 0; i < monthTempList.size(); i++) {
            avg += monthTempList.get(i);
        }
        System.out.println(avg = avg / monthTempList.size());

    }


}
*/