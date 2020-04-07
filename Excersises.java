import java.util.Scanner;

class Excersises {

    public static void main (String args[]){

        int a, b, temp;

        a = 3;
        b = 14;

        System.out.println("Before swap: a, b = "+ a +","+ b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("After swap: a, b = "+ a +","+ b);

    }
}