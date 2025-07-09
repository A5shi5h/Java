package helloWorld.src;

import java.util.Scanner;

public class Reverse {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int x = sc.nextInt();
        if(x % 2 == 0){
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is Odd");
        }
    }
}
