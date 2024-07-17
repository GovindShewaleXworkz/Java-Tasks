class LibertyRunner {
    public static void main(String[] args) {
        Liberty.addShoeBrands("Nike");
        Liberty.addShoeBrands("Adidas");
        Liberty.addShoeBrands("Puma");
        Liberty.addShoeBrands("Reebok");
        Liberty.addShoeBrands("Under Armour");
        Liberty.addShoeBrands("Asics");
        Liberty.addShoeBrands("New Balance");
        Liberty.addShoeBrands("Converse");
        Liberty.addShoeBrands("Skechers");
        Liberty.addShoeBrands("Vans");
        Liberty.addShoeBrands("Fila");
        Liberty.addShoeBrands("Salomon");
        Liberty.addShoeBrands("Brooks");
        Liberty.addShoeBrands("Mizuno");
        Liberty.addShoeBrands("Saucony");
		boolean isShoeDeleted=Liberty.deleteShoeBrand("Saucony");
		System.out.println("is Saucony deleted ?;"+isShoeDeleted);

        Liberty.getAllShoeBrands();

        Liberty.updateShoeBrand("Adidas", "Hoka One One");
        Liberty.getAllShoeBrands();
    }
}
