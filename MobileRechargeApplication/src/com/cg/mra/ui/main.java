package com.cg.mra.ui;
import com.cg.mra.service.*;
import com.cg.mra.dao.*;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		AccountDao a=	new  AccountDaoImpl();
		System.out.println("enter 1 for account bal enquiry");
		System.out.println("enter 2 for recharge account");
		System.out.println("enter 3 for exit");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		//System.out.println("enter ur choice");
		switch(choice) {
		case 1:
			System.out.println(a.getAccountDetails("7500800149"));
			break;
		case 2:
			System.out.println(a.rechargeAccount("7500800150", 500.00));
			break;
		case 3:
	         System.exit(0);
	    default:
	    	System.out.println("wrong choice");
		}
		

	}

}
