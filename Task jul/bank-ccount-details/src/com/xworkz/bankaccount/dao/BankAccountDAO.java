package com.xworkz.bankaccount.dao;

import com.xworkz.bankaccount.dto.BankAccountDTO;

public class BankAccountDAO {
     BankAccountDTO dto;

    public boolean createAccountUserDetails(BankAccountDTO dto){
        System.out.println("Creating Account User Details");
        boolean isDtoCreated=false;
        if(null!=dto){
            this.dto=dto;
            isDtoCreated=true;
        }else {
            System.out.println("please provide valid Information");
        }
        System.out.println("User Account Details ended!!");
        return isDtoCreated;
    }

    public void getDetails(){
        System.out.println("Customer ID:"+dto.customerId);
        System.out.println("Account No.:"+dto.accountNumber);
        System.out.println("Bank Name:"+dto.bankName);
        System.out.println("Branch Name:"+dto.branchName);
        System.out.println("IFSC Code:"+dto.ifscCode);
        System.out.println("Address:"+dto.address);
        System.out.println("Account Type:"+dto.accountType);

    }
}
