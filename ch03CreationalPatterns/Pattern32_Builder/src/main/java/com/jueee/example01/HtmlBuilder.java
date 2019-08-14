package com.jueee.example01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HtmlBuilder extends Builder {

    private String filename;
    private PrintWriter pw;

    public void makeTitle(String title) {
        filename = title + ".html";
        try {
            pw = new PrintWriter(new FileWriter(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        pw.println("<html><head><title>" + title + "</title></head><body>");
        pw.println("<h1>" + title + "</h1>");
    }

    public void makeString(String str) {
        pw.println("<p>" + str + "</p>");
    }

    public void makeItems(String[] items) {
        pw.println("<ul>");
        for (int i = 0; i < items.length; i++) {
            pw.println("<li>" + items[i] + "</li>");
        }
        pw.println("</ul>");
    }

    public void close() {
        pw.println("</body></html>");
        pw.close();
    }

    public String getResult() {
        return filename;
    }
}