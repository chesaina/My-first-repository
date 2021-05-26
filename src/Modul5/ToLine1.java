package Modul5;

import java.util.Arrays;

public class ToLine1 {
    int[][] data;

    public ToLine1(int[][] data) {
        this.data = data;
    }

    int[] resize() {
        // склеиваем двумерный массив в один при помощи start
        int[] res = new int[data.length * data[0].length];
        int start = 0;
        for (int[] datum : data) {
            for (int j = 0; j < datum.length; j++) {
                res[start + j] = datum[j];
                System.out.println(datum.length);
            }
            start += datum.length;
        }
        return res;
    }
}

class ToLine1Test {
    public static void main(String[] args) {
        ToLine a = new ToLine(new int[][] {{1, 2}, {3, 4}, {5, 6}});
        System.out.println(a.indexLength());
        System.out.println(Arrays.toString(a.resize()));
    }
}
