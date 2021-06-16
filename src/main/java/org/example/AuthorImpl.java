package org.example;

import org.example.actor.Author;
import org.example.entity.Documentimpl;
import org.example.util.Folder;

import java.util.Date;

public class AuthorImpl implements Author {
    private final String name;

    public AuthorImpl(String name) {
        this.name = name;
    }

    @Override
    public synchronized Documentimpl createDocument(Folder folder, String header, String context) {
        Documentimpl documentimpl = null;
        try {
            documentimpl = new Documentimpl(header,new Date(),name, context);
            folder.addDocument(documentimpl);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return documentimpl;
    }

    @Override
    public synchronized void updateHeader(Documentimpl documentimpl, String newHeader) {
        documentimpl.setHeader(newHeader);
    }

    @Override
    public synchronized void updateContext(Documentimpl documentimpl, String newContext) {
        documentimpl.setContext(newContext);
    }
}
