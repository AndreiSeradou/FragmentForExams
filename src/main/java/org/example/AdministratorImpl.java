package org.example;

import org.example.actor.Administrator;
import org.example.entity.Document;
import org.example.entity.Folderimpl;
import org.example.util.Folder;

public class AdministratorImpl implements Administrator {
    @Override
    public synchronized boolean eraseDocument(Folder folder, Document document) {
        return folder.removeDocument(document);
    }

    @Override
    public synchronized Folderimpl createFolder(String folderName) {
        return new Folderimpl(folderName);
    }

    @Override
    public synchronized boolean moveTo(Folder soursFolder, Folder targetFolder, Document document) {
        soursFolder.removeDocument(document);
        try {
            return targetFolder.addDocument(document);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
