package org.example;

import org.example.actor.Secretary;
import org.example.entity.Documentimpl;
import org.example.util.Folder;

public class SecretaryImpl implements Secretary {
    @Override
    public synchronized boolean addDocumentToFolder(Folder folder, Documentimpl documentimpl) {
        try {
            return folder.addDocument(documentimpl);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public synchronized Documentimpl searchDocumentByHeader(Folder folder, String documentName) {
        for (var document : folder.getDocuments()
             ) {
            if(document.getHeader().equals(documentName));
                return document;
        }

        return null;
    }

    @Override
    public synchronized Documentimpl searchDocumentByAuthor(Folder folder, String authorName) {
        for (var document : folder.getDocuments()
        ) {
            if(document.getAuthor().equals(authorName));
            return document;
        }

        return null;
    }
}
