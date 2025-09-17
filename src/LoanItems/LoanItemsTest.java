package LoanItems;
import java.util.Scanner;

// Main class
public class LoanItemsTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Velkomstbesked og spørger hvor mange genstande der skal lånes
        System.out.println("Velkommen til Professorens Bibliotek!" + "\n-----------");
        System.out.println("Hvor mange ting vil du låne?");
        int numberOfItems = scanner.nextInt();
        scanner.nextLine();

        // Opretter et array til at holder lånte genstande
        Items[] item = new Items[numberOfItems];

        // Spørger om data på hver genstand og gemmer dem i arrayet
        for (int i = 0; i < numberOfItems; i++) {
            System.out.print("Hvilken type genstand ønsker du at låne? \n");
            String type = scanner.nextLine();

            System.out.print("Hvad er navnet på bogen eller videoen? \n");
            String title = scanner.nextLine();

            // Opretter den rigtige genstand baseret på typen
            if (type.equalsIgnoreCase("Book")) {
                item[i] = new Book(title, type);
            } else if (type.equalsIgnoreCase("Video")) {
                item[i] = new Video(title, type);
            } else {
                System.out.println("Ukendt genstand. Registrerer som ny type.");
                item[i] = new Items(title, type);
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

