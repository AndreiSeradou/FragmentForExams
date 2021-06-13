package org.example.actor;

import org.example.entity.Document;
import org.example.util.Folder;

public interface Author {
    Document createDocument(Folder folder, String header, String context);
    void updateHeader(Document document, String newHeader);
    void updateContext(Document document, String newContext);
}
