package org.example.actor;

import org.example.entity.Document;
import org.example.entity.Folderimpl;
import org.example.util.Folder;

public interface Secretary {
    boolean addDocumentToFolder(Folder folder, Document document);
    Document searchDocumentByHeader(Folder folder, String documentName);
    Document searchDocumentByAuthor(Folder folder, String authorName);
}
