class NewsPaper {
    int id;
    String name;
    int pageCount;
    String language;
    int price;

    public NewsPaper(int id, String name, int pageCount, String language, int price) {
        this.id = id;
        this.name = name;
        this.pageCount = pageCount;
        this.language = language;
        this.price = price;
    }

    public void getNewsPaperDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Page Count: " + pageCount);
        System.out.println("Language: " + language);
        System.out.println("Price: " + price + " Rs");
        System.out.println(); 
    }
}
