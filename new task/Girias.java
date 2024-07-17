public class Girias {
    static String[] homeAppliances = {null, null, null, null, null, null, null, null, null, null, null, null};
    static int index = 0;

    public static boolean createHomeAppliance(String appliance) {
        if (appliance == null) {
            System.out.println("Appliance name cannot be null");
            return false;
        }
        if (index >= homeAppliances.length) {
            System.out.println("Cannot add more home appliances. Array is full.");
            return false;
        } else {
            homeAppliances[index] = appliance;
            index++;
            return true;
        }
    }

    public static void getHomeAppliances() {
        System.out.println("The available home appliances are:");
        for (int i = 0; i < homeAppliances.length; i++) {
            System.out.println(i + ") " + homeAppliances[i]);
        }
    }
}
