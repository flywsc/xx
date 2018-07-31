package com.wsc20180731name;

public class coustomer {
    
	String []names=new String[5];
	public void add_name( String newname) {
		for(int i=0;i<names.length;i++) {
			if(names[i]==null) {
				names[i]=newname;
				break;
			}
		}
	}
	public void show() {
		for(int i=0;i<names.length;i++) {
			if(names[i]==null) {
			break;	
			}
			System.out.println(names[i]);
		}
	}
	
}
