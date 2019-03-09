package com.capgemini.bank.main;

import java.math.BigDecimal;
import java.util.Scanner;

import com.capgemini.bank.bean.Customer;
import com.capgemini.bank.exception.AccountDoesNotExist;
import com.capgemini.bank.exception.InsufficientBalanceException;
import com.capgemini.bank.service.BankService;
import com.capgemini.bank.service.BankServiceImpl;

public class Main {
	public static void main(String args[]) throws AccountDoesNotExist,InsufficientBalanceException
	{
	BankService bankser= new BankServiceImpl();
	Customer cust=new Customer();
	
	System.out.println("Enter 1 for Create Amount");
	System.out.println("Enter 2 for Show Balance");
	System.out.println("Enter 3 for Fund Transfer");
	System.out.println("Enter 4 for Deposit Amount");
	System.out.println("Enter 5 for Withdraw Amount");
	System.out.println("Enter 6 for Exit");
	Scanner scanner=new Scanner(System.in);
	while(true)
	{
		int choice=scanner.nextInt();
		switch(choice)
		{
		case 1:
		{
			System.out.println("Enter the Customer Name");
			String name= scanner.next();
			System.out.println("Enter Mobile Number");
			String mobile=scanner.next();
			if(mobile.matches("\\d{10}"))
			{
				
			}
			else
			{
				System.out.println("Not a valid Number");
				System.out.println("Do again all Input");
				break;
			}
			System.out.println("Enter the Balance");
			BigDecimal bal=scanner.nextBigDecimal();
			cust= bankser.createAccount(name, mobile, bal);
			System.out.println("Account Created");
			System.out.println("Name :" +cust.getName());
			System.out.println("Mobile No.:"+cust.getMobileNo());
			System.out.println("Balance:"+cust.getWallet().getBalance());
			break;
		}
		case 2:
		{
			try {
			System.out.println("Enter the Mobile Number");
			String mobile=scanner.next();
			cust= bankser.showBalance(mobile);
			System.out.println("Your Balance is : "+cust.getWallet().getBalance());
			break;
		}
			catch(AccountDoesNotExist e)
			{
				System.out.println(e);
			}
		}
		case 3:
		{
			try
			{
			System.out.println("Enter your Mobile Number(Source)");
			String mobilesou=scanner.next();
			System.out.println("Enter the another Mobile Number(Target)");
			String mobiletag=scanner.next();
			System.out.println("Enter the Amount to be Transfer");
			BigDecimal amount=scanner.nextBigDecimal();
			cust=bankser.fundTransfer(mobilesou, mobiletag, amount);
			System.out.println("Your Balance is :"+cust.getWallet().getBalance());
			break;
		}
			catch(AccountDoesNotExist|InsufficientBalanceException e)
			{
				System.out.println(e);
			}
		}
		case 4:
		{
			try {
			System.out.println("Enter the Mobile Number");
			String mobile=scanner.next();
			System.out.println("Enter the Amount to Deposit");
			BigDecimal amount=scanner.nextBigDecimal();
			cust= bankser.depositAmount(mobile, amount);
			System.out.println("New Amount:"+cust.getWallet().getBalance());
			break;
		}
		catch(AccountDoesNotExist|InsufficientBalanceException e)
		{
			System.out.println(e);
		}
	}
		case 5:
		{
			try {
			System.out.println("Enter the Mobile Number");
			String mobile=scanner.next();
			System.out.println("Enter the Amount to Withdraw");
			BigDecimal amount=scanner.nextBigDecimal();
			cust= bankser.withdrawAmount(mobile, amount);
			System.out.println("New Amount:"+cust.getWallet().getBalance());
			break;
		}
		catch(AccountDoesNotExist|InsufficientBalanceException e)
		{
			System.out.println(e);
		}
	}
		case 6:
		{
			System.exit(0);
		}
		default:
			System.out.println("Wrong Choice");
		
		}
		
	}
	}
}