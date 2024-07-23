class BillRunner{

	public static void main(String[] billGenerate){
	
	
	Bill bill = new Bill();
	bill.billId = 1001;
	bill.billIssueDate = "12/06/2024";
	bill.billDueDate = "11/07/2024";
	bill.billPlan="Special Ipl";
	System.out.println("bill id is "+bill.billId+"\n billIssueDate on :"+bill.billIssueDate+"\n billDueDate on:"+bill.billDueDate+"\n billplan was of:"+bill.billPlan);
	
	Bill bill2 = new Bill();
	bill2.billId = 1002;
	bill2.billIssueDate = "2/06/2024";
	bill2.billDueDate = "1/07/2024";
	bill2.billPlan="29 days ";
	System.out.println("\nbill id is "+bill2.billId+"\n billIssueDate on :"+bill2.billIssueDate+"\n billDueDate on:"+bill2.billDueDate+"\n billplan was of:"+bill2.billPlan);
	
	
	
	}





}