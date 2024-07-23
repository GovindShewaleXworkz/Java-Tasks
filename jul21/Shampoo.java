class Shampoo {
    String brandName;
    int id;
    int qty;
    String type;
    double price;
    String mgfDate;
    String expDate;

    public Shampoo(String brandName, int id, int qty, String type, double price, String mgfDate, String expDate) {
        this.brandName = brandName;
        this.id = id;
        this.qty = qty;
        this.type = type;
        this.price = price;
        this.mgfDate = mgfDate;
        this.expDate = expDate;
    }

    public void printDetails() {
        System.out.println("Brand Name: " + brandName);
        System.out.println("ID: " + id);
        System.out.println("Quantity: " + qty);
        System.out.println("Type: " + type);
        System.out.println("Price: $" + price);
        System.out.println("Manufacturing Date: " + mgfDate);
        System.out.println("Expiry Date: " + expDate+"\n");
       
    }
}