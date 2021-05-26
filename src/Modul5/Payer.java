package Modul5;

public class Payer {
    String surname;
    String name;
    String address;
    int cardNumber;
    Payer(String surname,String name, String address, int cardNumber) {
        this.surname = surname;
        this.name = name;
        this.address = address;
        this.cardNumber = cardNumber;
        System.out.println("Payer: " + surname + " " + name + ", address: " + address + ", card: " + cardNumber);
    }
}

class PayerTest {
    public static void main(String[] args) {
        Payer p1 = new Payer("Bond", "James", "London", 007);
    }
}