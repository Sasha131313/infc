package src.main.java.labs.lab1;

//1 задаем типы данных и выводим их
public class Lab1 {
    public static int typeInt = 10554555;

    public static long typeLong = 337777887;

    public static short typeShort = 32767;

    public static byte typeByte = 127;

    public static double typeDouble = 3.1416;

    public static float typeFloat = (float) 3.14;

    public static boolean typeBoolean = false;

    public static void main(String[] args) {



        int typeInt = 98555452;

        long typeLong = 215478555;

        short typeShort = 32754;

        byte typeByte = 127;

        double typeDouble = 1.25478;

        float typeFloat = (float) 1.5;

        boolean typeBoolean = true;



        System.out.println("int: " + typeInt);

        System.out.println("long: " + typeLong);

        System.out.println("short: " + typeShort);

        System.out.println("byte: " + typeByte);

        System.out.println("double: " + typeDouble);

        System.out.println("float: " + typeFloat);

        System.out.println("boolean: " + typeBoolean);

        System.out.println("int в классе : " + Lab1.typeInt);

        System.out.println("long в классе : " + Lab1.typeLong);

        System.out.println("short в классе : " + Lab1.typeShort);

        System.out.println("byte в классе : " + Lab1.typeByte);

        System.out.println("double в классе : " + Lab1.typeDouble);

        System.out.println("float в классе : " + Lab1.typeFloat);

        System.out.println("boolean в классе : " + Lab1.typeBoolean);
           //2 инициизируем разніми значениями флоат
        float fl = (float) 1.;

        float fl1 = (float) 1;

        float fl2 = (float) 0x1;

        float fl3 = (float) 0b1;

        float fl4 = (float) 1.0e1;

        float fl5 = (float) 01;
         //3
        short sh = 1 + 2;

        short sh1 = (short) (1.5 + 1);

        short sh2 = (short) (1.5f + 1);

        short sh3 = (short) ((byte) 12 + (short) 5);

        short sh4 = (short) (1.24f + 3.1416);
       //4
        int catet1 = 4;

        int catet2 = 4;

        int gipotenyza = 7;

        boolean pifagor = ((catet1 * catet1) + (catet2 * catet2)) == (gipotenyza * gipotenyza) ? true : false;

        System.out.println("Данный треугольник прямоугольный ? " + pifagor);
        //5
        int sum = 0;

        for (int i = 1; i <= 20; i++) {

            sum += i;

        }

        System.out.println("суммa целых чисел от 1 до 20 : " + sum);
    //6
        sum = 0;

        for (int i = 1; i < 20; i++) {

            if (i % 2 == 0) {

                sum += i;

            }

        }


         //7 сума простых чисел от 1 до 20
        sum = 0;

        for (int i = 1; i < 20; i++) {

            if (i / 1 == i && i / i == 1 && i % 2 != 0 && i % 3 != 0) {

                sum += i;

            }

        }

        System.out.println("Суммa простых чисел  1 до 20 :" + sum);
         // если сумма двух равна третей, вывести true
        int a = 3, b = 2, c = 4;

        System.out.println((a + b) == c);
          //9 среднее значение чисел от а до б
               sum = 0;

        int counter = 0;

        a = 70;

        b = 6;

        for (int i = a; i > b; i--) {

            sum += i;

            counter++;

        }

        System.out.println("Среднее арифметическое " + (sum / counter));
         //расчет платежей (+класс Кредит)
        System.out.println();

        Credit cred = new Credit(20000, 10, 7);

        cred.credit();

    }

}

