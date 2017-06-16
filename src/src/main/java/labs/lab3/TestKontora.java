package src.main.java.labs.lab3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TestKontora {
    public static void main(String[] args)  {
        Kontora firma = new Kontora ();
        Boss boss = new Boss ("Андрей", "Иванов");
        firma.addEmployee(boss);
        HourlyWorker hourlyWorker = new HourlyWorker("Игорь", "Крамаренко",125);
        firma.addEmployee(hourlyWorker);
        CommisionWorker commisionWorker = new CommisionWorker ("Алина","Машнева", 10);
        firma.addEmployee(commisionWorker);
        PieceWorker pieceWorker = new PieceWorker("Александра","Будзина",60);
        firma.addEmployee(pieceWorker);
        firma.showAllSalary();
        firma.showSalary();
    }


            //Methods for case;

}
