package com.wsc201821;
/**
 * 用一个方法
 */
import java.util.Arrays;

public class _02 {
	public static void main(String[] args) {
     int a[]= {1,2,3,4,5,6,7,8,9,10};
     int b[]=Arrays.copyOfRange(a, 1,6);//复制指定位置数组的位置1.是开始位置（包括），6，复制到索引为6的位置（不包括），从一开始
    //后面的6必须要比前面的1大
     //等于就没有任何意义
     for( int tmp:b) {
    	 System.out.println(tmp);
     }

	
	}
}
