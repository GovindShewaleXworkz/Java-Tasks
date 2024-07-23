class AccountDetails{

	int customerId;
	String bankName;
	String branchName;
	String ifscCode;
	long accountNumber;
	String address;
	String accountType;
	
	
	public AccountDetails(int customerId,String bankName,String branchName,String ifscCode,long accountNumber,String address,String accountType){	//parametersied constructor
	System.out.println("The object is created");
	System.out.println("parametersied constructor is invoked");
	this.customerId=customerId;
	this.bankName=bankName;
		this.branchName		= branchName;
			this.ifscCode		= ifscCode;
			this.accountNumber		= accountNumber;
			this.address	= address;
			this.accountType	= accountType;
	
	}
	
	/*public void createAccount(int customerId,String bankName,String branchName,String ifscCode,long accountNumber,String address,String accountType){
	
		
		this.customerId	= customerId;
		this.bankName = bankName;
		this.branchName = branchName;
		this.ifscCode = ifscCode;
		this.accountNumber = accountNumber;
		this.address = address;
		this.accountType = accountType;
	
	
	
	}*/
	
	public void getAccountDetails(){
	
	System.out.println("customerId is:"+this.customerId);
	System.out.println("bankName is:"+this.bankName);
	System.out.println("branchName is:"+this.branchName);
	System.out.println("ifscCode is:"+this.ifscCode);
	System.out.println("accountNumber is:"+this.accountNumber);
	System.out.println("accountType is:"+this.accountType);
	System.out.println("address is:"+this.address);

	
	}






}