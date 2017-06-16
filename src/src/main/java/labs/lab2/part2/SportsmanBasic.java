package src.main.java.labs.lab2.part2;


import java.io.IOException;

public class SportsmanBasic {
    protected String name;
    protected String surname;

    public String getName() {
        return name;
    }

    public void setName(String name) throws IOException {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
