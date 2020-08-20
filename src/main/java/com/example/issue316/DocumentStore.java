package com.example.issue316;

import org.springframework.content.commons.renditions.Renderable;
import org.springframework.content.commons.repository.AssociativeStore;
import org.springframework.content.commons.repository.ContentStore;
import org.springframework.content.rest.StoreRestResource;

@StoreRestResource(path = "content", linkRel = "content")
public interface DocumentStore  extends ContentStore<Document, String>, AssociativeStore<Document, String>, Renderable<Document> {
}
