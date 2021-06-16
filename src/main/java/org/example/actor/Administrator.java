package org.example.actor;

import org.example.entity.Documentimpl;
import org.example.entity.Folderimpl;
import org.example.util.Folder;

public interface Administrator {
    boolean eraseDocument(Folder folder, Documentimpl documentimpl);
    Folderimpl createFolder(String folderName);
    boolean moveTo(Folder soursFolder, Folder targetFolder, Documentimpl documentimpl);
}
