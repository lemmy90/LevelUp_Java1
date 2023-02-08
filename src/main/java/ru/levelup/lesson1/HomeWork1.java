package main.java.ru.levelup.lesson1;

public class HomeWork1 {
    public static void main(String[] args) {
        printWord("Hello world!");

        printInt(sumInt(5, 7));
        printInt(subInt(50,10));
        printInt(multInt(100,4));
        printInt(divInt(10, 4));

        printLong(sumLong(1000, 39999));
        printLong(subLong(234876, 298478923));
        printLong(multLong(248376, 239487));
        printLong(divLong(232344987, 298));

        printShort(sumShort(3,2));
        printShort(subShort(5,3));
        printShort(multShort(10,6));
        printShort(divShort(12,5));

        printByte(sumByte(5,1));
        printByte(subByte(10,10));
        printByte(multByte(5,20));
        printByte(divByte(40, 30));

        printDouble(sumDouble(3.4, 5.14));
        printDouble(subDouble(5.78, 2.25));
        printDouble(multDouble(1.1,0));
        printDouble(divDouble(2.2, 28.14));



    }

    public static void printWord(String word) {
        System.out.println(word);
    }

    /*
    Integer checks for addition, subtraction, multiplication, division
     */

    public static void printInt(int num) {
        System.out.println(num);
    }

    public static int sumInt(int a, int b) {
        return a + b;
    }

    public static int subInt(int a, int b) {
        return a - b;
    }

    public static int multInt(int a, int b) {
        return a * b;
    }

    public static int divInt(int a, int b) {
        return a / b;
    }

    /*
    Long checks for addition, subtraction, multiplication, division
     */
    public static void printLong(long num) {
        System.out.println(num);
    }

    public static long sumLong(long a, long b) {
        return a + b;
    }

    public static long subLong(long a, long b) {
        return a - b;
    }

    public static long multLong(long a, long b) {
        return a * b;
    }

    public static long divLong(long a, long b) {
        return a / b;
    }

    /*
    Short checks for addition, subtraction, multiplication, division
     */
    public static void printShort(short num) {
        System.out.println(num);
    }

    public static short sumShort(int a, int b) {
        return (short) (a + b);
    }

    public static short subShort(int a, int b) {
        return (short) (a - b);
    }

    public static short multShort(int a, int b) {
        return (short) (a * b);
    }

    public static short divShort(int a, int b) {
        return (short) (a / b);
    }


    /*
    Byte checks for addition, subtraction, multiplication, division
     */
    public static void printByte(int num) {
        System.out.println(num);
    }

    public static byte sumByte(int a, int b) {
        return (byte) (a + b);
    }

    public static byte subByte(int a, int b) {
        return (byte) (a - b);
    }

    public static byte multByte(int a, int b) {
        return (byte) (a * b);
    }

    public static byte divByte(int a, int b) {
        return (byte) (a / b);
    }

    /*
    Double checks for addition, subtraction, multiplication, division
     */

    public static void printDouble(double num) {
        System.out.println(num);
    }

    public static double sumDouble(double a, double b) {
        return a + b;
    }

    public static double subDouble(double a, double b) {
        return a - b;
    }

    public static double multDouble(double a, double b) {
        return a * b;
    }

    public static double divDouble(double a, double b) {
        return (double) (a / b);
    }
}
