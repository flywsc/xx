package com.wsc201819;

import java.util.Random;

public class _08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] init=new int [10];
		int[] all_candy=new int [10];
		int[] half_candy=new int [10];
	    Random rd=new Random();
	    int count=0;
	    for(int i=0;i<all_candy.length;i++) {
	    	init[i]=(rd.nextInt(15)+1);
	    	all_candy[i]=init[i];
	    }
	     
	    while (!june(all_candy)) {
	    	count++;
	    	for(int i=0;i<all_candy.length;i++) {
	    	if(all_candy[i]%2!=0) {
	    		half_candy[i]=all_candy[i]/2;
	    		all_candy[i]=half_candy[i]+all_candy[i];	
	    	}else {
	    		all_candy[i]+=1;
	    	}
	    }
	    	for(int i=0;i<all_candy.length;i++) {
	          if(i<=all_candy.length) {
	        	  all_candy[i+1]= all_candy[i+1]+half_candy[i];
	          }  else {
	        	  all_candy[0]=all_candy[0]+half_candy[half_candy.length-1];
	          }
	    	}
	    	for(int i=0;i<all_candy.length;i++) {
	    	System.out.println("经过"+count+"次"+"小孩手里糖一样是"+all_candy[i]);
	    	}
	}
	}


	
	
	
	
	
	public static boolean june(int[] arr) {
	boolean val = true;
	for (int i = 0; i < arr.length - 1; i++) {
		if (arr[i] != arr[i + 1]) {
			val = false;
			break;
		}
	}
	return val;

}

}