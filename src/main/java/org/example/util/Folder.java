package org.example.util;

import org.example.entity.Document;

public interface Folder {
    boolean addDocument(Document document);
    boolean removeDocument(Document document);
}
