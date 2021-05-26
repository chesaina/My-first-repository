package Rectangulo;

public class Rect{
    private int s; int w, h;
    Rect(int w, int h){
        this.w = w;
        this.h = h;
        s = w * h;
    }
    int getS(){
        return s;
    }
    int getW(){
        return w;
    }
    int getH(){
        return h;
    }
}

class RectTest{
    public static void main(String[] args) {
        Rect rect = new Rect(10,15);
        System.out.println("w = " + rect.getW());
        System.out.println("h = " + rect.getH() );
        System.out.println("s = " + rect.getS());
        boolean a = rect.getW() * rect.getH() == rect.getS();
        System.out.println(a);

        rect.w =1;
        rect.h = 2;
        System.out.println("w = " + rect.getW());
        System.out.println("h = " + rect.getH() );
        System.out.println("s = " + rect.getS());
        System.out.println(rect.getW() * rect.getH() == rect.getS());

    }
}