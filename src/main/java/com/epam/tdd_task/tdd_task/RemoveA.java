package com.epam.tdd_task.tdd_task;

public class RemoveA {
	
	public String remove(String string) {
		String res=string;
		int stringLen=string.length();
		if(stringLen>=1) {
			char first=string.charAt(0),second=string.charAt(1);
			if(first=='A' && second=='A') {
				res=string.substring(2,stringLen);
			}
			else if(first=='A') {
				res=string.substring(1,stringLen);
			}
			else if(second=='A') {
				res=first+string.substring(2,stringLen);
			}
		}
		return res;
	}
	
}
