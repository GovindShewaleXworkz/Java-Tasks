class Liberty {
    static String[] shoeBrands = new String[15];
    static int index = 0;

    public static boolean addShoeBrands(String brandName) {
        if (brandName == null) {
            System.out.println("No shoe brand named null exists.");
            return false;
        } else {
            shoeBrands[index] = brandName;
            index++;
        }
        return true;
    }

    public static boolean updateShoeBrand(String oldName, String newName) {
        for (int i = 0; i < shoeBrands.length; i++) {
            if (shoeBrands[i] != null && shoeBrands[i].equals(oldName)) {
                shoeBrands[i] = newName;
                System.out.println("Updated shoe brand " + oldName + " to " + newName);
                return true;
            }
        }
        return false;
    }
	public static boolean deleteShoeBrand(String ShoeBrand) {
    int target = -1;
    for (int i = 0; i < shoeBrands.length; i++) {
        if (shoeBrands[i].equals(ShoeBrand)) {
            target = i;
            break;
        }
    }
    
    if (target == -1) {
        
        return false;
    }
    
    for (int i = target; i < shoeBrands.length - 1; i++) {
        shoeBrands[i] = shoeBrands[i + 1];
        
    }
    
    shoeBrands[shoeBrands.length - 1] = null;
    
    return true;
}

    public static void getAllShoeBrands() {
        System.out.println("Available shoe brands:");
        for (int i = 0; i < shoeBrands.length; i++) {
            if (shoeBrands[i] != null) {
                System.out.println((i + 1) + ") " + shoeBrands[i]);
            }
        }
        System.out.println();
    }
}
