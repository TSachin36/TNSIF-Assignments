package com.tnsif.assignments.assignment2.automated_resort_booking;
import java.util.Scanner;
class BookingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the customer details");
        String input = scanner.nextLine();

        // Splitting input string using colon as a delimiter
        String[] details = input.split(":");

        // Validating input format
        if (details.length != 4) {
            System.out.println("Invalid input format");
            return;
        }

        String name = details[0];
        int numAdults = Integer.parseInt(details[1]);
        int numChildren = Integer.parseInt(details[2]);
        int numDays = Integer.parseInt(details[3]);

        // Validating inputs
        if (numAdults < 0) {
            System.out.println("Invalid input for number of adults");
            return;
        }

        if (numChildren < 0) {
            System.out.println("Invalid input for number of children");
            return;
        }

        if (numDays <= 0) {
            System.out.println("Invalid input for number of days");
            return;
        }

        Customer customer = new Customer(name, numAdults, numChildren, numDays);
        BookingSystem.calculateBookingPrice(customer);
    }

    public static void calculateBookingPrice(Customer customer) {
        int adultPrice = 1000;
        int childPrice = 650;

        int totalCost = (customer.getNumAdults() * adultPrice + customer.getNumChildren() * childPrice) * customer.getNumDays();

        System.out.println(customer.getName() + " your booking is confirmed, and the total cost is " + totalCost);
    }
}