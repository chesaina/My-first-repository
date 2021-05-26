package Modul5;

import java.util.Arrays;

public class ToLine {
    int [] [] data;

    ToLine (int[][]data){
        this.data = data;
    }

    int indexLength() {
        int indexLength = 0;
        for (int i =0; i < data.length; i++){
            for (int j= 0; j< data[i].length; j++){
                indexLength++;
            }
        }
        return indexLength;
    }

   int [] resize() {
        int index=0;
        int [] resize = new int [indexLength()];
        for (int i = 0; i < data.length; i++){
            for(int j = 0; j < data[i].length; j++){
                resize [index] = data[i][j];
                index++;
            }
        }
        return resize;
    }

}

class ToLineTest {
    public static void main(String[] args) {
        ToLine a = new ToLine(new int[][] {{1, 2}, {3, 4}, {5, 6}});
        System.out.println(a.indexLength());
        System.out.println(Arrays.toString(a.resize()));
    }
}
