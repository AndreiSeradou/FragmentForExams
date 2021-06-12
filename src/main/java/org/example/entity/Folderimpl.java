package org.example.entity;

import org.example.util.Folder;

import java.util.List;
import java.util.Vector;

public class Folderimpl implements Folder {
    static final Folderimpl ROOT_FOLDERIMPL = new Folderimpl();

    String name;
    List<Documentimpl> documentimpls;
    List<Folderimpl> folderimpls;

    public Folderimpl(){
        documentimpls = new Vector<>();
        folderimpls = new Vector<>();
    }

    public boolean addDocument(Documentimpl documentimpl){
        for (var doc : documentimpls
             ) {
            if(doc.getHeader().equals(documentimpl.getHeader()))
                 new Exception("");
        }

        return documentimpls.add(documentimpl);
    }

    public boolean removeDocument(Documentimpl documentimpl){
        return documentimpls.remove(documentimpl);
    }

    public Folderimpl(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDocuments(List<Documentimpl> documentimpls) {
        this.documentimpls = documentimpls;
    }

    public void setFolders(List<Folderimpl> folderimpls) {
        this.folderimpls = folderimpls;
    }

    public String getName() {
        return name;
    }

    public List<Documentimpl> getDocuments() {
        return documentimpls;
    }

    public List<Folderimpl> getFolders() {
        return folderimpls;
    }
}
