package LoanItems;
import java.util.Scanner;

// Main class
public class LoanItemsTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Welcome message and asks how many items which needs to be rented
        System.out.println("Welcome to the Professors Library!" + "\n-----------");
        System.out.println("How many items would you like to rent?");
        int numberOfItems = scanner.nextInt();
        scanner.nextLine();

        // Checks input for a positive number
        while (numberOfItems <= 0) {
            System.out.println("Please only input a postive number. How would you rent -5 books?");
            numberOfItems = scanner.nextInt();
        }

        // Creates the array which contains the rented items
        Items[] item = new Items[numberOfItems];

        // Asks user for data on each item and saves to the array
        for (int i = 0; i < numberOfItems; i++) {
            System.out.print("What type is the item of your choise?\n");
            String type = scanner.nextLine();

            // Quick fix to check if the type is NOT book or video
            if (type.equalsIgnoreCase("book")) {
            } else if (type.equalsIgnoreCase("video")) {
            } else {
                System.out.println("Unknown entity! This library only handles books and videos.");
                type = scanner.nextLine();
            }

            System.out.print("What is the name of the book or video?\n");
            String title = scanner.nextLine();

            // Creates the right items based on the type
            if (type.equalsIgnoreCase("Book")) {
                item[i] = new Book(title, type);
            } else if (type.equalsIgnoreCase("Video")) {
                item[i] = new Video(title, type);
            } else {
                System.out.println("Unknown entity! This library only handles books and videos.");
            }
        }

        System.out.println("Thank you for renting with us. Here is a list of your rented items: \n");
        scanner.close();

        // Prints all the items for rent - It counts up the ID for each item.
        System.out.println("LIST OF RENTED ITEMS: \n" + "-----------------\n" + "ID\tTYPE\tTITLE");
        for (int i = 0; i < numberOfItems; i++) {
            System.out.println((i + 1) + " " + item[i] + "\n");
        }
    }
}

