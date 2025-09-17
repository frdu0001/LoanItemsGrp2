package LoanItems;

class Items {
    protected String type;
    protected String title;

    public Items(String Type, String Title){
        this.type=Type;
        this.title=Title;
    }
    //getters
    public String getType() { return type; }
    public String getTitle() { return title; }

    //setters
    public String setType() { return type; }
    public String setTitle() { return title; }
}
