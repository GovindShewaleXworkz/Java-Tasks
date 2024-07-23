class Garden {
    String name;
    String location;

    public Garden(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void displayGardenDetails() {
        System.out.println("Garden Name: " + name);
        System.out.println("Location: " + location);
        System.out.println(); 
    }
}
