package Modul3;

public class Zadacha10 {
    public static String string = "helloworld";

    public static void main(String[] args) {
        int index;
        if (string.length() % 2 == 0) {
            index = string.length() / 2;
        }
        else {
            index = string.length() / 2 + 1;}

            for (int i = 0; i < index; i++) {
                System.out.println(string.substring(i, string.length() - i));
            }
        }
    }


