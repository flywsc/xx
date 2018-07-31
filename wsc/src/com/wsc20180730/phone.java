package com.wsc20180730;

public class phone {
  public void download() {
	  System.out.println("手机正在下载");
  }
  public void play() {
	  System.out.println("手机正在播放");
  }
  public void battery() {
	  cell ce=new cell();
	  ce.pingpai="普通电池";
	  ce.colo="黑色";
	  ce.show();
  }
}
