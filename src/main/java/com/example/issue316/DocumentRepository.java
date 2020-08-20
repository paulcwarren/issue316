package com.example.issue316;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.versions.LockingAndVersioningRepository;

import java.util.Optional;

@RepositoryRestResource
public interface DocumentRepository extends JpaRepository<Document, Long>, LockingAndVersioningRepository<Document, Long> {

    @PreAuthorize("authenticated")
    @RestResource
    @Override
    <S extends Document> S save(S entity);

    @PreAuthorize("authenticated")
    @RestResource
    @Override
    Optional<Document> findById(Long id);

}
