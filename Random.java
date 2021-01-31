package by.epam.learn.main;

public class Random {
    public static void main(String[] args) {
        int a = 0;
        int b = 50;
        for (int i = 0; i < 10; i++) {
            int random_number = a + (int) (Math.random() * b);
            int random_number2 = a + (int) (Math.random() * b);
            System.out.print(" " + random_number);
            System.out.println(" " + random_number2);
                    }
    }
        }



