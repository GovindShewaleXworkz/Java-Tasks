class Bar {
    static String[] wineBrands = new String[15];
    static int index = 0;

    public static boolean addWineBrands(String brandName) {
        if (brandName == null) {
            System.out.println("No wine brand named null exists.");
            return false;
        } else {
            wineBrands[index] = brandName;
            index++;
        }
        return true;
    }
		public static boolean deleteWineBrands(String wine) {
    int target = -1;
    for (int i = 0; i < wineBrands.length; i++) {
        if (wineBrands[i].equals(wine)) {
            target = i;
            break;
        }
    }
    
    if (target == -1) {
        
        return false;
    }
    
    for (int i = target; i < wineBrands.length - 1; i++) {
        wineBrands[i] = wineBrands[i + 1];
        
    }
    
    wineBrands[wineBrands.length - 1] = null;
    
    return true;
}

    public static boolean updateWineBrand(String oldName, String newName) {
        for (int i = 0; i < wineBrands.length; i++) {
            if (wineBrands[i] != null && wineBrands[i].equals(oldName)) {
                wineBrands[i] = newName;
                System.out.println("Updated wine brand " + oldName + " to " + newName);
                return true;
            }
        }
        return false;
    }

    public static void getAllBrands() {
        System.out.println("Available wine brands:");
        for (int i = 0; i < wineBrands.length; i++) {
            if (wineBrands[i] != null) {
                System.out.println((i + 1) + ") " + wineBrands[i]);
            }
        }
        System.out.println();
    }
}
