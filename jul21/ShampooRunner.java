class ShampooRunner{

    public static void main(String[] wash) {
        Shampoo shampoo = new Shampoo();
        shampoo.brandName = "Head & Shoulders";
		shampoo.id=1;
        shampoo.qty = 1;
        shampoo.type = "Anti-dandruff";
        shampoo.price = 6;
        shampoo.mgfDate = "2023-01-01";
        shampoo.expDate = "2024-12-31";
		
		System.out.println("Shampoo brand"+shampoo.brandName+"\n"+"id :" +shampoo.id+"\n"+"quantity: "+shampoo.qty+"\n"+"type"+shampoo.type+"\n"+
		"price: "+shampoo.price+"\n"+"mgfDate: "+shampoo.mgfDate+"\n"+"expDate :"+shampoo.expDate);
        
		Shampoo shampoo1 = new Shampoo();
		shampoo1.brandName ="Clink plus";
		shampoo1.id=2;
        shampoo1.qty = 3;
        shampoo1.type = "Hair-Volume";
        shampoo1.price = 3;
        shampoo1.mgfDate = "2023-01-01";
        shampoo1.expDate = "2024-12-31";
		System.out.println("\n"+"Shampoo brand"+shampoo1.brandName+"\n"+"id :" +shampoo1.id+"\n"+"quantity: "+shampoo1.qty+"\n"+"type"+shampoo1.type+"\n"+
		"price: "+shampoo1.price+"\n"+"mgfDate: "+shampoo1.mgfDate+"\n"+"expDate :"+shampoo1.expDate);
		
		Shampoo shampoo3 = new Shampoo();
        shampoo3.brandName = "Pantene";
        shampoo3.id = 3;
        shampoo3.qty = 2;
        shampoo3.type = "Smooth & Silky";
        shampoo3.price = 5;
        shampoo3.mgfDate = "2023-01-01";
        shampoo3.expDate = "2024-12-31";

        System.out.println("Brand Name: " + shampoo3.brandName);
        System.out.println("ID: " + shampoo3.id);
        System.out.println("Quantity: " + shampoo3.qty);
        System.out.println("Type: " + shampoo3.type);
        System.out.println("Price: $" + shampoo3.price);
        System.out.println("Manufacturing Date: " + shampoo3.mgfDate);
        System.out.println("Expiry Date: " + shampoo3.expDate);
		
		Shampoo shampoo4 = new Shampoo();
        shampoo4.brandName = "Dove";
        shampoo4.id = 4;
        shampoo4.qty = 1;
        shampoo4.type = "Moisturizing";
        shampoo4.price = 4;
        shampoo4.mgfDate = "2023-01-01";
        shampoo4.expDate = "2024-12-31";

        System.out.println("Shampoo 4:");
        System.out.println("Brand Name: " + shampoo4.brandName);
        System.out.println("ID: " + shampoo4.id);
        System.out.println("Quantity: " + shampoo4.qty);
        System.out.println("Type: " + shampoo4.type);
        System.out.println("Price: " + shampoo4.price);
        System.out.println("Manufacturing Date: " + shampoo4.mgfDate);
        System.out.println("Expiry Date: " + shampoo4.expDate);
		
		Shampoo shampoo5 = new Shampoo();
        shampoo5.brandName = "Herbal Essences";
        shampoo5.id = 5;
        shampoo5.qty = 2;
        shampoo5.type = "Color Me Happy";
        shampoo5.price = 5;
        shampoo5.mgfDate = "2023-01-01";
        shampoo5.expDate = "2024-12-31";

        System.out.println("Shampoo 5:");
        System.out.println("Brand Name: " + shampoo5.brandName);
        System.out.println("ID: " + shampoo5.id);
        System.out.println("Quantity: " + shampoo5.qty);
        System.out.println("Type: " + shampoo5.type);
        System.out.println("Price: $" + shampoo5.price);
        System.out.println("Manufacturing Date: " + shampoo5.mgfDate);
        System.out.println("Expiry Date: " + shampoo5.expDate);
		
		
        Shampoo shampoo6 = new Shampoo();
        shampoo6.brandName = "Sunsilk";
        shampoo6.id = 6;
        shampoo6.qty = 3;
        shampoo6.type = "Coconut Water & Aloe Vera";
        shampoo6.price = 4;
        shampoo6.mgfDate = "2023-01-01";
        shampoo6.expDate = "2024-12-31";

        System.out.println("Shampoo 6:");
        System.out.println("Brand Name: " + shampoo6.brandName);
        System.out.println("ID: " + shampoo6.id);
        System.out.println("Quantity: " + shampoo6.qty);
        System.out.println("Type: " + shampoo6.type);
        System.out.println("Price: $" + shampoo6.price);
        System.out.println("Manufacturing Date: " + shampoo6.mgfDate);
        System.out.println("Expiry Date: " + shampoo6.expDate);
		
		Shampoo shampoo7 = new Shampoo();
        shampoo7.brandName = "Garnier Fructis";
        shampoo7.id = 7;
        shampoo7.qty = 1;
        shampoo7.type = "Sleek & Shine";
        shampoo7.price = 6;
        shampoo7.mgfDate = "2023-01-01";
        shampoo7.expDate = "2024-12-31";

        System.out.println("Shampoo 7:");
        System.out.println("Brand Name: " + shampoo7.brandName);
        System.out.println("ID: " + shampoo7.id);
        System.out.println("Quantity: " + shampoo7.qty);
        System.out.println("Type: " + shampoo7.type);
        System.out.println("Price: $" + shampoo7.price);
        System.out.println("Manufacturing Date: " + shampoo7.mgfDate);
        System.out.println("Expiry Date: " + shampoo7.expDate);
		
		Shampoo shampoo8 = new Shampoo();
        shampoo8.brandName = "Tresemme";
        shampoo8.id = 8;
        shampoo8.qty = 2;
        shampoo8.type = "Smooth & Silky";
        shampoo8.price = 7;
        shampoo8.mgfDate = "2023-01-01";
        shampoo8.expDate = "2024-12-31";

        System.out.println("Shampoo 8:");
        System.out.println("Brand Name: " + shampoo8.brandName);
        System.out.println("ID: " + shampoo8.id);
        System.out.println("Quantity: " + shampoo8.qty);
        System.out.println("Type: " + shampoo8.type);
        System.out.println("Price: $" + shampoo8.price);
        System.out.println("Manufacturing Date: " + shampoo8.mgfDate);
        System.out.println("Expiry Date: " + shampoo8.expDate);
		
		Shampoo shampoo9 = new Shampoo();
        shampoo9.brandName = "Pantene Pro-V";
        shampoo9.id = 9;
        shampoo9.qty = 1;
        shampoo9.type = "Repair & Protect";
        shampoo9.price = 6;
        shampoo9.mgfDate = "2023-01-01";
        shampoo9.expDate = "2024-12-31";

        System.out.println("Shampoo 9:");
        System.out.println("Brand Name: " + shampoo9.brandName);
        System.out.println("ID: " + shampoo9.id);
        System.out.println("Quantity: " + shampoo9.qty);
        System.out.println("Type: " + shampoo9.type);
        System.out.println("Price: $" + shampoo9.price);
        System.out.println("Manufacturing Date: " + shampoo9.mgfDate);
        System.out.println("Expiry Date: " + shampoo9.expDate);
		
		 Shampoo shampoo10 = new Shampoo();
        shampoo10.brandName = "Herbal Essences Bio:Renew";
        shampoo10.id = 10;
        shampoo10.qty = 3;
        shampoo10.type = "Volume";
        shampoo10.price = 5;
        shampoo10.mgfDate = "2023-01-01";
        shampoo10.expDate = "2024-12-31";

        System.out.println("Shampoo 10:");
        System.out.println("Brand Name: " + shampoo10.brandName);
        System.out.println("ID: " + shampoo10.id);
        System.out.println("Quantity: " + shampoo10.qty);
        System.out.println("Type: " + shampoo10.type);
        System.out.println("Price: $" + shampoo10.price);
        System.out.println("Manufacturing Date: " + shampoo10.mgfDate);
        System.out.println("Expiry Date: " + shampoo10.expDate);
		
		 Shampoo shampoo11 = new Shampoo();
        shampoo11.brandName = "Dove Men+Care";
        shampoo11.id = 11;
        shampoo11.qty = 1;
        shampoo11.type = "Fresh & Clean";
        shampoo11.price = 4;
        shampoo11.mgfDate = "2023-01-01";
        shampoo11.expDate = "2024-12-31";

        System.out.println("Shampoo 11:");
        System.out.println("Brand Name: " + shampoo11.brandName);
        System.out.println("ID: " + shampoo11.id);
        System.out.println("Quantity: " + shampoo11.qty);
        System.out.println("Type: " + shampoo11.type);
        System.out.println("Price: $" + shampoo11.price);
        System.out.println("Manufacturing Date: " + shampoo11.mgfDate);
        System.out.println("Expiry Date: " + shampoo11.expDate);
		
		Shampoo shampoo12 = new Shampoo();
        shampoo12.brandName = "Suave";
        shampoo12.id = 12;
        shampoo12.qty = 2;
        shampoo12.type = "Daily Clarifying";
        shampoo12.price = 3;
        shampoo12.mgfDate = "2023-01-01";
        shampoo12.expDate = "2024-12-31";

        System.out.println("Shampoo 12:");
        System.out.println("Brand Name: " + shampoo12.brandName);
        System.out.println("ID: " + shampoo12.id);
        System.out.println("Quantity: " + shampoo12.qty);
        System.out.println("Type: " + shampoo12.type);
        System.out.println("Price: $" + shampoo12.price);
        System.out.println("Manufacturing Date: " + shampoo12.mgfDate);
        System.out.println("Expiry Date: " + shampoo12.expDate);
		
		Shampoo shampoo13 = new Shampoo();
        shampoo13.brandName = "Aveeno";
        shampoo13.id = 13;
        shampoo13.qty = 1;
        shampoo13.type = "Sulfate-Free";
        shampoo13.price = 7;
        shampoo13.mgfDate = "2023-01-01";
        shampoo13.expDate = "2024-12-31";

        System.out.println("Shampoo 13:");
        System.out.println("Brand Name: " + shampoo13.brandName);
        System.out.println("ID: " + shampoo13.id);
        System.out.println("Quantity: " + shampoo13.qty);
        System.out.println("Type: " + shampoo13.type);
        System.out.println("Price: $" + shampoo13.price);
        System.out.println("Manufacturing Date: " + shampoo13.mgfDate);
        System.out.println("Expiry Date: " + shampoo13.expDate);
		
		Shampoo shampoo14 = new Shampoo();
        shampoo14.brandName = "Tresemme Keratin Smooth";
        shampoo14.id = 14;
        shampoo14.qty = 1;
        shampoo14.type = "Smoothing";
        shampoo14.price = 8;
        shampoo14.mgfDate = "2023-01-01";
        shampoo14.expDate = "2024-12-31";

        System.out.println("Shampoo 14:");
        System.out.println("Brand Name: " + shampoo14.brandName);
        System.out.println("ID: " + shampoo14.id);
        System.out.println("Quantity: " + shampoo14.qty);
        System.out.println("Type: " + shampoo14.type);
        System.out.println("Price: $" + shampoo14.price);
        System.out.println("Manufacturing Date: " + shampoo14.mgfDate);
        System.out.println("Expiry Date: " + shampoo14.expDate);
		
		Shampoo shampoo15 = new Shampoo();
        shampoo15.brandName = "L'Oréal Paris Elvive Total Repair 5";
        shampoo15.id = 15;
        shampoo15.qty = 2;
        shampoo15.type = "Repairing";
        shampoo15.price = 5;
        shampoo15.mgfDate = "2023-01-01";
        shampoo15.expDate = "2024-12-31";

        System.out.println("Shampoo 15:");
        System.out.println("Brand Name: " + shampoo15.brandName);
        System.out.println("ID: " + shampoo15.id);
        System.out.println("Quantity: " + shampoo15.qty);
        System.out.println("Type: " + shampoo15.type);
        System.out.println("Price: $" + shampoo15.price);
        System.out.println("Manufacturing Date: " + shampoo15.mgfDate);
        System.out.println("Expiry Date: " + shampoo15.expDate);
    }
}

       