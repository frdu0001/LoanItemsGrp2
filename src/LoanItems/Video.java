package LoanItems;

//Subclass
class video extends items {

    public video(String title, String type) {
        super(title, type);
    }

    //Getters

    public String getTitle (){
        return title;
    }

    public String getType (){
        return type;
    }

    //Setters

    public String setType (){
        return type;
    }

    public String setType (){
        return type;
    }


    @Override
    public String toString() {
        return "Title: " + title + "\nType: " + type + "\n";
    }
}
