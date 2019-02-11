package com.cg.mra.service;

import com.cg.mra.beans.Account;

public interface AccountService {
Account getAccountDetails(String mobno);
int rechargeAccount(String mobno,double rechargeAmount);
}
