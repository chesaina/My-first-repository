package Modul3;
import java.util.Arrays;

public class Zadacha6 {
    public static int[] numbers = new int[30];

    public static void main(String[] args) {
        numbers [0]= 1;
        numbers [1] = 1;

        for (int i =2; i< numbers.length; i++) {
            numbers [i] = numbers[i-2]+numbers[i-1];
        }



        System.out.println(Arrays.toString(numbers));
    }
}
