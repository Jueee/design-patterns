package com.jueee.example02;

public class BookMySQLExecute extends AbstractMySQLExecute<Book> {

    @Override
    String buildSQL() {
        return "insert into book(`author`,`description`,`isbn`,`title`,`reader_username`) values(?, ?, ?, ?, ?)";
    }

    @Override
    protected void doInvoke(Book stat) throws Exception {
        ps.setString(1, stat.getAuthor());
        ps.setString(2, stat.getDescription());
        ps.setString(3, stat.getIsbn());
        ps.setString(4, stat.getTitle());
        ps.setString(5, stat.getReader_username());
        int count = ps.executeUpdate();
        System.out.println("insert " + count + " rows successfully.");
    }
}
