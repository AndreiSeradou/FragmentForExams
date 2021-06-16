package org.example.actor;

import org.example.entity.Documentimpl;
import org.example.util.Folder;

public interface Author {
    Documentimpl createDocument(Folder folder, String header, String context);
    void updateHeader(Documentimpl documentimpl, String newHeader);
    void updateContext(Documentimpl documentimpl, String newContext);
}
