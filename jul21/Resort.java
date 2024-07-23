class Resort {
    double areaInSft;
    String propertyName;
    String ownerName;
    int noOfRooms;
    
    /*public void enjoy() {
        System.out.println("Place to enjoy wide varieties of games");
    }
    
    public boolean createResort(double areaInSft, String propertyName, String ownerName, int noOfRooms) {
        boolean isResortCreated = false;
        if (propertyName != null && ownerName != null && areaInSft > 0 && noOfRooms > 0) {
            this.areaInSft = areaInSft;
            this.propertyName = propertyName;
            this.ownerName = ownerName;
            this.noOfRooms = noOfRooms;
            isResortCreated = true;
        } else {
            System.out.println("Enter correct details!!");
        }
	return isResortCreated;
    }*/
	
	  public Resort(double areaInSft, String propertyName, String ownerName, int noOfRooms) {
        if (propertyName != null && ownerName != null && areaInSft > 0 && noOfRooms > 0) {
            this.areaInSft = areaInSft;
            this.propertyName = propertyName;
            this.ownerName = ownerName;
            this.noOfRooms = noOfRooms;
        } else {
            System.out.println("Enter correct details!!");
        }
    }
    
    public void getResortDetails() {
        System.out.println("Resort Name: " + propertyName);
        System.out.println("Owner: " + ownerName);
        System.out.println("Area in Sq. Ft: " + areaInSft);
        System.out.println("Number of Rooms: " + noOfRooms);
    }
}