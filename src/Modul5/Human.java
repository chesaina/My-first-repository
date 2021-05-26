package Modul5;

public class Human {
    String name;
    int age;
    int weight;
    String address;
    String work;

    Human(String name, int age, int weight, String address, String work) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.address = address;
        this.work = work;
    }

    Human(String name, int age){
        this(name, age, 70, null,null);
    }
    Human(String name,String address){
        this(name,35,70,address,null);
    }
    Human(String name, int age, int weight){
        this(name,age,weight,null,null);
    }
    Human(String name, int age, String work){
        this(name,age, 70,null,work);
    }
    Human(int age, int weight, String address,String work) {
        this ("Chelovek",age,weight,address,work);
    }

}
