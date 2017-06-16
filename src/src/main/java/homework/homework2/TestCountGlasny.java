package src.main.java.homework.homework2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class TestCountGlasny {
    public static void main(String[] args) throws IOException {
        String noFile = " The Java Runtime Environment (JRE) is what you get when you download Java software.";


    }

    public static void read() throws IOException {
        String fileLocatiom = "C:\\Users\\oleks\\message.txt";

        StringBuilder sb = new StringBuilder ();

        BufferedReader in = new BufferedReader ( new FileReader ( fileLocatiom ) );


        String tmpString;
        while ((tmpString = in.readLine ()) != null) {
            sb.append ( tmpString );
            sb.append ( "\n" );
        }
        in.close ();
        System.out.println ( "readed file  " + CountGlasny.countGlasnyV2 ( sb.toString () ) );
    }


}


