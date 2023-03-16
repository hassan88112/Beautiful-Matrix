package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        for (int r=1 ; r<=5 ;r++){
            for (int z=1 ;z <=5 ;z++){
                int number =scanner.nextInt();
                if (number == 1) {
                    int result=Math.abs(r - 3 ) + Math.abs(z - 3);
                    System.out.println(result);
                    return;
                }


            }
        }
    }
}