package org.example.util;

import org.example.entity.Documentimpl;
import org.example.entity.Folderimpl;

import java.util.List;

public interface Folder {
    boolean addDocument(Documentimpl documentimpl);
    boolean removeDocument(Documentimpl documentimpl);
    void setName(String name);
    void setDocuments(List<Documentimpl> documentimpls);
    void setFolders(List<Folderimpl> folderimpl);
    List<Documentimpl> getDocuments();
    List<Folderimpl> getFolders();
    String getName();
   
}
