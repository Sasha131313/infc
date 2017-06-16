package src.main.java.homework.homework3;


public class StringUtils {
    public static String combineStringWithoutFirstSymbols(String s1, String s2) {
        return s1.substring ( 1 ).concat ( s2.substring ( 1 ) );
    }

    public static String remakeOddStringToThreeSymbols(String s1) {
        if (s1.length () % 2 != 0 && s1.length () >= 3) {
            return s1.substring ( ((s1.length () / 2) - 1), ((s1.length () / 2) + 2) );
        }
        return s1;
    }

    public static String swapLastTwoLettersToBegin(String s1) {

        return s1.substring ( s1.length () - 3 ).concat ( s1.substring ( 0, s1.length () - 3 ) );

    }

    public static String dublicateEveryLetter(String s1) {

        StringBuilder str1 = new StringBuilder ();
        str1.append ( s1 );
        for (int i = 0; i < s1.length () * 2; i += 2) {
            str1.insert ( i + 1, str1.charAt ( i ) );
        }
        return str1.toString ();
    }

    public static int countSimilarLetters(String s1) {
        StringBuilder str1 = new StringBuilder ();
        str1.append ( s1 );
        int counter = 0;
        for (int i = 0; i < s1.length () - 2; i++) {
            if (str1.charAt ( i ) == str1.charAt ( i + 2 ) && str1.charAt ( i ) == 'b' && str1.charAt ( i + 1 ) != ' ') {
                counter++;
            }
        }
        return counter;
    }

    public static String removeLettersAsideStar(String s1) {
        StringBuilder str1 = new StringBuilder ();
        str1.append ( s1 );
        for (int i = 1; i < str1.length () - 2; i++) {
            if (str1.charAt ( i ) == '*') {
                str1.delete ( i - 1, i + 2 );
            }
        }
        return str1.toString ();
    }

    public static int countWordsWithSpecialEndLetters(String s1) {
        StringBuilder ztr1 = new StringBuilder ();
        ztr1.append ( s1 );
        int counter = 0;
        for (int i = 0; i < ztr1.length () - 1; i++) {
            if (
                            (ztr1.charAt ( i ) == 'S' && ztr1.charAt ( i + 1 ) == ' ')
                            ||
                            (ztr1.charAt ( i ) == 's' && ztr1.charAt ( i + 1 ) == ' ')
                            ||
                            (ztr1.charAt ( i ) == 'a' && ztr1.charAt ( i + 1 ) == ' ')
                            ||
                            (ztr1.charAt ( i ) == 'A' && ztr1.charAt ( i + 1 ) == ' ')) {
                counter++;
            }
        }

        return counter;
    }

    public static String fromFirstStringWithoutSecond(String s1, String s2) {
        StringBuilder zrt1 = new StringBuilder ();
        StringBuilder zrt2 = new StringBuilder ();
        StringBuilder zrt3 = new StringBuilder ();
        zrt1 = zrt1.append ( s1 );
        zrt2 = zrt2.append ( s2 );
        for (int i = 0; i < zrt1.length (); i++) {
            if (zrt1.charAt ( i ) == zrt2.charAt ( i )) {
                continue;
            } else {
                zrt3.append ( zrt1.charAt ( i ) );
            }
        }
        return zrt3.toString ();
    }
}
