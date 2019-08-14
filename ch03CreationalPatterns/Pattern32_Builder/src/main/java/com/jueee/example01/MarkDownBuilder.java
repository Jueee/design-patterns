package com.jueee.example01;

public class MarkDownBuilder extends Builder {

    StringBuffer sb = new StringBuffer();

    public void makeTitle(String title) {
        sb.append("## " + title + "\n");
    }

    public void makeString(String str) {
        sb.append("**" + str + "**\n");
    }

    public void makeItems(String[] items) {
        for (int i = 0; i < items.length; i++) {
            sb.append("-\t" + items[i] + "\n");
        }
        sb.append("\n");
    }

    public void close() {
        sb.append("close");
    }

    public String getResult() {
        return sb.toString();
    }

}
