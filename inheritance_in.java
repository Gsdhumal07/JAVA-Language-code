package com.company;
import java.util.Scanner;

class base{
    int x;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void printme(){
        System.out.println("I am print me function" +
                "\nfunction the base class ");
    }
}

class two{
    int a;
    public int input(){
        Scanner sc =new Scanner(System.in);
        System.out.println("this is class two \nand it is input function :");
        System.out.println("enter the number : ");
        a=sc.nextInt();

        return 1;
    }
}

//extend keyword is used to call base class in the derived class

class derived extends two {
    int y;
    public int getY(){
        return y;
    }
    public void setY(){
        this.y=y;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        base bs=new base();
        derived der =new derived();
        two t=new two();
        t.input();
    }
}
