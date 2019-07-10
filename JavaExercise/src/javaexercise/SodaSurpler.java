package javaexercise;

import java.util.Scanner;

public class SodaSurpler {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empty = Integer.parseInt(sc.nextLine()) + Integer.parseInt(sc.nextLine());
        int bottles = 0;
        int require = Integer.parseInt(sc.next());
        int total = 0;

        while (empty >= require){
            bottles = empty % require;
            empty /= require;
            total += empty;
            empty +=bottles;

        }
        System.out.println(total);
        sc.close();
    }

}