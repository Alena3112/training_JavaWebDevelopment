package by.epam.learn.main;

import java.util.Scanner;

public class Length {
    public static void main(String[] args) {
        System.out.println("Введите два целых числа ");
        Scanner console = new Scanner(System.in);
        String n1 = console.nextLine();
        int len1 = n1.length();
        String n2 = console.nextLine();
        int len2 = n2.length();
        if (len1 > len2){
            System.out.println( "\nЧисло " + n1  +" длинее числа " + n2);
        }
        if (len1 < len2){
            System.out.println( "\nЧисло " + n1  +" короче числа " + n2);
        }
        else  {
           System.out.println( "\nЧисло " + n1  + " и " +  n2 + " равны");
        }
      System.out.println( "Длина строки " + n1 + " "  + len1 + " символа.");
      System.out.println( "Длина строки "+ n2 + " " + len2 + " символа.");
    }
}
