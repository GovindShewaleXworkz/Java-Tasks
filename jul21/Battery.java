class Battery {
    int id;
    String name;
    double weight;

    public Battery(int id, String name, double weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Weight: " + weight + " kg");
        System.out.println(); // Blank line for separation
    }
}
