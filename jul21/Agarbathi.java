class Agarbathi {
    int id; 
    String brandName; 
    int noOfSticks; 
    String fragrance;
    double price; 
    
    public Agarbathi(int id, String brandName, int noOfSticks, String fragrance, double price) {
        this.id = id;
        this.brandName = brandName;
        this.noOfSticks = noOfSticks;
        this.fragrance = fragrance;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Agarbathi ID: " + id);
        System.out.println("Brand Name: " + brandName);
        System.out.println("Number of Sticks: " + noOfSticks);
        System.out.println("Fragrance: " + fragrance);
        System.out.println("Price: $" + price);
        System.out.println(); 
    }
}
