package Modul5;

public class Programmer {
    String name;
    String company;
    String position;

    Programmer(String name, String company) {
        this.name = name;
        this.company = company;
        this.position = "intern";
    }

    String getPosition(){
        return this.position;
    }

    String work(){
        switch (this.position){
            case "intern": this.position = "junior";
            break;
            case "junior": this.position = "middle";
            break;
            case "middle": this.position = "senior";
            break;
            case "senior": this.position = "lead";
            break;
        }
        return this.position;
    }

    }

    class ProgrammerTest {

        public static void main(String[] args) {
            Programmer p = new Programmer("Petya","Google");
            System.out.println(p.name + " "+ p.company +" "+p.position);
            p.work();
            System.out.println(p.getPosition());


            System.out.println(p.name + " "+ p.company +" "+p.position);
            p.work();
            p.getPosition();


            System.out.println(p.name + " "+ p.company +" "+p.position);
            p.getPosition();
            p.getPosition();


            p.work();
            System.out.println(p.name + " "+ p.company +" "+p.position);
            p.getPosition();


            p.work();
            System.out.println(p.name + " "+ p.company +" "+p.position);
            p.getPosition();


            p.work();
            System.out.println(p.name + " "+ p.company +" "+p.position);
            p.getPosition();

            p.work();
            System.out.println(p.name + " "+ p.company +" "+p.position);

            p.getPosition();

        }

    }
