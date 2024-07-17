class GoldShop {
    static String[] goldItems = new String[7];
    static int index = 0;

    public static boolean addGoldItem(String goldName) {
        if (goldName == null) {
            System.out.println("No gold item named null exists.");
            return false;
        } else {
            goldItems[index] = goldName;
            index++;
        }
        return true;
    }

    public static boolean updateGoldItem(String oldName, String newName) {
        for (int i = 0; i < goldItems.length; i++) {
            if (goldItems[i] != null && goldItems[i].equals(oldName)) {
                goldItems[i] = newName;
                System.out.println("Updated gold item " + oldName + " to " + newName);
                return true;
            }
        }
        return false;
    }
	

    public static void getAllGoldItems() {
        System.out.println("Available gold items:");
        for (int i = 0; i < goldItems.length; i++) {
            if (goldItems[i] != null) {
                System.out.println((i + 1) + ") " + goldItems[i]);
            }
        }
        System.out.println();
    }
}
