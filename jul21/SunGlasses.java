public class SunGlasses {
    String model;
    String type;
    double price;

    public SunGlasses(String model, String type, double price) {
        this.model = model;
        this.type = type;
        this.price = price;
    }

    public void getProductDetails() {
        System.out.println("Model: " + model);
        System.out.println("Type: " + type);
        System.out.println("Price: $" + price);
        System.out.println(); 
	}
}
