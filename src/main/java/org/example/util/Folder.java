package org.example.util;

import org.example.entity.Documentimpl;

public interface Folder {
    boolean addDocument(Documentimpl documentimpl);
    boolean removeDocument(Documentimpl documentimpl);
}
