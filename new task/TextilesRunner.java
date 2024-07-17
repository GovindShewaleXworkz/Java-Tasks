class TextilesRunner {
    public static void main(String[] args) {
        Textiles.addMaterial("Cotton");
        Textiles.addMaterial("Silk");
        Textiles.addMaterial("Linen");
        Textiles.addMaterial("Wool");
        Textiles.addMaterial("Polyester");
        Textiles.addMaterial("Nylon");
        Textiles.addMaterial("Rayon");
        Textiles.addMaterial("Acrylic");
        Textiles.addMaterial("Spandex");
        Textiles.addMaterial("Bamboo");
        Textiles.addMaterial("Hemp");
        Textiles.addMaterial("Cashmere");
        Textiles.addMaterial("Leather");
        Textiles.addMaterial("Denim");
		Textiles.deleteMaterial("Denim");

        Textiles.getAllMaterialInfo();

        Textiles.updateMaterial("Silk", "Velvet");
        Textiles.getAllMaterialInfo();
    }
}
