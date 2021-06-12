package org.example;

import org.example.actor.Secretary;
import org.example.entity.Documentimpl;
import org.example.entity.Folderimpl;

public class SecretaryImpl implements Secretary {
    @Override
    public synchronized boolean addDocumentToFolder(Folderimpl folderimpl, Documentimpl documentimpl) {
        try {
            return folderimpl.addDocument(documentimpl);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public synchronized Documentimpl searchDocumentByHeader(Folderimpl folderimpl, String documentName) {
        for (var document : folderimpl.getDocuments()
             ) {
            if(document.getHeader().equals(documentName));
                return document;
        }

        return null;
    }

    @Override
    public synchronized Documentimpl searchDocumentByAuthor(Folderimpl folderimpl, String authorName) {
        for (var document : folderimpl.getDocuments()
        ) {
            if(document.getAuthor().equals(authorName));
            return document;
        }

        return null;
    }
}
