package com.wsc201821;

import java.util.Arrays;

public class _04 {
    //用方法排序，但是只能升序
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]= {1,2,3,4,5,6,7,8,9};
    Arrays.sort(a);
    for(int tmp:a) {
    	System.out.println(tmp+" ");
    }
	}

}
