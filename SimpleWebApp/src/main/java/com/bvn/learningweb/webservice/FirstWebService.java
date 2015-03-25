package com.bvn.learningweb.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style=SOAPBinding.Style.RPC)
public class FirstWebService {
	
	@WebMethod
	public int add(int a, int b) {
		System.out.println("Result = " + (a+b+10));
		return (a + b + 10);
	}
}