/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package days;

import java.util.Scanner;

/**
 * This class takes an integer input from the user and prints the corresponding
 * day of the week using enums.
 *
 * @author sivagamasrinivasan
 * Student Name: Sejalpreet Kaur (991778026)
 */
public class Days {

    public static void main(String[] args) {
         
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the day number (1 to 7):");
        int code = in.nextInt();
        
        Weekdays t = new Weekdays();
        t.nameOfDay(code); 
    } 
}

enum Weekday {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}

class Weekdays {
    public void nameOfDay(int code) {
        // Validate input range (1 to 7)
        if (code >= 1 && code <= 7) {
            Weekday day = Weekday.values()[code - 1]; // Map code to enum
            System.out.println(day);
        } else {
            System.out.println("Invalid input! Please enter a number between 1 and 7.");
        }
    }
}

