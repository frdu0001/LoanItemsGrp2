package LoanItems;
import java.util.Scanner;

// Main class
public class LoanItemsTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Velkomstbesked og spørger hvor mange genstande der skal lånes
        System.out.println("Welcome to the Professors Library!" + "\n-----------");
        System.out.println("How many items would you like to rent?");
        int numberOfItems = scanner.nextInt();
        scanner.nextLine();

        // Checks input for a positive number
        while (numberOfItems <= 0) {
            System.out.println("Please only input a postive number. How would you rent -5 books?");
            numberOfItems = scanner.nextInt();
        }

        // Opretter et array til at holder lånte genstande
        Items[] item = new Items[numberOfItems];

        // Spørger om data på hver genstand og gemmer dem i arrayet
        for (int i = 0; i < numberOfItems; i++) {
            System.out.print("What type is the items of your choise?\n");
            String type = scanner.nextLine();

            // || !type.equals("Book") || !type.equals("video") || !type.equals("Video")

            while (!type.equalsIgnoreCase("book")) {
                System.out.println("Unknown entity! This library only has books or videos.");
                type = scanner.nextLine();
            }

            System.out.print("What is the name of the book or video?\n");
            String title = scanner.nextLine();

            // Opretter den rigtige genstand baseret på typen
            if (type.equalsIgnoreCase("Book")) {
                item[i] = new Book(title, type);
            } else if (type.equalsIgnoreCase("Video")) {
                item[i] = new Video(title, type);
            } else {
                System.out.println("Unknown entity! This library only has books or videos.");

                //item[i] = new Items(title, type);
            }
        }

        System.out.println("Tak for at låne hos os! Her er en oversigt over de bøger/videoer du har lånt :\n");
        scanner.close();

        // Printer alle genstande som er lånt - Her tæller den en op på ID'et for hver genstand.
        System.out.println("LIST OF LOANED ITEMS: \n" + "-----------------");
        for (int i = 0; i < numberOfItems; i++) {
            System.out.println("Registreret genstand nr: " + (i + 1) + "\n" + item[i] + "\n");
        }
    }
}

