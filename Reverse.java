package by.epam.learn.main;

public class Reverse {
    public static void main(String[] args) {
        String str = "абвгдеёжзик";
        String reverse = new StringBuffer(str).reverse().toString();
        System.out.println("Строка в обратном порядке " + reverse);
    }
}
