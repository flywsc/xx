package com.wsc20180730;
public class menu {
	int chioce;
	int chioce2;
	private int chioce3;
   public void menu1() {
	   System.out.println("��ӭʹ���������ع������ϵͳ");
	   System.out.println("\t1.��¼ϵͳ");
	   System.out.println("\t2.�˳�");
	   System.out.println("********************");
    
   }
   public void menu2() {
	   System.out.println("�������ع������ϵͳ���˵�");
	   System.out.println("******************");
	   System.out.println("\t1.�ͻ���Ϣ����");
	   System.out.println("\t2.�������");
	   System.out.println("******************");
       
   }
  public void menu3() {
	  System.out.println("�������ع�����ϵͳ>�������");
	  System.out.println("********************");
	  System.out.println("\t1.���˴����");
	  System.out.println("\t2.���˳齱");
  }
  
  public int ch0() {	   
	  System.out.println("��ҳ");
	  return 0;
	  
	  }
	
  public int ch1() {
		  System.out.println("������һ��");
		  return 1;
	  
	 
  }
  public int ch2() {
	  System.out.println("�������һ��");
	  return 2;
  }
}

