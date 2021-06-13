package org.example.entity;

import java.util.Date;

public class Document {
    String header;
    Date createDate;
    String author;
    String context;

    public Document(String header, Date createDate, String author, String context) throws Exception {
        this.header = header;
        this.createDate = createDate;
        this.author = author;
        this.context = context;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getHeader() {
        return header;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public String getAuthor() {
        return author;
    }

    public String getContext() {
        return context;
    }
}
