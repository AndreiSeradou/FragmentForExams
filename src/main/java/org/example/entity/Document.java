package org.example.entity;

import java.util.Date;

public class Document {
    String header;
    Date createDate;
    String author;
    String context;

    public Document(){
    }

    public Document(Folder folder, String header) throws Exception {
            folder.addDocument(this);
        this.header = header;
    }

    public Document(Folder folder, String header, String context) throws Exception {
        folder.addDocument(this);
        this.header = header;
        this.context = context;
    }

    public Document(Folder folder, String header, Date createDate, String author) throws Exception {
        folder.addDocument(this);
        this.header = header;
        this.createDate = createDate;
        this.author = author;
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
