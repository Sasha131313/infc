package src.main.java.homework.homework3;


public class StringUtilsTest {
    public static void main(String[] args) {
        String s1 = "HHello";
        String s2 = "WWorld";
        String s3 = StringUtils.combineStringWithoutFirstSymbols ( s1, s2 );
        System.out.println ( s1 + " " + s2 + "=" + s3 );

        String z21 = "Candy";
        String z22 = "solving";
        String z23 = StringUtils.remakeOddStringToThreeSymbols ( z21 );
        String z24 = StringUtils.remakeOddStringToThreeSymbols ( z22 );
        System.out.println ( z21 + "-to-" + z23 );
        System.out.println ( z22 + "-to-" + z24 );

        String z31 = " God We Trust In";
        String z32 = StringUtils.swapLastTwoLettersToBegin ( z31 );
        System.out.println ( z31 + "-to-" + z32 );

        String z41 = "Candy";
        String z42 = StringUtils.dublicateEveryLetter ( z41 );
        System.out.println ( z41 + "-to-" + z42 );

        String z51 = "bob is bab bad";
        int howInz51 = StringUtils.countSimilarLetters ( z51 );
        System.out.println ( z51 + "-is b*b ->" + howInz51 );

        String z61 = "th*is is sum*mer";
        String z62 = StringUtils.removeLettersAsideStar ( z61 );
        System.out.println ( z61 + "to-" + z62 );

        String z71 = "kudo sas SAS unos ";
        System.out.println ( z71 + "has:" + StringUtils.countWordsWithSpecialEndLetters ( z71 ) );

        String z81 = "HELLO THIS IS SASHA";
        String z82 = "HELLO THIS IS DASHA";
        String z83 = StringUtils.fromFirstStringWithoutSecond ( z81, z82 );
        System.out.println ( z81 + " minus " + z82 + "=" + z83 );


    }
}
