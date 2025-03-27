package org.dgg.Komponisten.persistance.repository;

import org.dgg.Komponisten.domain.entity.Composer;

import java.util.List;

public interface ComposerRepository {
    List<Composer> findAll();
    Composer findById();
}
