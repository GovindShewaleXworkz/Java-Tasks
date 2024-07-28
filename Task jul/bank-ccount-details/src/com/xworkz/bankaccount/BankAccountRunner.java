package com.xworkz.bankaccount;

import com.xworkz.bankaccount.dao.BankAccountDAO;
import com.xworkz.bankaccount.dto.BankAccountDTO;

public class BankAccountRunner {
    public static void main(String[] args) {
        BankAccountDAO dao=new BankAccountDAO();
        BankAccountDTO dto=new BankAccountDTO();

        dto.customerId=101;
        dto.accountNumber=1246382;
        dto.bankName="ICICI Bank";
        dto.ifscCode="46fv7uyg";
        dto.address="Rajajinagar, Bangalore";
        dto.branchName="Rajajinagar";
        dto.accountType="Savings";

        dao.createAccountUserDetails(dto);
        dao.getDetails();
    }
}
