package org.example.actor;

import org.example.entity.Document;
import org.example.entity.Folder;

public interface Administrator {
    boolean eraseDocument(Folder folder, Document document);
    Folder createFolder(String folderName);
    boolean moveTo(Folder soursFolder, Folder targetFolder, Document document);
}
