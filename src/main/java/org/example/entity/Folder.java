package org.example.entity;

import java.util.List;
import java.util.Vector;

public class Folder {
    static final Folder rootFolder = new Folder();

    String name;
    List<Document> documents;
    List<Folder> folders;

    public Folder(){
        documents = new Vector<>();
        folders = new Vector<>();
    }

    public boolean addDocument(Document document) throws Exception {
        for (var doc : documents
             ) {
            if(doc.getHeader().equals(document.getHeader()))
                throw new Exception("");
        }

        return documents.add(document);
    }

    public boolean removeDocument(Document document){
        return documents.remove(document);
    }

    public Folder(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }

    public void setFolders(List<Folder> folders) {
        this.folders = folders;
    }

    public String getName() {
        return name;
    }

    public List<Document> getDocuments() {
        return documents;
    }

    public List<Folder> getFolders() {
        return folders;
    }
}
