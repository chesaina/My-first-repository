package Modul5;

import java.util.Arrays;

public class TicTacToe {
    String field[][];
    String nowPlayer;

    public TicTacToe() { //конструктор внутри которого метод newGame()
        newGame();
    }

    void newGame() { // метод создающий чистое поле и передающий ход X
        field = new String[][]{{"0", "-", "-"}, {"0", "-", "-"}, {"0", "-", "-"}};
        nowPlayer = "X";
    }

  /*  String[][] checkLineMethod () {
 ////////////////////////////////////////////////////////////////////////////////////////////////
        String[][] checkLine = new String[8][3];
        String [] lineX = {"X","X","X"};
        String [] lineO = {"0","0","0"};
        String winner;

        // вертикали:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                checkLine[i][j] = field[j][i];
            }
        }
        // линии
        for (int i = 0; i<3; i++){
            checkLine [i+3] = field [i];
        }
        // диагонали
        checkLine [6] = new String[] {field[0][0], field[1][1],field[2][2]};
        checkLine [7] = new String[] {field[0][2], field[1][1],field[2][0]};

        for (int i = 0; i < 8; i++){
         if (checkLine[i].equals(lineX)) {
             winner = "X";
         }
         else if (checkLine[i].equals(lineO)){
             winner = "0";
         }
         else { winner ="D";}
         }
        return winner;
        }
///////////////////////////////////////////////////////////////////////////////////////////////////
        return checkLine;
    }

    int checkMovesLeft() {
        int movesLeft = 0;
        for (int i = 0; i <3; i++) {
            for (int j = 0; j < 3; j++){
                if (field [i][j] == "-"){movesLeft += 1;}

            }
        }
        return movesLeft;
    }

}*/


        class TicTacToeTest {
            public static void main(String[] args) {
                TicTacToe XO = new TicTacToe();
                System.out.println(Arrays.deepToString(XO.field));
 //               System.out.println(Arrays.deepToString(XO.checkLineMethod()));
   //             System.out.println(XO.checkMovesLeft());
            }

        }
}