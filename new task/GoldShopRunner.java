class GoldShopRunner {
    public static void main(String[] args) {
        GoldShop.addGoldItem("Gold Necklace");
        GoldShop.addGoldItem("Gold Ring");
        GoldShop.addGoldItem("Gold Bracelet");
        GoldShop.addGoldItem("Gold Earrings");
        GoldShop.addGoldItem("Gold Pendant");
        GoldShop.addGoldItem("Gold Bangle");
        GoldShop.addGoldItem("Gold Chain");
        
        GoldShop.getAllGoldItems();
        
        GoldShop.updateGoldItem("Gold Ring", "Gold Crown");
        GoldShop.getAllGoldItems();
    }
}
