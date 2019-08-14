package com.jueee.example02;

/**
 *  将文件与目录统一看作是一类节点，做一个抽象类来定义这种节点，然后以其实现类来区分文件与目录，在实现类中分别定义各自的具体实现内容
 *	@author hzweiyongqiang
 */
public abstract class Component {
    
    protected String name;//名称
    //构造器赋名
    public Component(String name){
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    //新增节点：文件节点无此方法，目录节点重写此方法
    public void addComponent(Component node) throws Exception{
        throw new Exception("Invalid exception");
    }
    //显示节点：文件与目录均实现此方法
    abstract void display();
    
}
