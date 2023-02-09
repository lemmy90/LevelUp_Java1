package main.java.ru.levelup.lesson1;

public class Task {

    public static void main(String[] args) {

/*        Написать программу осуществляющую решение линейного уравнения
        ax + b = 0. a и b задаете в программе, х выводите на экран.*/

        System.out.println(linea(7, 28));

    }

    public static double linea(double a, double b) {
        return -b/a;
    }
}
