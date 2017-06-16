package src.main.java.homework.homework2;


public class CountGlasny {
    final static private char[] glasny = {'A', 'a', 'E', 'e', 'O', 'o', 'I', 'i', 'Y', 'y', 'U', 'u'};
    final static private char[] punktuation = {'\0', ' ', '\n', '.', ',', '!', '\t', '?', ':'};



    public static int countGlasnyV2(String message) {
        int result = 0;
        String[] splitted = message.split ( "[,;:.!?\\s]+" );
        for (int i = 0; i < splitted.length; i++) {
            boolean begin = false;
            boolean end = false;
            for (int z = 0; z < glasny.length; z++) {

                if (splitted[i].startsWith ( Character.toString ( glasny[z] ) )) {

                    if (end) {
                        result++;
                    }
                    begin = true;
                }
                if (splitted[i].endsWith ( Character.toString ( glasny[z] ) )) {
                    if (begin) {
                        result++;
                    }
                    end = true;
                }
            }
        }


        return result;
    }
}
