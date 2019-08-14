package com.jueee.example01.list;

import java.util.Iterator;

import com.jueee.example01.item.Item;
import com.jueee.example01.item.Page;

// 零件的具体类，继承抽象，实现其中的抽象方法，Buffer存储html页面内容
public class ListPage extends Page {

    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        // TODO Auto-generated method stub
        StringBuffer buffer = new StringBuffer();
        buffer.append("<html><head><title>" + title + "</title><head>\n");
        buffer.append("<body>");
        buffer.append("<h1>" + title + "</n>");
        buffer.append("<ul>\n");
        Iterator<Item> it = content.iterator();
        while (it.hasNext()) {
            Item item = (Item)it.next();
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("<hr><adress>" + author + "</adress>");
        buffer.append("</body></html>\n");
        return buffer.toString();
    }

}
