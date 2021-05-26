package Modul5;

import java.util.Arrays;

public class test {
   static String[][] field = new String[][]{{"0", "0", "0"}, {"0", "0", "0"}, {"0", "-", "-"}};
   static String [] lineO = {"0","0","0"};

    public static void main(String[] args) {

        for (int i =0; i <3; i++){
            if (Arrays.equals(field[i],lineO)) {
                System.out.println(i);
            };
        }


    }
}
