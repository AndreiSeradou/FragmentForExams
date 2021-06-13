package org.example;

import org.example.actor.Secretary;
import org.example.entity.Document;
import org.example.entity.Folderimpl;
import org.example.util.Folder;

public class SecretaryImpl implements Secretary {
    @Override
    public synchronized boolean addDocumentToFolder(Folder folder, Document document) {
        try {
            return folder.addDocument(document);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public synchronized Document searchDocumentByHeader(Folderimpl folderimpl, String documentName) {
        for (var document : folderimpl.getDocuments()
             ) {
            if(document.getHeader().equals(documentName));
                return document;
        }

        return null;
    }

    @Override
    public synchronized Document searchDocumentByAuthor(Folderimpl folderimpl, String authorName) {
        for (var document : folderimpl.getDocuments()
        ) {
            if(document.getAuthor().equals(authorName));
            return document;
        }

        return null;
    }
}
