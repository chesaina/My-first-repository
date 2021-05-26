package Modul5;

public class Bell {
    static int bell = 0;
    void sound(){
        if (bell%2==0){
            System.out.println("ding");
            bell+=1;
        }
        else {
            System.out.println("dong");
            bell+=1;
        }
    }
}

class BellTest{
    public static void main(String[] args) {

    Bell b = new Bell();
        b.sound();
        b.sound();
        b.sound();
        b.sound();
        b.sound();
        b.sound();
        b.sound();
}


}