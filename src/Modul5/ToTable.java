package Modul5;

import java.util.Arrays;

public class ToTable {
    int [] data;
    int x;
    int y;

    ToTable (int [] data, int x, int y) {
        this.data = data;
        this.x = x;
        this.y = y;
    }

    int [][] resize() {
        int dataIndex = 0;
        int [][]resize = new int [x][y];
        for(int i = 0; i<x; i++) {
            for (int j = 0; j< y; j++){
                resize [i][j] = data [dataIndex];
                dataIndex++;
            }
        }
        return resize;
    }

}

class ToTableTest {
    public static void main(String[] args) {
        ToTable ttt = new ToTable(new int[] {1,2,3,4,5,6},3,2);
        System.out.println(Arrays.deepToString(ttt.resize()));
    }
}
