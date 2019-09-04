package com.jueee.example02;

/* 
 * 状态操作接口，执行上一个下一个的操作,还可以获得当前的状态 
 * 当然在这可以既执行别的操作，比如开关拨到某个颜色的时候，颜色对应的灯亮 
 */  
  
public interface State {  
  
    public  void last(Context c);  
  
    public  void next(Context c);  
      
    public  String getState();  
  
  
}  