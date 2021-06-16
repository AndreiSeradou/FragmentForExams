package org.example.actor;

import org.example.entity.Documentimpl;
import org.example.util.Folder;

public interface Secretary {
    boolean addDocumentToFolder(Folder folder, Documentimpl documentimpl);
    Documentimpl searchDocumentByHeader(Folder folder, String documentName);
    Documentimpl searchDocumentByAuthor(Folder folder, String authorName);
}
