class WatchShopRunner {
    public static void main(String[] args) {
        WatchShop.addWatchBrandNames("Rolex");
        WatchShop.addWatchBrandNames("Omega");
        WatchShop.addWatchBrandNames("Tag Heuer");
        WatchShop.addWatchBrandNames("Casio");
        WatchShop.addWatchBrandNames("Timex");
        WatchShop.addWatchBrandNames("Fossil");
        WatchShop.addWatchBrandNames("Seiko");
        WatchShop.addWatchBrandNames("Citizen");
        WatchShop.addWatchBrandNames("Tissot");
        WatchShop.addWatchBrandNames("Swatch");
		WatchShop.deleteWatch("Swatch");

        WatchShop.getAllWatchBrands();

        WatchShop.updateWatchBrands("Omega", "Longines");
        WatchShop.getAllWatchBrands();
    }
}
