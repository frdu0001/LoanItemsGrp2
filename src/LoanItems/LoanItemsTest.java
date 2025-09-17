package LoanItems;
import java.util.Scanner;

// Main class
public class LoanItemsTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Velkomstbesked og spørger hvor mange item der skal indleveres
        System.out.println("Velkommen til Professorens Biblotek!" + "\n-----------");
        System.out.println("Hvor mange ting vil du låne?");
        int numberOfItems = scanner.nextInt();
        scanner.nextLine();

        // Opretter et array til at holde dyrene
        Items[] item = new Items[numberOfItems];

        // Spørger om data på hvert item og gemmer dem i arrayet
        for (int i = 0; i < numberOfItems; i++) {
            System.out.print("Hvilken type genstand ønsker du at låne? \n");
            String type = scanner.nextLine();

            System.out.print("Hvad er navnet på dyret? \n");
            String title = scanner.nextLine();

            // Opretter det rigtige dyr baseret på typen
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

        // Printer alle dyr som er indleveret - Her tæller den en op for hvert dyr.
        System.out.println("LIST OF LOANED ITEMS: \n" + "-----------------");
        for (int i = 0; i < numberOfItems; i++) {
            System.out.println("Registreret genstand nr: " + (i + 1) + "\n" + item[i] + "\n");
        }
    }
}

