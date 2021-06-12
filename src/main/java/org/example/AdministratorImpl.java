package org.example;

import org.example.actor.Administrator;
import org.example.entity.Documentimpl;
import org.example.entity.Folderimpl;

public class AdministratorImpl implements Administrator {
    @Override
    public synchronized boolean eraseDocument(Folderimpl folderimpl, Documentimpl documentimpl) {
        return folderimpl.removeDocument(documentimpl);
    }

    @Override
    public synchronized Folderimpl createFolder(String folderName) {
        return new Folderimpl(folderName);
    }

    @Override
    public synchronized boolean moveTo(Folderimpl soursFolderimpl, Folderimpl targetFolderimpl, Documentimpl documentimpl) {
        soursFolderimpl.removeDocument(documentimpl);
        try {
            return targetFolderimpl.addDocument(documentimpl);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
