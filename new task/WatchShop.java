class WatchShop {
    static String[] watchBrands = new String[10];
    static int index = 0;

    public static boolean addWatchBrandNames(String brandName) {
        if (brandName == null) {
            System.out.println("No watch brand named null exists.");
            return false;
        } else {
            watchBrands[index] = brandName;
            index++;
        }
        return true;
    }

    public static boolean updateWatchBrands(String oldName, String newName) {
        for (int i = 0; i < watchBrands.length; i++) {
            if (watchBrands[i] != null && watchBrands[i].equals(oldName)) {
                watchBrands[i] = newName;
                System.out.println("Updated watch brand " + oldName + " to " + newName);
                return true;
            }
        }
        return false;
    }
	public static boolean deleteWatch(String watch) {
    int target = -1;
    for (int i = 0; i < watchBrands.length; i++) {
        if (watchBrands[i].equals(watch)) {
            target = i;
            break;
        }
    }
    
    if (target == -1) {
        
        return false;
    }
    
    for (int i = target; i < watchBrands.length - 1; i++) {
        watchBrands[i] = watchBrands[i + 1];
        
    }
    
    watchBrands[watchBrands.length - 1] = null;
    
    return true;
}


    public static void getAllWatchBrands() {
        System.out.println("Available watch brands:");
        for (int i = 0; i < watchBrands.length; i++) {
            if (watchBrands[i] != null) {
                System.out.println((i + 1) + ") " + watchBrands[i]);
            }
        }
        System.out.println();
    }
}
