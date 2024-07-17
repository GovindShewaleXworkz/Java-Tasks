public class Gym {
    static String[] gymEquipments = {null, null, null, null, null, null, null, null};
    static int index = 0;

    public static boolean createGymEquipment(String equipment) {
        if (equipment == null) {
            System.out.println("Equipment name cannot be null");
            return false;
        }
        if (index >= gymEquipments.length) {
            System.out.println("Cannot add more gym equipments. Array is full.");
            return false;
        } else {
            gymEquipments[index] = equipment;
            index++;
            return true;
        }
    }

    public static void getGymEquipments() {
        System.out.println("The available gym equipments are:");
        for (int i = 0; i < gymEquipments.length; i++) {
            System.out.println(i + ") " + gymEquipments[i]);
        }
    }
}
