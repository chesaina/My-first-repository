package Modul5;

public class Dog {
    private String name;
    private int age;
    Dog (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public String setName(String name){
        this.name =name;
        return name;
    }
    public int getAge() {
        return age;
    }
    public int setAge(int age){
        this.age =age;
        return age;
    }

    public String bark(){
        return "woof";
    }
}

class DogTest {
    public static void main(String[] args) {
        Dog d1 = new Dog("Sharik",10);
        System.out.println(d1.getName());
        System.out.println(d1.getAge());
        System.out.println(d1.bark());
        d1.setName("Bobic");
        d1.setAge(5);
        System.out.println(d1.getName());
        System.out.println(d1.getAge());
        System.out.println(d1.bark());
    }
}