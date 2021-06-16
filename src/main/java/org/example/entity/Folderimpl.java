package org.example.entity;

import org.example.util.Folder;

import java.util.List;
import java.util.Vector;

public class Folderimpl implements Folder {
    static final Folderimpl ROOT_FOLDERIMPL = new Folderimpl();

    String name;
    List<Document> documents;
    List<Folderimpl> folderimpls;

    public Folderimpl(){
        documents = new Vector<>();
        folderimpls = new Vector<>();
    }

    public boolean addDocument(Document document){
            for (var doc : documents
            ) {
                try {
                if (doc.getHeader().equals(document.getHeader()))
                        throw  new Exception("Document add error!!!");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
            }

        return documents.add(document);
    }

    public boolean removeDocument(Document document){
        return documents.remove(document);
    }

    public Folderimpl(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }

    public void setFolders(List<Folderimpl> folderimpls) {
        this.folderimpls = folderimpls;
    }

    public String getName() {
        return name;
    }

    public List<Document> getDocuments() {
        return documents;
    }

    public List<Folderimpl> getFolders() {
        return folderimpls;
    }
}
