package JavaOtChaka;

public class Raventstvo {
    private StringBuilder sb1;
    private StringBuilder sb2;

    public void setSb1(StringBuilder sb1) {
        this.sb1 = sb1;
    }

    public void setSb2(StringBuilder sb2) {
        this.sb2 = sb2;
    }

    public StringBuilder getSb1() {
        return sb1;
    }

    public StringBuilder getSb2() {
        return sb2;
    }

    boolean equalityCheck (StringBuilder sb1, StringBuilder sb2){
        boolean equality;

        if (sb1.toString().equals(sb2.toString())){
            equality=true;
            System.out.println("sb1 и sb2 имеют одинаковое содержание");
        }
        else {
            equality = false;
            System.out.println("sb1 и sb2 имеют разное содержание");
        }
        return equality;
    }
}

class RaventstvoTest {
    public static void main(String[] args) {
        Raventstvo raventstvo = new Raventstvo();
        raventstvo.setSb1(new StringBuilder("Апельсин"));
        raventstvo.setSb2(new StringBuilder("Яблоко"));
        raventstvo.equalityCheck(raventstvo.getSb1(), raventstvo.getSb2());
        raventstvo.setSb2(raventstvo.getSb1());
        raventstvo.equalityCheck(raventstvo.getSb1(), raventstvo.getSb2());
        raventstvo.setSb2(new StringBuilder("Апельсин"));
        raventstvo.equalityCheck(raventstvo.getSb1(), raventstvo.getSb2());
    }
}
