package com.jueee.example02;

/**
 *  实现文件节点
 *	
 *	@author hzweiyongqiang
 */
public class Leaf extends Component {

  //通过构造器为文件节点命名
    public Leaf(String name) {
        super(name);
    }
    //显示文件节点
    @Override
    public void display() {
        System.out.println(name);
    }
    
}