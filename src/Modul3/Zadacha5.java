package Modul3;

import java.util.Arrays;

public class Zadacha5 {
   public static int [] numbers = new int [100];

    public static void main(String[] args) {
               for (int i = 1; i < numbers.length+1; i++ ) {
               if ( i % 2 != 0) {numbers [i-1] = i;}
               else {numbers [i-1] = -i;}

        }
        System.out.println(Arrays.toString(numbers));
    }

}
