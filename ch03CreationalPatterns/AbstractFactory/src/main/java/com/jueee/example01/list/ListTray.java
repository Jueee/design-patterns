package com.jueee.example01.list;

import java.util.Iterator;

import com.jueee.example01.item.Item;
import com.jueee.example01.item.Tray;

// 零件的具体类，继承抽象，实现其中的抽象方法
public class ListTray extends Tray {

    public ListTray(String caption) {
        super(caption);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String makeHTML() {
        // TODO Auto-generated method stub
        StringBuffer buffer = new StringBuffer();
        buffer.append("<li>\n");
        buffer.append(caption + "\n");
        buffer.append("<ul>\n");
        Iterator<Item> it = tray.iterator();
        while (it.hasNext()) {
            Item item = (Item)it.next();
            buffer.append(item.makeHTML());

        }
        buffer.append("</ul>\n");
        buffer.append("</li>\n");
        return buffer.toString();
    }

}
