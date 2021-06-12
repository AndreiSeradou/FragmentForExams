package org.example.actor;

import org.example.entity.Documentimpl;
import org.example.entity.Folderimpl;

public interface Author {
    Documentimpl createDocument(Folderimpl folderimpl, String header, String context);
    void updateHeader(Documentimpl documentimpl, String newHeader);
    void updateContext(Documentimpl documentimpl, String newContext);
}
