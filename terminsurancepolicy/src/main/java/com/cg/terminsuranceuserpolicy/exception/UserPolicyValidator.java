package com.cg.terminsuranceuserpolicy.exception;



import java.util.regex.*;

public class UserPolicyValidator {
	
	
	public boolean validatePolicyId(Integer policyId)throws ResourceNotFoundException {
		String regex="^[0-9]*$";
		Pattern pat=Pattern.compile(regex);
		Matcher m=null;
		try {
		 m =pat.matcher(String.valueOf(policyId));
		}catch(NumberFormatException e) {
			//throw new ResourceNotFoundException("enter a valid Id");
			}
		return m.matches();
	}
}
