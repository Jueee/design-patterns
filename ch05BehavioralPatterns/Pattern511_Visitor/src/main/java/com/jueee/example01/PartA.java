package com.jueee.example01;

/**
 * 具体元素角色（Concrete Element）：实现由元素角色提供的Accept 操作。
 */
public class PartA implements Element {

   String s = "PartA";

   /**
    * 允许访问者，访问自己
    * 
    * @param visitor
    */
   public void accept(Visitor visitor) {
      // 关键实现
      visitor.visit(this);
   }

   public String getName() {
      return s;
   }

}
