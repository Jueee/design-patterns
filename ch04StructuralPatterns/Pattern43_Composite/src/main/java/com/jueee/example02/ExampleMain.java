package com.jueee.example02;

import java.io.File;

public class ExampleMain {


    public static void createTree(Component node) throws Exception{
        File file = new File(node.name);
        File[] f = file.listFiles();
        for(File fi : f){
            if(fi.isFile()){
                Leaf filer = new Leaf(fi.getAbsolutePath());
                node.addComponent(filer);
            }
            if(fi.isDirectory()){
                Composite noder = new Composite(fi.getAbsolutePath());
                node.addComponent(noder);
                createTree(noder);//使用递归生成树结构
            }
        }
    }
    
    public static void main(String[] args) {
        //定义所有的组合对象
        Composite root = new Composite("E:\\kcha");
        try {
            createTree(root);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //调用根对象的输出功能来输出整棵树
        root.display();
    }
}
