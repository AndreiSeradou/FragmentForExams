package org.example.actor;

import org.example.entity.Document;
import org.example.entity.Folderimpl;
import org.example.util.Folder;

public interface Administrator {
    boolean eraseDocument(Folder folder, Document document);
    Folderimpl createFolder(String folderName);
    boolean moveTo(Folder soursFolder, Folder targetFolder, Document document);
}
