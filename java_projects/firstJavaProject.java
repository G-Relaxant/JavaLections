package java_projects;

/**
 * firstJavaProject
 */
public class firstJavaProject {                /*для быстрого вызова ввести(или первые буквы) и выбрать модуль 'class' */

    public static void main(String[] args) {   /*для быстрого вызова ввести(или первые буквы) и выбрать модуль 'main' */
    String str1 = "Lalala";
    String str2 = "Olala";
    String str3 = "Yaya,Olalala";
    System.out.println("SuperWorld_X-CITY");    // для быстрого вызова ввести(или первые буквы) и выбрать модуль 'sysout'
    System.out.println(str1);
    System.out.println(str2);
    System.out.println(str3);
    System.out.println();

    float fl = 123.45f;         // при типе float необходимо добавлять букву f в конце значения.   Почему разрабы не пофиксили до сих пор - не понятно
    double db = 123.45;
    int in = 123;
    char ch = '1';
    long lng = 1234567890;
    long lng2 = 123_456_7_8_9_0;    // для визуального упрощения и наглядности разрядов числа, можно применять нижнее подчёркивание
    short srt = 123;
    boolean bln = true;
    boolean bln2 = true && false;   // значение берётся из булевой таблицы истинности
    boolean bln3 = true || false;
    boolean bln4 = true & false;
    var vr1 = 123;                  // этот тип сам назначает при компиляции, наиболее подходящий тип данных для переменной 
    var vr2 = 123.45;
    var vr3 = "teacoffeetea";
    byte bt = 3;

    System.out.println(Integer.MAX_VALUE);
    System.out.println(Long.MAX_VALUE);
    System.out.println(Double.MAX_VALUE);
    System.out.println(Float.MAX_VALUE);
    System.out.println(Short.MAX_VALUE);
    System.out.println(Byte.MAX_VALUE);
    System.out.println(Character.MAX_VALUE);
    System.out.println();

    int[] arr = new int[10];
    arr[3] = 13;
    int[] arr2 = new int[] {1, 2, 3, 23, 31, 12, 123};
    //arr2[7] = 321;    нельзя добавлять новые элементы массиву простым присваиванием значения новому индексу
    System.out.println(arr);    // не печатает содержимое массива
    System.out.println(arr2);
    int[][] arr3 = new int[3][5];
    System.out.println(arr3);

    }
}