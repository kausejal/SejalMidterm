/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package days;

/**
 *
 * @author sivagamasrinivasan
 * Student Name: Sejalpreet Kaur (991778026)
 */
public class Weekdays {

    // Enum representing the days of the week
    public enum Weekday {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }

    // Method to print the name of the day based on the code
    public void nameOfDay(int code) {
        // Ensure that the code is within the valid range (1 to 7)
        if (code >= 1 && code <= 7) {
            Weekday day = Weekday.values()[code - 1]; // Map the input to the corresponding enum
            System.out.println(day);
        } else {
            System.out.println("Invalid input! Please enter a number between 1 and 7.");
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        Weekdays weekdays = new Weekdays();
        for (int i = 1; i <= 7; i++) {
            weekdays.nameOfDay(i); // Print day names for codes 1 to 7
        }
    }
}
