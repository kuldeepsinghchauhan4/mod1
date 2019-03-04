package com.cg.sp.beans;

import java.beans.PropertyEditorSupport;
import java.util.ArrayList;

public class ListEditor extends PropertyEditorSupport{
@Override
public void setAsText(String str) throws IllegalArgumentException{
	ArrayList<String> list=new ArrayList<>();
	String arr[]=str.split(",");
	for(String s:arr) {
		list.add(s);
	}
	setValue(list);
}
}
