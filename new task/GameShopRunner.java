class GameShopRunner{
	public static void main(String[] games){
		
		boolean isAdded=GameShop.addGameName("Grand Theft Auto 6");
		System.out.println("is game added:"+isAdded);
		boolean isPriceAdded=GameShop.addGamePrice(5000.00);
		
		isAdded=GameShop.addGameName("Cyberpunk");
		System.out.println("is game added:"+isAdded);
		isPriceAdded=GameShop.addGamePrice(4000.00);
		
		isAdded=GameShop.addGameName("Elden Ring");
		System.out.println("is game added:"+isAdded);
		isPriceAdded=GameShop.addGamePrice(5500.00);
		
		isAdded=GameShop.addGameName("The dark WuKong");
		System.out.println("is game added:"+isAdded);
		isPriceAdded=GameShop.addGamePrice(10000.00);
	
		isAdded=GameShop.addGameName("The Ghost of Tsushima");
		System.out.println("is game added:"+isAdded);
		isPriceAdded=GameShop.addGamePrice(7000.00);
		
		isAdded=GameShop.addGameName("PUBG");
		System.out.println("is game added:"+isAdded);
		isPriceAdded=GameShop.addGamePrice(3000.00);
		

		isAdded=GameShop.addGameName("NEED FOR SPEED");
		System.out.println("is game added:"+isAdded);
		isPriceAdded=GameShop.addGamePrice(9000.00);

		isAdded=GameShop.addGameName("Spider-Man:Miles Morales");
		System.out.println("is game added:"+isAdded);
		isPriceAdded=GameShop.addGamePrice(10000.00);

		isAdded=GameShop.addGameName("The Witcher");
		System.out.println("is game added:"+isAdded);
		isPriceAdded=GameShop.addGamePrice(10000.00);



		
		
		
		
		boolean isGameDeleted=GameShop.deleteGame("Call of Duty: Modern Warfare 3");
		
		System.out.println("is game deleted ?;"+isGameDeleted);
		
		boolean isGameUpdated=GameShop.updateGame("Cyberpunk","Horizon Zero Dawn",7000.00);
		System.out.println("is game updated: "+isGameUpdated);
		GameShop.getGameNames();
	}
}