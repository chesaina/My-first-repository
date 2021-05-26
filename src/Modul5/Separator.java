package Modul5;

import java.util.Arrays;

public class Separator {
    int [] array;

Separator(int[]array){
    this.array = array;
}

int evenIndexNumber(){
    int evenIndexNumber = 0;
    for (int i=0; i< array.length; i++){
        if (array[i] % 2 == 0) {
            evenIndexNumber ++;
        }
    }
    return evenIndexNumber;
}

int oddIndexNumber(){
    return array.length - evenIndexNumber();
}

int [] even() {
    int j = 0;
    int [] even = new int [evenIndexNumber()];
    for (int i =0; i< array.length; i++){
        if (array [i] % 2 == 0 ){
            even [j] = array[i];
            j++;
        }
    }
    return even;
}

int [] odd() {
    int j = 0;
    int [] odd = new int [oddIndexNumber()];
    for (int i = 0; i< array.length; i++){
        if (array [i] % 2 != 0){
            odd[j] = array[i];
            j++;
        }
    }
    return odd;
}

}

class SeparatorTest {
    public static void main(String[] args) {
        Separator separator = new Separator(new int[]{0,1,2,3,4,5,6,7,8,9,10});
        System.out.println(separator.evenIndexNumber());
        System.out.println(Arrays.toString(separator.even()));
        System.out.println(Arrays.toString(separator.odd()));
    }
}
