package com.jueee.example01;

public class TextBuilder extends Builder {

    StringBuffer sb = new StringBuffer();

    public void makeTitle(String title) {
        sb.append("=====");
        sb.append("[" + title + "]");
        sb.append("=====" + "\n");
    }

    public void makeString(String str) {
        sb.append("@" + str + "\n");
    }

    public void makeItems(String[] items) {
        for (int i = 0; i < items.length; i++) {
            sb.append("   ." + items[i] + "\n");
        }
    }

    public void close() {
        sb.append("=====================");
    }

    public String getResult() {
        return sb.toString();
    }

}
