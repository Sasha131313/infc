package src.main.java.labs.lab3;

import java.util.ArrayList;


public class Kontora {
    private ArrayList<Employee> workers = new ArrayList<> ();

    void addEmployee(Employee rab) {
        workers.add ( rab );
    }

    void showAllSalary() {



        int allSalary = 0;

        for (int i = 0; i < workers.size (); i++) {
            System.out.println ( workers.get ( i ).toString () );
            allSalary += workers.get ( i ).countSalary ();
        }

        System.out.println ( "сумма всех зарплат " + allSalary );
    }
    void showSalary() {
        for (int i = 0; i < workers.size(); i++) {
            System.out.println(workers.get(i).getSurname());
            System.out.println(workers.get(i).countSalary());
        }
    }
}
