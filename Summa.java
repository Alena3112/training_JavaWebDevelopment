package by.epam.learn.main;

import java.util.Scanner;

public class Summa {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        for (int i = 0; true; i++) {
            int x = vvod.nextInt();
            int y = vvod.nextInt();

            System.out.println("Summa = " + (x + y));
            System.out.println("PROIZVEDENIE = " + (x * y));
        }
    }
}