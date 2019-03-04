package com.cg.sp.beans;

import java.util.HashMap;

public class UserCred {
HashMap<String, String> credentials;

public HashMap<String, String> getCredentials() {
	return credentials;
}

public void setCredentials(HashMap<String, String> credentials) {
	this.credentials = credentials;
}

@Override
public String toString() {
	return credentials.toString();
}

}
