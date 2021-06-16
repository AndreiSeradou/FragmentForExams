package org.example;

import org.example.actor.Administrator;
import org.example.entity.Documentimpl;
import org.example.entity.Folderimpl;
import org.example.util.Folder;

public class AdministratorImpl implements Administrator {
    @Override
    public synchronized boolean eraseDocument(Folder folder, Documentimpl documentimpl) {
        return folder.removeDocument(documentimpl);
    }

    @Override
    public synchronized Folderimpl createFolder(String folderName) {
        return new Folderimpl(folderName);
    }

    @Override
    public synchronized boolean moveTo(Folder soursFolder, Folder targetFolder, Documentimpl documentimpl) {
        soursFolder.removeDocument(documentimpl);
        try {
            return targetFolder.addDocument(documentimpl);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
