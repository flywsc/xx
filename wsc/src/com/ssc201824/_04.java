package com.ssc201824;

public class _04 {
	public static void main(String[] args) {

       String persion[][]= {{"张三","154254266","2313"},{"小王","131562563552","13541"},{"李宁","18025365895","666"}};
	   for(int i=0;i<persion.length;i++) {
		   for(int j=0;j<persion[i].length;j++) {
			   System.out.print(persion[i][j]+" \t");
		   }
	   System.out.println();
	   }
	}
}
