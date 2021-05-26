package Modul5;

import java.util.Arrays;

public class ToTable1 {
    int[] data;
    int x, y;

    public ToTable1(int[] data, int x, int y) {
        this.data = data;
        this.x = x;
        this.y = y;
    }

    int[][] resize() {
        // склеиваем двумерный массив в один при помощи start
        int[][] res = new int[x][y];
        int start = 0;
        for (int i = 0; i < x; i++) {
            for (int j = start; j < start + y; j++) {
                res[i][j - start] = data[j];
            }
            start += y;
        }
        return res;
    }
}
class ToTabl1Test {
    public static void main(String[] args) {
        ToTable1 ttt = new ToTable1(new int[] {1,2,3,4,5,6},3,2);
        System.out.println(Arrays.deepToString(ttt.resize()));
    }
}

