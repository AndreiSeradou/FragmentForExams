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
    public synchronized Document searchDocumentByHeader(Folder folder, String documentName) {
        for (var document : folder.getDocuments()
             ) {
            if(document.getHeader().equals(documentName));
                return document;
        }

        return null;
    }

    @Override
    public synchronized Document searchDocumentByAuthor(Folder folder, String authorName) {
        for (var document : folder.getDocuments()
        ) {
            if(document.getAuthor().equals(authorName));
            return document;
        }

        return null;
    }
}
