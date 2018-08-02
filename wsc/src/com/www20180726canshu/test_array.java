package com.www20180726canshu;

public class test_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		_ayyay ar=new _ayyay();
	    int []_array2= {54,32,45,45,12,65,84,35,35,59,45,26};
	    System.out.print("排序前");
	    for(int tem:_array2) {
	    	
	    	System.out.print(tem+"  ");
	    }
		
	    ar.arr(_array2);
	   System.out.print("排序后");
	   for(int tem1:_array2) {
	    	System.out.print(tem1+" ");
	    }
		
	
	}

}
