class Textiles {
    static String[] materials = new String[14];
    static int index = 0;

    public static boolean addMaterial(String material) {
        if (material == null) {
            System.out.println("No material named null exists.");
            return false;
        } else {
            materials[index] = material;
            index++;
        }
        return true;
    }

    public static boolean updateMaterial(String oldName, String newName) {
        for (int i = 0; i < materials.length; i++) {
            if (materials[i] != null && materials[i].equals(oldName)) {
                materials[i] = newName;
                System.out.println("Updated material " + oldName + " to " + newName);
                return true;
            }
        }
        return false;
    }
		public static boolean deleteMaterial(String Material) {
    int target = -1;
    for (int i = 0; i < materials.length; i++) {
        if (materials[i].equals(Material)) {
            target = i;
            break;
        }
    }
    
    if (target == -1) {
        
        return false;
    }
    
    for (int i = target; i < materials.length - 1; i++) {
        materials[i] = materials[i + 1];
        
    }
    
    materials[materials.length - 1] = null;
    
    return true;
}


    public static void getAllMaterialInfo() {
        System.out.println("Available materials:");
        for (int i = 0; i < materials.length; i++) {
            if (materials[i] != null) {
                System.out.println((i + 1) + ") " + materials[i]);
            }
        }
        System.out.println();
    }
}
