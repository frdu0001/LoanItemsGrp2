package LoanItems;


//Subclass
class Book extends Items {

    public Book(String Title, String Type) {
        super(title, type);
    }

    //Getters
    public String getTitle(){
        return title;
    }

    public String getType(){
        return type;
    }

    //Setters
    public String setType(){
        return type;
    }

    public String setType(){
        return type;
    }


    @Override
    public String toString() {
        return "Title: " + title + "\nType: " + type + "\n";
    }
}