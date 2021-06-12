package org.example.actor;

import org.example.entity.Documentimpl;
import org.example.entity.Folderimpl;

public interface Administrator {
    boolean eraseDocument(Folderimpl folderimpl, Documentimpl documentimpl);
    Folderimpl createFolder(String folderName);
    boolean moveTo(Folderimpl soursFolderimpl, Folderimpl targetFolderimpl, Documentimpl documentimpl);
}
