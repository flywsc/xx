package com.wsc201821;

public class _14 {
	
	//判断字符串末尾的内容，返回一个布尔类型的返回值
	public static void main(String[] args) {
      String name="helloworld.java";
      boolean end=name.endsWith(".java");
      System.out.println(end);
      System.out.println();//空一个以便看下面
      
      
      
      //判断句首内容
      String start0="新华社记者";
      String start1="人民社记者";
      String start2="头条社记者";
      String start3="东方社记者";
      boolean start=start0.startsWith("新华社");//判断首字母是不是新华社
      boolean star=start3.startsWith("人民社");//判断首字母是不是人民社
      System.out.println(start);
      System.out.println(star);
    	//如果符合就返回true,否则就是flase	  
	}
}
