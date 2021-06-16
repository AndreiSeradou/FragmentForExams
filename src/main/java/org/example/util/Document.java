package org.example.util;

import java.util.Date;

public interface Document {
    void setHeader(String header);
    void setCreateDate(Date createDate);
    void setAuthor(String author);
    void setContext(String context);
    public String getHeader();
    public Date getCreateDate();
    public String getAuthor();
    public String getContext();
}
