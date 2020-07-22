package com;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringService {
	
	public String str1 = new  String("DevOps");
	public String str2 = new  String("DevOps");
	public String str3 = null ;
	public int val1 = 5;
	public int val2 = 7;
	public String [] expectedArray = {"one", "two", "three"};
	public String [] resultArray = {"one", "two", "three"};
}
