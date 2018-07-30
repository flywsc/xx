package com.wwwshangmain;

public class _05 {
	private static final int i = 0;

	public static void main(String[] args) {

		int[] liming = { 170, 80 };

		/*
		 * int[] zhang = liming;//这是错误的赋值方法，直接赋值地址 zhang[0] = 180; zhang[1] = 90;
		 */
		int[] zhang = { 180, 90 };
		/*
		 * 或者还可以这样写 int []zhang=new int[2]; zhang[0]=180; zhang[1]=90;
		 * 
		 */
		for (int i = 0; i < liming.length; i++) {
			System.out.print("这是张的身高" + zhang[i]);

		}
		System.out.println();
		for (int i = 0; i < liming.length; i++) {

			System.out.print("这是李明的身高" + liming[i]);

		}
         System.out.println();
		int[] wang = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] dong = new int[9];
		for (int k = 0; k < wang.length; k++){					
			dong[k] = wang[k];
		}
		for (int j = 0; j < dong.length; j++) {
			System.out.println(dong[j]);
		}
	}

}
