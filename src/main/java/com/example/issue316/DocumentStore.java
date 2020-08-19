package com.example.issue316;

import org.springframework.content.commons.renditions.Renderable;
import org.springframework.content.mongo.store.MongoContentStore;

public interface DocumentStore extends MongoContentStore<Document, String>, Renderable<Document> {
}
