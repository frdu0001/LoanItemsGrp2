package LoanItems;

//Subclass
class Video extends Items {

    public Video(String title, String type) {
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
        return type + "\uD83D\uDCFC" + "\t" + title;
    }
}
