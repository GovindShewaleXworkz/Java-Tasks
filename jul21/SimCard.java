public class SimCard {
    int id;
    String provider;
    String plan;

    public SimCard(int id, String provider, String plan) {
        this.id = id;
        this.provider = provider;
        this.plan = plan;
    }

    public void getSimDetails() {
        System.out.println("ID: " + id);
        System.out.println("Provider: " + provider);
        System.out.println("Plan: " + plan);
        System.out.println(); 
    }

}
