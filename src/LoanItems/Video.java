package LoanItems;

//Subclass
class video extends items {

    public video(String title, String type) {
        super(title, type);
    }

    @Override
    public String toString() {
        return "Title: " + title + "\nType: " + type + "\n";
    }
}