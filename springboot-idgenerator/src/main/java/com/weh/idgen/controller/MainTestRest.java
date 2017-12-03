package com.weh.idgen.controller;

public class MainTestRest {
	public static void main(String[] args) {
		
		String method="generateID";
		String appName ="MyBiz";
		String Url ="http://localhost:8080/"+method+"?appName=";
		
		IDGeneratorController idGenerator = new IDGeneratorController();
		
		idGenerator.generateKey(appName);
		
	}
}
