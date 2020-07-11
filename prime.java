package primecheck;
import java.util.Scanner;
import java.lang.Math;
import java.lang.System;
public class Prime {
    public static void main(String[] args){
        System.out.println("Please insert any number");
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        for (int i = 2; i < Math.sqrt((int)x) ; i++) {
            if(x%i==0){
                System.out.println(x+" is NOT a prime number");
                System.exit(0);
            }
        }
        System.out.println(x+" is a prime number");
    }
}
