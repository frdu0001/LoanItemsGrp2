package LoanItems;


//Subclass
class Book extends Items {

    public Book(String title, String type) {
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

    public String setTitle(){
        return title;
    }


    @Override
    public String toString() {
        return type + "\uD83D\uDCD6" + "\t" + title;
    }
}