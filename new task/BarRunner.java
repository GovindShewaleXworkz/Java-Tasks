class BarRunner {
    public static void main(String[] args) {
        Bar.addWineBrands("Chardonnay");
        Bar.addWineBrands("Merlot");
        Bar.addWineBrands("Cabernet Sauvignon");
        Bar.addWineBrands("Pinot Noir");
        Bar.addWineBrands("Sauvignon Blanc");
        Bar.addWineBrands("Syrah");
        Bar.addWineBrands("Zinfandel");
        Bar.addWineBrands("Riesling");
        Bar.addWineBrands("Malbec");
        Bar.addWineBrands("Gewürztraminer");
        Bar.addWineBrands("Grenache");
        Bar.addWineBrands("Chenin Blanc");
        Bar.addWineBrands("Sangiovese");
        Bar.addWineBrands("Barbera");
        Bar.addWineBrands("Tempranillo");
		Bar.deleteWineBrands("Tempranillo");

        Bar.getAllBrands();

        Bar.updateWineBrand("Merlot", "Carmenere");
        Bar.getAllBrands();
    }
}
