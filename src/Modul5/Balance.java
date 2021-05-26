package Modul5;

public class Balance {
    int leftScale = 0;
    int rightScale = 0;

    void addRight(int n) {
        rightScale += n;
    }

    void addLeft(int n) {
        leftScale += n;
    }

    String getSituation() {
        String situation;
        if (leftScale > rightScale) {
            situation = "l";
        } else if (rightScale > leftScale) {
            situation = "r";
        } else {
            situation = "=";
        }
        System.out.println(situation);
        return situation;
    }
}

    class BalanceTest {
        public static void main(String[] args) {
            Balance b = new Balance();
            b.getSituation();
            b.addLeft(1);
            b.addRight(2);
            b.getSituation();
        }
    }


