package com.jueee.example02;

import java.util.ArrayList;
import java.util.List;

/**
 * 实现目录节点
 * 
 * @author hzweiyongqiang
 */
public class Composite extends Component {
    List<Component> nodeList = new ArrayList<Component>();// 内部节点列表（包括文件和下级目录）
    // 通过构造器为当前目录节点赋名

    public Composite(String name) {
        super(name);
    }

    // 新增节点
    public void addComponent(Component node) throws Exception {
        nodeList.add(node);
    }

    // 递归循环显示下级节点
    @Override
    void display() {
        System.out.println(name);
        for (Component node : nodeList) {
            node.display();
        }
    }
    
}
