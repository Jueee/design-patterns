package com.jueee.example02;

import java.util.List;

public class BookBatchMySQLExecute extends AbstractMySQLExecute<List<Book>> {

    @Override
    String buildSQL() {
        return "insert into book(`author`,`description`,`isbn`,`title`,`reader_username`) values(?, ?, ?, ?, ?)";
    }

    @Override
    protected void doInvoke(List<Book> stats) throws Exception {
        for(Book stat:stats) {
            ps.setString(1, stat.getAuthor());
            ps.setString(2, stat.getDescription());
            ps.setString(3, stat.getIsbn());
            ps.setString(4, stat.getTitle());
            ps.setString(5, stat.getReader_username());
            ps.addBatch();
        }
        int[] count = ps.executeBatch();
        System.out.println("insert " + count.length + " rows successfully.");
    }
}
