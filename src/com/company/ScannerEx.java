package com.company;
import java.util.Scanner;

public class ScannerEx {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("How old are you?");
        String age = input.nextLine();
        System.out.println("Hello " + name + " ,your are " + age + " years old, and nice to meet you!");

    }
}

