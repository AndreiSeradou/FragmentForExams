package org.example.actor;

import org.example.entity.Documentimpl;
import org.example.entity.Folderimpl;

public interface Secretary {
    boolean addDocumentToFolder(Folderimpl folderimpl, Documentimpl documentimpl);
    Documentimpl searchDocumentByHeader(Folderimpl folderimpl, String documentName);
    Documentimpl searchDocumentByAuthor(Folderimpl folderimpl, String authorName);
}
