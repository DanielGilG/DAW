package org.dgg.Komponisten.persistance.dao;

import org.dgg.Komponisten.domain.entity.Composer;

import java.util.List;

public interface ComposerDao {
    List<Composer> findAll();
    Composer findById();
}
