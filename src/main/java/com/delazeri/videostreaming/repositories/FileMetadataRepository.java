package com.delazeri.videostreaming.repositories;

import com.delazeri.videostreaming.entities.FileMetadataEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileMetadataRepository extends JpaRepository<FileMetadataEntity, String> {
}
