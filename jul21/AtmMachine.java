
class AtmMachine {
    int id;
    String brand;
    String bankName;
    String location;

    // Constructor to initialize AtmMachine object
    public AtmMachine(int id, String brand, String bankName, String location) {
        this.id = id;
        this.brand = brand;
        this.bankName = bankName;
        this.location = location;
    }

    // Method to display details of the ATM machine
    public void displayDetails() {
        System.out.println("ATM ID: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Bank Name: " + bankName);
        System.out.println("Location: " + location);
        System.out.println(); // Empty line for separation
    }
}
