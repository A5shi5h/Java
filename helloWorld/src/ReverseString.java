package helloWorld.src;

import java.util.Scanner;

public class ReverseString {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.next();
        String str2 = "";
        for( int i = str.length()-1 ; i >= 0 ; i--){
           str2 += str.charAt(i);
        }
        System.out.println(str2);
    }
}
