package notifications;

import org.testng.annotations.Test;

public class NewClass {

    public static void main(String[] args) {

        System.out.println("Hello testers");
        sayGoodBye("Mimi");

        System.out.println("test");


    }

    private int a = 5;

    public int getA() {
        return a;
    }
     /*
    public void setA(int a) {
        this.a = a;
    } */

    public NewClass(int a) {
        this.a = a;
    }
    // ovoj kje bide ingored se dodeka ne se fixne bugot JIR-256
    public static void sayHello(String name){
        System.out.println("Hello, " +name);
    }

    public static void sayGoodBye(String name){
        System.out.println("Good Bye, " +name);
    }
}


