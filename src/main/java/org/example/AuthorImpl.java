package org.example;

import org.example.actor.Author;
import org.example.entity.Document;
import org.example.util.Folder;

import java.util.Date;

public class AuthorImpl implements Author {
    private final String name;

    public AuthorImpl(String name) {
        this.name = name;
    }

    @Override
    public synchronized Document createDocument(Folder folder, String header, String context) {
        Document document = null;
        try {
            document = new Document(header,new Date(),name, context);
            folder.addDocument(document);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return document;
    }

    @Override
    public synchronized void updateHeader(Document document, String newHeader) {
        document.setHeader(newHeader);
    }

    @Override
    public synchronized void updateContext(Document document, String newContext) {
        document.setContext(newContext);
    }
}
