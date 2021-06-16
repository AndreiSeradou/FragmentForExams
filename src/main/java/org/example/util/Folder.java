package org.example.util;

import org.example.entity.Document;
import org.example.entity.Folderimpl;

import java.util.List;

public interface Folder {
    boolean addDocument(Document document);
    boolean removeDocument(Document document);
    void setName(String name);
    void setDocuments(List<Document> documents);
    void setFolders(List<Folderimpl> folderimpls);
    List<Document> getDocuments();
    List<Folderimpl> getFolders();
    String getName();
   
}
