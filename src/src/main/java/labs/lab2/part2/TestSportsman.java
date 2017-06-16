package src.main.java.labs.lab2.part2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

public class TestSportsman {

    public static void main(String[] args) throws IOException {


        System.out.println ( "сколько спортсменов в дюсш?" );
        BufferedReader br = new BufferedReader ( new InputStreamReader ( System.in ) );
        int  numberOfRunners = parseInt ( br.readLine () );
        Runner[] runners = new Runner[ numberOfRunners];
        DCH.createRunner (  numberOfRunners,runners );


        System.out.println ( "Введите пороговую скорость" );
        BufferedReader br2 = new BufferedReader ( new InputStreamReader ( System.in ) );
        int value = parseInt ( br2.readLine () );

        DCH.showSportsman(runners, numberOfRunners,value);
        DCH.showSportsman(runners, numberOfRunners);


    }


}
