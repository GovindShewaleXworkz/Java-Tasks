class GameShop{
	static String gameNames[]={null,null,null,null,null,null,null,null,null};
	static double gamePrice[]={0,0,0,0,0,0,0,0,0,0};
	static int index1;
	static int index2;
	
	public static boolean addGameName(String gameName){
		
		if(gameName==null){
			System.out.println("No game named null exist");
			return false;
		}
		else{
			gameNames[index1]=gameName;
			index1++;
			
		}
		return true;
		
	}
	public static boolean addGamePrice(double price){
		
		if(price==0.0){
			System.out.println("We can't give games for free");
			return false;
		}
		else{
			gamePrice[index2]=price;
			index2++;
			
		}
		return true;
		
	}
	
	public static boolean updateGame(String oldName,String newName,double newPrice){
		
		
		for(int i=0;i<gameNames.length;i++){
			if(gameNames[i]==oldName){
				gameNames[i]=newName;
				gamePrice[i]=newPrice;
				System.out.println("The game "+oldName+" is replaced by "+newName+" priced at Rs."+newPrice);
				return true;
			}
			
			
		}
		return false;
		
	}
	
	public static boolean deleteGame(String gameName){
		int target=0;
		for(int i=0;i<gameNames.length;i++){
			if(gameNames[i]==gameName){
				target=i;

				return true;
			}
			
		}
			for(int i=target;i<gameNames.length-1;i++){
			gameNames[i]=gameNames[i+1];
			gamePrice[i]=gamePrice[i+1];
			
		}
		
		return false;
		
	}
	
	public static void getGameNames(){
		System.out.println();
		System.out.println("The available games are:");
		System.out.println();
		for(int i=0;i<gameNames.length;i++){
			System.out.println((i+1)+")"+gameNames[i]);
			System.out.println(" Price Rs."+gamePrice[i]);
			System.out.println();
		}
			
		
	}
}